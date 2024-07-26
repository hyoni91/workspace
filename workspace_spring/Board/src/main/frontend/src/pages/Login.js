import React, { useState } from 'react'
import { json, useNavigate } from 'react-router-dom'
import * as api from '../apis/m_api'

function Login({setIsLogin}) {
  const navigate =useNavigate();
  //로그인 조회 state변수
  const [loginData, setLoginData] = useState({
    memId: '',
    memPw : ''
  })

  //로그인 정보 onChange입력받기
  function changeLoginData(e){
    setLoginData({
      ...loginData,
      [e.target.name] : e.target.value
    })
  }

  //로그인 버튼
  function login(){
    //id, pw 유효성 검사해야함(일단 생략)
    api.goLogin(loginData)
    .then((res)=>{

      //조회 결과 빈 값이 아니면 로그인 실행
      if(res.data != ''){
      //로그인 정보 저장하기(id,name,role)
      //주의점 : 세션스토리지는 비번 저장하면 다 털려융~~~~ 개발자모드로 보여유~~ 조회하지마!!!!!!!!!!!
      const loginInfo= {
        memId : res.data.memId,
        memName : res.data.memName,
        memRole : res.data.memRole
      }
  
      //main페이지에 재렌더링을 해주기 위해서 state 변수 값 주기
      setIsLogin(loginInfo);
      
      window.sessionStorage.setItem('loginInfo', JSON.stringify(loginInfo));
      //로그인 성공 후 게시글 목록 페이지로 이동
      navigate('/')
      
      //조회 결과 없으면 오류 메시지
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
    <div className='content'>
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
        <button className='btn' type='button' onClick={()=>{
          login()
          
          }}>로그인</button>
        <button className='btn' type='button'>회원가입</button>
      </div>
    </div>
  )
}

export default Login;