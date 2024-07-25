import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';
import { getBoardList } from '../apis/b_api';
import Login from './Login';


function BoardList({getLoginInfo}) {
  const navigate = useNavigate();
  
  //목록조회변수
  const [boardList, setBoardList] = useState([])
  //검색변수
  const [search,setSearch] = useState({
    searchKeyWord : 'TITLE',
    searchValue :''
  })
  //검색 정보 가져오기
  function getSearchValue(e){
    setSearch({
      ...search,
      [e.target.name] : e.target.value
    })
  }
  console.log(search)
  

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
          <div className='login-div' />
          <h2 className='main-h2'>자유게시판</h2>
          <div className='serch-div'>
            <select name='searchKeyWord' onChange={(e)=> getSearchValue(e)}>
              <option name={'title'} value={'TITLE'}  >제목</option>
              <option name={'memId'}  value={'MEM_ID'} >작성자</option>
            </select>
            <input type='text' name='searchValue'onChange={(e)=> getSearchValue(e)}/>
            <button type='button' onClick={()=>{}}  >검색</button>
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
                      <td>
                        {/* <span onClick={()=>{
                        navigate(`/detail/${board.boardNum}`)
                      }}>{board.title}
                      </span> */}
  
                      {/* 상세보기 (두개테이블) */}
                        <span onClick={()=>{
                        navigate(`/detail/${board.boardNum}`)
                      }}>{board.title}
                      </span>
                      </td>
                      <td>{board.memId}</td>
                      <td>{board.createDate}</td>
                    </tr>
                  )
                })
              }
            </tbody>
          </table>
          {
            getLoginInfo != null ?
            <button className='list-btn' type='button' onClick={()=>{ navigate('/wirteForm')}}>작성하기</button>
            :
            <></>
          }
          
        </div>
      </>
  )
}

export default BoardList;