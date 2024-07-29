import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';
import * as b_api from '../apis/b_api'
import * as r_api from '../apis/r_apis'
import ReplyFrom from './ReplyFrom';
import axios from 'axios';

function Detail({getLoginInfo}) {
  const navigate = useNavigate()
  const {boardNum} = useParams();
  console.log(getLoginInfo)
  const [boardDetail, setBoardDetail] = useState({
    createDate : '',
    memId :'',
    title: '',
    content : '',
    boardNum : ''
  })

  const [replyDetail, setReplyDetail] = useState([])

   //댓글 삭제 이후 재랜더링을 위한 useState
    const [replyRemove, setReplyRemove] = useState({})

  //detail페이지에 댓글 같이!
  const [reply, setReply] = useState({
    replyContent : '',
    memId :getLoginInfo.memId,
    boardNum :boardNum
  })

  function goInputReply(e){
    setReply({...reply,[e.target.name] : e.target.value })
  }

     //DB에서 데이터 조회 여러개 동시에 실행하기
    //axios.all([배열])  -> [배열안에 조회하고 싶은 axios.get()을 나열 하면 됨]
    useEffect(()=>{
      axios.all([b_api.getDetail(boardNum), r_api.getDetail2(boardNum)])
      .then((axios.spread((res1,res2)=>{
        setBoardDetail(res1.data)
        setReplyDetail(res2.data)
      })))
      .catch((error)=>{
        alert(error)
        console.log(error)
      })
    },[reply, replyRemove])
      


    //댓글등록
    function replyInsert(){
      r_api.goInsert(reply)
      .then((res)=>{
        //자동 새로고침
        //먼저 작성한 textarea태그 안의 내용을 지워주기 (자동새로고침 안했기때문에 적은 내용이 그대로 뜸)
        //textarea의 밸류값을 reply.replyContent로 주기 (초기값을 계속 공백으로)
        //추가 된 댓글이 화면에 바로 보이게 코드를 작성
        setReply({
          ...reply,
          replyContent : ''
        })
        
      })
      .catch((error)=>{
        alert(error)
        console.log(error)
      })
    }


    //댓글 삭제
    function replyDelete(replyNum){
      r_api.goDelete(replyNum)
      .then((res)=>{ 
        setReplyRemove({})
      })
      .catch((error)=>{
        alert(error)
        console.log(error)
      })
        
    }

    //해당 게시글과 모든 댓글 삭제
    function goDeleteBoard(){
      //댓글삭제
      axios.all([ r_api.goDeleteAll(boardNum)])
      .then((res)=>{
        //게시글 삭제
        b_api.goDelete(boardNum)
        navigate('/')
      })
      .catch()
    }

  return (
    <>
      <div className='detail-div'>
        <div>
            <h2>게시글 내용</h2>
            <div className='update-div'>
              <table className='detail-table'>
                  <tbody className='tbody-none'>
                    <tr>
                      <td>작성일</td>
                      <td>{boardDetail.createDate}</td>
                      <td>작성자</td>
                      <td>{boardDetail.memId}</td>
                    </tr>
                    <tr>
                      <td>제목</td>
                      <td colSpan={'3'}>{boardDetail.title}</td>
                    </tr>
                    <tr>
                      <td>내용</td>
                      <td colSpan={'3'}> {boardDetail.content}</td>
                    </tr>
                  </tbody>
              </table>
            </div>
            <div>
              <div></div>
            </div>
            <div className='detail-btn'><button className='btn' type='button' onClick={()=>navigate('/')}>뒤로가기</button>
            {/*  로그인 했을때만 수정 삭제 보이도록   */}
            { 
              getLoginInfo.memId == boardDetail.memId || getLoginInfo.memRole == 'ADMIN' ? 
                <>
                  <button className='btn' type='button' onClick={()=>navigate(`/boardUpdate/${boardDetail.boardNum}`)}>수정하기</button>
                  <button className='btn' type='button' onClick={()=>{
                    goDeleteBoard(boardNum)
                    }}>삭제하기</button>
                </>
                :
                <></>
                
            }
            
            </div>

          </div>
      </div>
        <div className='reply-div'>
          <h3>댓글정보</h3>
        <div className='reply-flex'>
          <div>  
          {/* 로그인 했을때 댓글 동륵 가능!  */}
            {
              getLoginInfo.memId != null?
              <>
                <textarea value={reply.replyContent} rows={'1'} cols={'50'} name='replyContent' placeholder='50자 이하로 작성하세요' onChange={(e)=>{goInputReply(e)}} />
                <button className='reply-btn' type='button' onClick={()=>{
                  replyInsert()
                  }} >등록</button>
              </>
              :
              <></>
            }
          </div>
        </div>
        {   
            replyDetail.length == 0 ?
              <>등록된 댓글이 없습니다.</>
              :
              replyDetail.map((reply,i)=>{
                return(
                  
                  <div key={i} className='reply-content'>
                    <div>{reply.replyDate}</div>
                    <div>{reply.memId}</div>
                    <div>{reply.replyContent} 
                  {
                    getLoginInfo.memId == reply.memId ||  getLoginInfo.memRole == 'ADMIN'  ?
                    <button className='reply-btn' type='button'onClick={(e)=>{
                      replyDelete(reply.replyNum, reply.memId)
                      
                    }} >삭제</button>
                    :
                    <></>
                  }    
                    </div>
                  </div>
                )
              })
              
            }
            
        </div>
    </>
  )
}

export default Detail;