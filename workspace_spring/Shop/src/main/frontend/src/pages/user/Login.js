import React, { useState } from 'react'
import './Login.css';
import * as m_api from '../../apis/m_api'


const Login = () => {
  const [loginMem, setLoginMem] = useState({
    memId :'',
    memPw :'',
    memRole : ''
  })

  console.log(loginMem)
  
  //onchange로 받을 로그인 데이터
  const handleInput = (e)=>{
    setLoginMem({
      ...loginMem,
      [e.target.name] : e.target.value
    })
  }

  //로그인 정보 조회 및 로그인
  const goLogin = ()=>{
    m_api.getLoginInfo(loginMem)
    .then((res)=>{
      if(res.data !=''){
        alert('로그인가능')
        const loginInfo = {
          memId : res.data.memId,
          memRole : res.data.memRole,
          memName : res.data.memName
        }

        window.sessionStorage.setItem('loginInfo', JSON.stringify(loginInfo))

      }else{
        alert('아이디 혹은 비밀번호가 일치하지 않습니다.')
      }
    })
    .catch((error)=>{
      alert('error!')
      console.log(error)
    })
  }


  return (
    <div>
      <table className='logintable'>
        <tbody>
          <tr>
            <td>아이디</td>
            <td><input type='text' name='memId' onChange={(e)=>{handleInput(e)}}/></td>
          </tr>
          <tr>
            <td>비밀번호</td>
            <td><input type='password' name='memPw' onChange={(e)=>{handleInput(e)}}/></td>
          </tr>
        </tbody>
      </table>
      <div className='loginbtn-div'>
        <button type='button' className='login-btn' onClick={()=>{goLogin(loginMem)}}>로그인하기</button>
      </div>
    </div>
  )
}

export default Login;