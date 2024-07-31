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

  //페이지 인포 변수
  const [pageInfo, setPageInfo] = useState({})

  //for문은 return문 밖에 적어야하므로 함수로 만들어서 호츨 시키기
  function forPageInfo(){
    const pageNo=[];
    for(let i=pageInfo.startPageNo; i < pageInfo.endPageNo+1 ; i++){
      pageNo.push(<span key={i} onClick={(e)=>{getList(i)}} >{i}</span>)
    }
    return pageNo;
  }

  //paging한 페이지 번호를 클릭하면 다시 게시글을 조회하는 기능
  function getList(pageNo){
    //매개변수로 pagin번호를 넘겨준다.
    getBoardList(pageNo)
    .then((res)=>{
      setBoardList(res.data.boardList);
      setPageInfo(res.data.pageInfo);
    })
    .catch((error)=>{
      alert(error)
      console.log(error)
    })
  }


  //목록화면
  useEffect(()=>{
    getBoardList(1)
    .then((res)=>{
      setBoardList(res.data.boardList)
      setPageInfo(res.data.pageInfo)
    })
    .catch((error)=>{
      console.log(error)
      alert('error!')
    })
  },[])

  //검색 정보 가져오기
  function getSearchValue(e){
    setSearch({
      ...search,
      [e.target.name] : e.target.value
    })
  }

//검색함수
function goSearch(){
  getBoardList()
  .then((res)=>{ 
    setBoardList(res.data)
  })
  .catch((error)=>{
    alert(error)
    console.log(error)
  })
}

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
            <button type='button' onClick={()=>{goSearch()}} >검색</button>
          </div>
          <table className='table'>
            <thead>
              <tr>
                <td>No</td>
                <td>글번호</td>
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
                      <td>{boardList.length-i}</td>
                      <td>{board.boardNum}</td>
                      <td>
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
          
          <div className='pageNo-span'>
          {
              pageInfo.prev != false? <span onClick={()=>{getList(pageInfo.startPageNo-1)}}>prev</span>: <></>
          }
            {forPageInfo()}
            {
              pageInfo.next != false? <span onClick={()=>{getList(pageInfo.endPageNo+1)}}>next</span>: <></>
            }
          </div>
        </div>
      </>
  )
}

export default BoardList;