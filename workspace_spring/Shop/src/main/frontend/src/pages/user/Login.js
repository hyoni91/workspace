import React, { useState } from 'react'
import './Login.css';
import * as m_api from '../../apis/m_api'
import Modal from './common/Modal';
import { useNavigate } from 'react-router-dom';


const Login = ({setIsLogin, isLogin}) => {
  const navigate = useNavigate()
//모달의 변수 {content, setIsShow, offBtn}전달해야함
  //로그인창 미입력시 모달창 띄우기 (setIsShow)
  const [ loginModal, setLoginModal] = useState(false)
  //로그인 성공 여부 모달창 띄우기(setIsShow)
  const [ afterLoginModal, setAfterLoginModal] = useState(false)

  //로그인 성공 여부 모달의 메세지
  // 로그인 성공 실패 여부 저장하는 변수와 메세지띄우는 함수
  const [isLoginSuccess, setIsLoginSuccess] = useState(false)
  function drawMdalContent(){
  return(
      isLoginSuccess ?  
    <div>로그인성공😎😎 <br /> 반갑습니다.</div>
    : 
    <div>로그인실패😭😭 <br /> 아이디나 비밀번호를 확인하세요.</div>
  )
}
//로그인후 모달칭 안의 확인 버튼 클릭시 실행되는 내용
function handleBtn(){
  if(isLoginSuccess){
    //로그인 권한 판단하려면? App.js에 있는 로그인 정보를 받아서 판단 가능
    if(isLogin.memRole == 'USER'){
      //로그인 정보가 일반 회원이면?
      navigate('/')
    }else if(isLogin.memRole == 'ADMIN'){
      //로그인 정보가 관리자라면?
      navigate('/admin/regItem')
    }
  }
}


  const [loginMem, setLoginMem] = useState({
    memId :'',
    memPw :'',
    memRole : ''
  })

  
  //onchange로 받을 로그인 데이터
  const handleInput = (e)=>{
    setLoginMem({
      ...loginMem,
      [e.target.name] : e.target.value
    })
  }

  //로그인 정보 조회 및 로그인
  const goLogin = ()=>{
    //id, pw값 입력하지 않으면 Modal경고창
    if(loginMem.memId == '' || loginMem.memPw == ''){
      //모달창 띄우기
      setLoginModal(true)
      return;
    }
    m_api.getLoginInfo(loginMem)
    .then((res)=>{
      //모달창
      setAfterLoginModal(true);
      if(res.data !=''){
        setIsLoginSuccess(true)
        const loginInfo = {
          memId : res.data.memId,
          memRole : res.data.memRole,
          memName : res.data.memName
        }
        window.sessionStorage.setItem('loginInfo', JSON.stringify(loginInfo))
        setIsLogin(loginInfo)
        navigate('/')
        
      }else{
        setIsLoginSuccess(false)
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
      {  /*//id, pw 미입력시 띄우는 모달창*/
        loginModal ? <Modal content={()=>{
        return(
        <div>
          오류😱😱😱😱<br />
          아이디와 비밀번호는 필수입니다. 
        </div>
        )
      }} setIsShow={setLoginModal} offbtn={()=>{}} /> : null
      }
      {   /* 로그인 성공 여부 모달창 (성공) */
        afterLoginModal ? <Modal content={drawMdalContent} setIsShow={setAfterLoginModal} offbtn={handleBtn} /> : null
      }
    </div>
  )
}

export default Login;