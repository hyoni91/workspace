import React, { useEffect, useState } from 'react'
import * as b_api from '../apis/b_api'
import { useNavigate, useParams } from 'react-router-dom'
import axios from 'axios';

function Update() {
  const {boardNum} =  useParams();
  const navigate = useNavigate()
  const [update, setUpdate] = useState({
    createDate : '',
    memId :'',
    title: '',
    content : ''
  })
  //게시글 수정 전 정보
  useEffect(()=>{
    b_api.getDetail(boardNum)
    .then((res)=>{
      setUpdate(res.data)
    })
    .catch((error)=>{
      alert(error)
      console.log(error)
    })
  },[])

  //수정 정보
  function updateBoard(e){
    setUpdate({
      ...update,
      [e.target.name] : e.target.value
    })
  }

  console.log(update)
  //게시글 수정
  function goUpdateBoard(){
    b_api.getBoardUpdate(update)
    .then((res)=>{
      navigate('/')
    })
    .catch((error)=>{
      alert(error)
      console.log(error)
    })
  }



  

  return (
    <div className='detail-div'>
            <div>
              <h2>수정하기</h2>
              <div className='update-div'>
                <table>
                    <tbody className='tbody-none'>
                      <tr>
                        <td>작성일</td>
                        <td>{update.createDate}</td>
                        <td>작성자</td>
                        <td>{update.memId}</td>
                      </tr>
                      <tr>
                        <td>제목</td>
                        <td colSpan={'3'}><input className='update-input' type='text' defaultValue={update.title} onChange={(e)=>{updateBoard(e)}}/></td>
                      </tr>
                      <tr>
                        <td>내용</td>
                        <td colSpan={'3'}><textarea cols={'30'} rows={'5'} defaultValue={update.content} onClick={(e)=>{updateBoard(e)}} /></td>
                      </tr>
                    </tbody>
                </table>
              </div>
              <div className='detail-btn'>
                <button className='btn' type='button'>뒤로가기</button>
                <button className='btn' type='button' onClick={(e)=>{goUpdateBoard(update)}} >수정</button>
              </div>
            </div>
      </div>
  )
}

export default Update;