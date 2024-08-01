import React from 'react'
import './Login.css';

const Login = () => {

  return (
    <div>
      <table className='logintable'>
        <tbody>
          <tr>
            <td>아이디</td>
            <td><input type='text'/></td>
          </tr>
          <tr>
            <td>비밀번호</td>
            <td><input type='password'/></td>
          </tr>
        </tbody>
      </table>
      <div className='login-btn'>
        <button type='button'>로그인하기</button>
      </div>
    </div>
  )
}

export default Login;