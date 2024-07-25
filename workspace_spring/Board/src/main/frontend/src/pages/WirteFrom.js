import React, { useState } from 'react'
import * as b_api from '../apis/b_api'
import { useNavigate } from 'react-router-dom';


function WirteFrom({getLoginInfo}) {
  const navigate = useNavigate()
  //로그인 아이디 불러와서 초기값에 저장해두기
  const [wirte, setWirte] = useState({
    memId : getLoginInfo.memId,
    title : '',
    content : ''
  });

  //타이틀과, 내용 값 받아오기
  function getValue(e){
    setWirte({
      ...wirte,
      [e.target.name] : e.target.value
    })
  }

  //등록버튼 누르면 입력 실행
  function goInsert(wirte){
    b_api.getWiterInfo(wirte)
    .then((res)=>{
      navigate('/')
    })
    .catch((error)=>{})
  }

  return (
    <>
      <div className='content'>
        <h2>게시글 작성</h2>
        <table>
            <tr>
              <td>제목</td>
              <td><input type='text' name='title' onChange={(e)=>{
                getValue(e)
              }}/></td>
            </tr>
            <tr>
              <td>내용</td>
              <td><textarea cols={'35'} rows={'10'} name='content' onChange={(e)=>{getValue(e)}}/></td>
            </tr>
        </table>
        <button className='btn' type='button' onClick={()=>{
          goInsert(wirte)
          navigate('/')
        }}>등록하기</button>
      </div>
    </>
    
  )
}

export default WirteFrom;