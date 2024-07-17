

const StuScoInfo = ()=>{
  return(
    <>
      <div className="stuinfo">
        <h3>성적 관리 페이지</h3>
        <table>
          <tr>
            <td>국어점수</td>
            <td><input type="text"/></td>
          </tr>
          <tr>
            <td>영어점수</td>
            <td><input type="text"/></td>
          </tr>
          <tr>
            <td>수학점수</td>
            <td><input type="text"/></td>
          </tr>
        </table>
        <button type="button">점수등록</button>
      </div>
    </>
  )
}

export default StuScoInfo;