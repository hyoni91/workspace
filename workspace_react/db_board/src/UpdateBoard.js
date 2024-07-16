import axios from "axios";
import { useParams } from "react-router-dom";

const UpdateBoard = ()=>{
  const {boardNum} = useParams();
  console.log(boardNum)

  function goUpdate(){
    axios
    .put(`/updateBoard`, boardNum )
    .then()
    .catch()
  }

  return(
    <>
      <h2>수정 페이지</h2>
      <table className="detail-table">
        <tr>
          <td>글번호</td>
          <td></td>
          <td>작성자</td>
          <td></td>
          <td>작성일</td>
          <td></td>
        </tr>
        <tr>
          <td>제목</td>
          <td colSpan={'5'}><input type="text" name="boardTilte" /></td>
        </tr>
        <tr>
          <td>내용</td>
          <td colSpan={'5'}><textarea cols={'30'} rows={'5'} name="boardContent" /></td>
        </tr>
      </table>
      <button className="write-btn" type="button" onClick={()=>{
        goUpdate()
      }}>수정완료</button>
    </>
  )

}

export default UpdateBoard;