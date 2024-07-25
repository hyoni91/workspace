import React from 'react'

function DetailSensei() {

  return (
  <div className='content'>
    <h2>게시글 내용</h2>
    <div className='update-div'>
      <table className='detail-table'>
        <tr>
          <td>작성일</td>
          <td>{}</td>
          <td>작성자</td>
          <td>{}</td>
        </tr>
        <tr>
          <td>제목</td>
          <td colSpan={'3'}>{}</td>
        </tr>
        <tr>
          <td>내용</td>
          <td colSpan={'3'}> {}</td>
        </tr>
      </table>
    </div>
    <div className='detail-btn'>
      <button className='btn' type='button' onClick={()=>navigate('/')}>뒤로가기</button>
      <button className='btn' type='button'>수정</button>
      <button className='btn' type='button'>삭제</button>
    </div>
  </div>
  )
}

export default DetailSensei;