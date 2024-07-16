import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

const DetailBoard = ()=>{
  const {boardNum} = useParams()
  const [detail , setDetail] = useState({})
  const navigete = useNavigate();

  //상세조회
  useEffect(()=>{
    axios
    .get(`/detail/${boardNum}`)
    .then((res)=>{
      setDetail(res.data)
    })
    .catch((error)=>{})
  },[])

  //삭제데이터
  function goDelete (){
    axios
    .delete(`/delete/${boardNum}`)
    .then((res)=>{navigete('/')})
    .catch((error)=>{})
  }
  return(
    <>
      <h2>게시글 상세조회</h2>
      <table className="detail-table">
        <colgroup>
          <col width={'15%'}/>
          <col width={'10%'}/>
          <col width={'15%'}/>
          <col width={'20%'}/>
          <col width={'15%'}/>
          <col width={'*'}/>
        </colgroup>
        <tr>
          <td>글제목</td>
          <td>{detail.boardNum}</td>
          <td>작성자</td>
          <td>{detail.boardWriter}</td>
          <td>작성일</td>
          <td>{detail.createDate}</td>
        </tr>
        <tr>
          <td>제목</td>
          <td colSpan={'5'}>{detail.boardTitle}</td>
        </tr>
        <tr>
          <td>내용</td>
          <td colSpan={'5'}>{detail.boardContent}</td>
        </tr>
      </table>
      <button type="button" className="write-btn" onClick={()=>{
        navigete('/')
      }}>뒤로가기</button>
      <button type="button" className="write-btn" onClick={()=>{
        navigete(`/update/${boardNum}`)
      }}>수정하기</button>
      <button type="button" className="write-btn" onClick={()=>{
        goDelete()
      }}>삭제하기</button>
    </>
  )

}

export default DetailBoard;