import axios from 'axios'
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom'

const Login = () => {
  const navigate = useNavigate()
  //로그인 정보 저장
  const [loginData, setLoginData] = useState({
    memId:'',
    memPw: ''
  })

  const changeLoginData = (e) => {
    setLoginData({
      ...loginData,
      [e.target.name] : e.target.value
    })
  }

  const login = () => {
    axios.post(`/member/login`, loginData)
    .then((res)=>{
      console.log(res)
      alert('✨🎉🎊🎇🎆')
      navigate('/')
    })
    .catch((error)=>{
      console.log(error)
    })
  }

  //아이디와 비밀번호 input태그의 name속성은 
  //반드시 자바의 LoginFilter 클래스 생성자 안에서 설정한 파라메터 이름으로 지정해야 한다.
  return (
    <div>
      <h2>로그인</h2>
      <div>
        <input 
          type='text'
          name='memId'
          onChange={(e)=>{changeLoginData(e)}}
          placeholder='아이디'
        />
      </div>
      <div>
        <input 
          type='password'
          name='memPw'
          onChange={(e)=>{changeLoginData(e)}}
          placeholder='비밀번호'
        />
      </div>
      <div className='navi-btn'>
        <button type='button' onClick={()=>{login()}}>로그인</button>
        <button type='button' onClick={()=>{navigate('/joinForm')}}>회원가입</button>
      </div>
    </div>
  )
}

export default Login