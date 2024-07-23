import React from 'react'

function WirteFrom() {
  return (
    <>
      <div className='content'>
        <h2>게시글 작성</h2>
        <table>
            <tr>
              <td>제목</td>
              <td><input type='text'/></td>
            </tr>
            <tr>
              <td>내용</td>
              <td><textarea cols={'35'} rows={'10'}/></td>
            </tr>
        </table>
        <button className='btn' type='button'>등록하기</button>
      </div>
    </>
    
  )
}

export default WirteFrom;