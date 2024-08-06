import React, { useState } from 'react'
import './Login.css';
import * as m_api from '../../apis/m_api'
import Modal from './common/Modal';
import { useNavigate } from 'react-router-dom';


const Login = ({setIsLogin}) => {
  const navigate = useNavigate()
  const [isShow, setIsShow] = useState(false)

  function loginModalContent(){
    return  <div>
    로그인 성공😍 <br />
    반갑습니다.
    </div>
  }

  function offModalBtn(){
    navigate('/')
  }


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
      //모달창
      setIsShow(true)
      if(res.data !=''){
        const loginInfo = {
          memId : res.data.memId,
          memRole : res.data.memRole,
          memName : res.data.memName
        }
        window.sessionStorage.setItem('loginInfo', JSON.stringify(loginInfo))
        setIsLogin(loginInfo)
        navigate('/')
        
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
      {
        isShow? <Modal setIsShow={setIsShow} content={loginModalContent} offbtn={offModalBtn}/> : null
      }
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