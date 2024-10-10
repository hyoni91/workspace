import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';

const Join = () => {
  const navigate = useNavigate()

  //회원정보 저장
  const [joinData, setJoinData] = useState({
    memId:'',
    memPw:'',
    memName:''
  });

  const changeJoinData = (e) => {
    setJoinData({
      ...joinData,
      [e.target.name] : e.target.value
    })
  }

  const join = () => {
    axios.post(`/member/join`, joinData)
    .then((res)=>{
      console.log('회원가입 성공')
    })
    .catch((error)=>{
      console.log(error)
    })
  }

  return (
    <div>
      <h2>회원가입</h2>
      <div>
        <input 
          type='text'
          name='memId'
          onChange={(e)=>{changeJoinData(e)}}
          placeholder='아이디'
        />
      </div>
      <div>
        <input 
          type='password'
          name='memPw'
          onChange={(e)=>{changeJoinData(e)}}
          placeholder='비밀번호'
        />
      </div>
      <div>
        <input 
          type='text'
          name='memName'
          onChange={(e)=>{changeJoinData(e)}}
          placeholder='이름'
        />
      </div>
      <div className='navi-btn'>
        <button type='button' onClick={()=>{join()}}>회원가입</button>
        <button type='button' onClick={()=>{navigate('/')}}>뒤로가기</button>
      </div>
    </div>
  )
}

export default Join