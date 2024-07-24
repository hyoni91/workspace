import React, { useState } from 'react'
import { json, useNavigate } from 'react-router-dom'
import * as api from '../apis/m_api'

function Login({setIsLogin}) {
  const navigate =useNavigate();

  //////////////////////////////////////////////////////////////////////////////////////////
  //localStorage & sessionStorage (새로고침을 해도 data를 보존)
  //문자열 데이터만 저장이 가능하다.
  // 데이터 set : window.sessionStorage.setItem(key,value);
  // 데이터 get : window.sessionStorage.getItem(key);
  // 데이터 remove : window.sessionStorage.removeItem(key);
  // 전제 테이터 clear : window.sessionStorage.clear();

  //sessionStorage에 데이터 입력
  window.sessionStorage.setItem('name','tata')
  window.sessionStorage.setItem('age','20')

  //객체 넣는 방법(json)
  const mem = {
    stuNum : 1,
    stuName : 'mang',
    score : 80
  }

  //이렇게 하면 객체의 상세정보가 안뜸! 
  window.sessionStorage.setItem('member', mem)

  // json:     JSON.stringify();
  window.sessionStorage.setItem('member', JSON.stringify(mem))
  // 애플리케이션 결과값 : 키 :member   값:	{"stuNum":1,"stuName":"mang","score":80}

  //객체 또는 배열을 Storage에 저장할 때 json 형태로 저장
  //json(JavaScript Object Notation) : 모든 언어에서 공통적으로 해석할 수 있는 자료형
  //즉, 자바스크립트의 객체를 문자화 시킨것!(문자열끼리는 다른 언어에서도 해석이 가능함)
  // {name : 'tata', age : 20 }  ->  "{name : 'tata', age : 20}"

  
  //sessionStorage에 데이터 읽기
  console.log(window.sessionStorage.getItem('name')) 
  //json으로 객체를 문자열로 바꾼 데이터 읽기 --> 이러면 모든 값이 문자열로 나옴
  console.log(window.sessionStorage.getItem('member')) 
  //그렇다면 문자열을 객체로 바꾸는 방법
  const jsonResult = JSON.parse(window.sessionStorage.getItem('member'));
  console.log(jsonResult)
  console.log(jsonResult.stuName)

  //////////////////////////////////////////////////////////////////////////////////////////


  

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

      //조회 결과 있으면  : 로그인 실행
      //조회 결과 없으면 (null) : 다시 로그인 시도
      console.log(res.data)
      if(res.data != ''){
      // alert('로그인 되었습니다.')

      //로그인이 가능하면sessionStorage에 로그인 정보 저장하기(id,name,role)
      //주의점 : 세션스토리지는 비번 저장하면 다 털려융~~~~ 개발자모드로 보여유~~ 조회하지마!!!!!!!!!!!
      const loginInfo= {
        memId : res.data.memId,
        memName : res.data.memName,
        memRole : res.data.memRole
      }
      window.sessionStorage.setItem('loginInfo', JSON.stringify(loginInfo));
    
      //main페이지에 재렌더링을 해주기 위해서 state 변수 값 주기
      setIsLogin(loginInfo);

      //로그인 성공 후 게시글 목록 페이지로 이동
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
    <div className='content'>
      {/* <div className='login-div'>
        <span onClick={()=>{navigate('/login')}}>Login</span> 
        <span onClick={()=>{navigate('/join')}}>Join</span>
      </div> */}
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