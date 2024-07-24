import React, { useState } from 'react'
import * as b_api from '../apis/b_api'
import { useNavigate } from 'react-router-dom';


function WirteFrom({getLoginInfo}) {
  const navigate = useNavigate()
  const [wirte, setWirte] = useState({
    memId : getLoginInfo.memId,
    title : '',
    content : ''
  });

  function getValue(e){
    setWirte({
      ...wirte,
      [e.target.name] : e.target.value
    })
  }

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
        }}>등록하기</button>
      </div>
    </>
    
  )
}

export default WirteFrom;