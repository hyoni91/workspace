import React, { useState } from 'react'
import { useParams } from 'react-router-dom';

function Detail() {
  const {boardNum} = useParams();
  const [detail, setDetail] = useState({})

  return (
    <>
      <div className='detail-div'>
        <div>
            <h2>게시글 내용</h2>
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
                    <td colSpan={'3'}>제목</td>
                  </tr>
                  <tr>
                    <td>내용</td>
                    <td colSpan={'3'}>내용</td>
                  </tr>
              </table>
            </div>
            <div className='detail-btn'>
              <button className='btn' type='button'>뒤로가기</button>
              <button className='btn' type='button'>수정</button>
              <button className='btn' type='button'>삭제</button>
            </div>
          </div>
          <div className='reply-div'>
            {/* 댓글 나오도록 */}
          </div>
      </div>
    </>
  )
}

export default Detail;