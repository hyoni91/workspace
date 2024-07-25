import React, { useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';
import * as r_api from '../apis/r_apis'

function ReplyFrom({getLoginInfo}) {
  const navigate = useNavigate()
  const {boardNum} = useParams()
  const [reply, setReply] = useState({
    memId :getLoginInfo.memId,
    boardNum :boardNum,
    replyContent:''
  })
  
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

  return (
    <>
      <h2>댓글 작성</h2>
      <div>내용</div>
      <div>{boardNum}</div> 
      <textarea cols={'20'} rows={'5'} name='replyContent' onChange={(e)=>{
        setReply({
          ...reply,
          [e.target.name] : e.target.value
        })
      }}/>
      <div><button type='button' onClick={()=>{replyInsert(reply)}}>댓글등록</button> </div>
    </>

    
  )
}

export default ReplyFrom;