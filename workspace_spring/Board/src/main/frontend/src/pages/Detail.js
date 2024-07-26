import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';
import * as b_api from '../apis/b_api'
import * as r_api from '../apis/r_apis'
import ReplyFrom from './ReplyFrom';
import axios from 'axios';

function Detail({getLoginInfo}) {
  const navigate = useNavigate()
  const {boardNum} = useParams();

  
  const [boardDetail, setBoardDetail] = useState({
    createDate : '',
    memId :'',
    title: '',
    content : '',
    boardNum : ''
  })

  const [replyDetail, setReplyDetail] = useState([])

  //detail페이지에 댓글 같이!
  const [reply, setReply] = useState({
    memId :getLoginInfo.memId,
    boardNum :boardNum,
    replyContent : ''
  })

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
    },[])
      

    //댓글등록
    function replyInsert(){
      r_api.goInsert(reply)
      .then((res)=>{
        navigate(`/detail/${boardNum}`)
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
      })
      .catch((error)=>{
        alert(error)
        console.log(error)
      })
        
    }

  return (
    <>
      <div className='detail-div'>
        <div>
            <h2>게시글 내용</h2>
            <div className='update-div'>
              <table className='detail-table'>
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
                  <button className='btn' type='button'>삭제하기</button>
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
                <textarea rows={'1'} cols={'50'} name='replyContent' placeholder='50자 이하로 작성하세요' onChange={(e)=>{setReply({...reply,[e.target.name] : e.target.value })}} />
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
                  
                  <div className='reply-content'>
                    <div key={i}>{reply.replyDate}</div>
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