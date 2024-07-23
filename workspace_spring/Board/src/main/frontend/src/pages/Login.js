import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom'
import * as api from '../apis/m_api'

function Login() {
  const navigate =useNavigate();
  const [loginData, setLoginData] = useState({
    memId: '',
    memPw : ''
  })

  function changeLoginData(e){
    setLoginData({
      ...loginData,
      [e.target.name] : e.target.value
    })
  }

  function login(){
    //id, pw 유효성 검사해야함(일단 생략)
    api.goLogin(loginData)
    .then((res)=>{
      //조회결과에 따라 로그인 실행
    })
    .catch((error)=>{
      alert('error!')
      console.log(error)
    })
    
  }


  return (
    <div className='content'>
      <div className='login-div'>
        <span onClick={()=>{navigate('/login')}}>Login</span> 
        <span onClick={()=>{navigate('/join')}}>Join</span>
      </div>
      <h2>로그인</h2>
      <table className='join-table'>
        <tr>
          <td>아이디</td>
        </tr>
        <tr>
          <td><input type='text' placeholder='아이디를 입력하세요.' name='memId' onChange={(e)=>{changeLoginData(e)}}/></td>
        </tr>
        <tr>
          <td>비밀번호</td>
        </tr>
        <tr>
          <td><input type='password' placeholder='비밀번호를 입력하세요.' name='memPw' onChange={(e)=>{changeLoginData(e)}} /></td>
        </tr>
      </table>
      <div className='btn-div'>
        <button className='btn' type='button' onClick={()=>{login()}}>로그인</button>
        <button className='btn' type='button'>목록가기</button>
      </div>
    </div>
  )
}

export default Login;