import axios from "axios";
import { useState } from "react";
import { useParams } from "react-router-dom";

const UpdateBoard = ()=>{
  const {boardNum} = useParams();
  console.log(boardNum)
  //글 수정 value값
  const [updateData, setUpdateData] = useState({

  })
  console.log(updateData)
  
  function goUpdate(){
    axios
    .put(`/updateBoard`)
    .then((res)=>{
      console.log(res.data)
    })
    .catch((error)=>{
      console.log('오류발생')
      console.log(error)
    })
  }

  return(
    <>
      <h2>수정 페이지</h2>
      <table className="detail-table">
          <tr>
            <td>글번호</td>
            <td>{boardNum}</td>
            <td>작성자</td>
            <td></td>
            <td>작성일</td>
            <td></td>
          </tr>
          <tr>
            <td>제목</td>
            <td colSpan={'5'}><input type="text" name="boardTilte" onChange={(e)=>{
              setUpdateData({
                ...UpdateBoard,
                [e.target.name] : e.target.value
              })
            }}></input></td>
          </tr>
          <tr>
            <td>내용</td>
            <td colSpan={'5'}><textarea cols={'30'} rows={'5'} name="boardContent" onChange={(e)=>{
              setUpdateData({
                ...UpdateBoard,
                [e.target.name] : e.target.value
              })
            }} /></td>
          </tr>
      </table>
      <button className="write-btn" type="button" onClick={()=>{
        goUpdate()
      }}>수정완료</button>
    </>
  )

}

export default UpdateBoard;