
const InsertBoard = ()=>{


  return(
    <>
      <h2>글 작성 화면</h2>
      <table className="insert-table">
        <tr>
          <td>제목</td>
          <td><input type="text" name="boardTitle" /></td>
        </tr>
        <tr>
          <td>작성자</td>
          <td><input type="text" name="boardWriter"/></td>
        </tr>
        <tr>
          <td>내용</td>
          <td><textarea cols={'23'} rows={'6'} name="boardContent" /></td>
        </tr>
      </table>
      <button className="write-btn" type="button">등록하기</button>
    </>
  )

}

export default InsertBoard;