
import React from 'react'

function Update() {
  return (
    <div className='detail-div'>
            <div>
              <h2>수정하기</h2>
              <div className='update-div'>
                <table>
                    <tr>
                      <td>작성일</td>
                      <td>작성일</td>
                      <td>작성자</td>
                      <td>작성자</td>
                    </tr>
                    <tr>
                      <td>제목</td>
                      <td colSpan={'3'}><input className='update-input' type='text'/></td>
                    </tr>
                    <tr>
                      <td>내용</td>
                      <td colSpan={'3'}><textarea cols={'30'} rows={'5'} /></td>
                    </tr>
                </table>
              </div>
              <div className='detail-btn'>
                <button className='btn' type='button'>뒤로가기</button>
                <button className='btn' type='button'>수정</button>
              </div>
            </div>
      </div>
  )
}

export default Update;