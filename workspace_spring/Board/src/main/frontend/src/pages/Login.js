import React from 'react'
import { useNavigate } from 'react-router-dom'

function Login() {
  const navigate =useNavigate();
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
          <td><input type='text' placeholder='아이디를 입력하세요' name='memId'/></td>
        </tr>
        <tr>
          <td>비밀번호</td>
        </tr>
        <tr>
          <td><input type='password' placeholder='비밀번호를 입력하세요' name='memPw'/></td>
        </tr>
      </table>
      <div className='btn-div'>
        <button className='btn' type='button'>로그인</button>
        <button className='btn' type='button'>목록가기</button>
      </div>
    </div>
  )
}

export default Login;