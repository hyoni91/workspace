import React, { useEffect, useState } from 'react'
import { useParams } from 'react-router-dom';
import * as b_api from '../apis/b_api'
import * as r_api from '../apis/r_apis'

function Detail() {
  const {boardNum} = useParams();
  console.log(boardNum)

  const [boardDetail, setBoardDetail] = useState({
    createDate : '',
    memId :'',
    title: '',
    content : '',
    boardNum : ''
  })

  const [replyDetail, setReplyDetail] = useState({
    replyDate: '',
    memId : '',
    replyContent :'',
    boardNum : ''
  })

  useEffect(()=>{
    b_api.getDetail(boardNum)
    .then((res)=>{
      setBoardDetail(res.data)
      console.log(res.data)
    })
    .catch((error)=>{
      alert('error!!')
      console.log(error)
    })
  })  

 

  return (
    <>
      <div className='detail-div'>
        <div>
            <h2>게시글 내용</h2>
            <div className='update-div'>
              <table>
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
                    <td colSpan={'3'}>{boardDetail.content}</td>
                  </tr>
              </table>
            </div>
            <div>
              <div></div>
            </div>
            <div className='detail-btn'>
              <button className='btn' type='button'>뒤로가기</button>
              <button className='btn' type='button'>수정</button>
              <button className='btn' type='button'>삭제</button>
            </div>
          </div>
          <div className='reply-div'>
            {/* 댓글 나오도록 */}
          </div>
      </div>
    </>
  )
}

export default Detail;