import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom';
import { getBoardList } from '../apis';
function BoardList() {
  const navigate = useNavigate();
  const [boardList, setBoardList] = useState([])

  useEffect(()=>{
    getBoardList()
    .then((res)=>{
      setBoardList(res.data)
    })
    .catch((error)=>{
      console.log(error)
      alert('error!')
    })
  },[])

  return (
    <>
      <div className='content'>
        <div className='login-div'>
          <span onClick={()=>{navigate('/login')}}>Login</span> 
          <span onClick={()=>{navigate('/join')}}>Join</span>
        </div>
        <h2>자유게시판</h2>
        <div className='serch-div'>
          <select>
            <option>제목</option>
            <option>??</option>
          </select>
          <input type='text'/>
          <button type='button'>검색</button>
        </div>
        <table className='table'>
          <thead>
            <tr>
              <td>No</td>
              <td>제목</td>
              <td>작성자</td>
              <td>작성일</td>
            </tr>
          </thead>
          <tbody>
            {
              boardList.length == 0 ?
              <tr>
                <td colSpan={'4'}>조회된 데이터가 없습니다.</td>
              </tr> 
              :
              boardList.map((board,i)=>{
                return(
                  <tr key={i}>
                    <td>{i+1}</td>
                    <td><span onClick={()=>{}}>{board.title}</span></td>
                    <td>{board.memId}</td>
                    <td>{board.createDate}</td>
                  </tr>
                )
              })
            }
          </tbody>
        </table>
        <div>
          <button className='list-btn' type='button'>작성하기</button>
          </div>
      </div>
    </>
  )
}

export default BoardList;