import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

const BoardList = () => {
  //게시글 목록을 저장할 state변수
  const navigate = useNavigate();
  const [boardList, setBoardList ] = useState([]);
  
  //게시글 목록 조회
  useEffect(()=>{
    axios
    .get('/boardList')
    .then((res)=>{
      setBoardList(res.data)
    })
    .catch((error)=>{
      alert(`error!\n 콘솔 확인 요망`)
      console.log(error)
    });
  },[])


  return(
    <>
      <h2>게시글 목록</h2>
      <table className="list-table">
        <colgroup>
          <col width={'15%'}/>
          <col width={'20%'}/>
          <col width={'*'}/>
          <col width={'25%'}/>
        </colgroup>  
        <thead>
          <tr>
            <td>글번호</td>
            <td>제목</td>
            <td>작성자</td>
            <td>작성일</td>
          </tr>
        </thead>
        <tbody>
          {
            boardList.map((board,i)=>{
              return(
                <tr key={i}>
                  <td>{board.boardNum}</td>
                  <td><span className="title-sp" onClick={()=>{
                    navigate(`detail/${board.boardNum}`)
                  }}>{board.boardTitle}</span></td>
                  <td>{board.boardWriter}</td>
                  <td>{board.createDate}</td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
      <button className="write-btn" type="button" onClick={()=>{
        navigate(`/insertBoard`)
      }}>작성하기</button>
    </>
  )

}


export default BoardList;