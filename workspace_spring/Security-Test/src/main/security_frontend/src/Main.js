import axios from 'axios'
import React from 'react'
import { useNavigate } from 'react-router-dom'
import { securityApi } from './securityAxios'

const Main = () => {
  const navigate = useNavigate()

  //서버로 요청 시 요청 헤더에 토큰을 가져가는 코드 
  const test = () => {

    //헤더에 데이터 넣기
    axios.get("/getToken",{
      headers : {
        'Authorization' : localStorage.getItem('Authorization')
      }
    })
    .then((res)=>{

    })
    .catch((error)=>{
      console.log(error)
    })
  }

  //인증 + 인가에 따른 페이지 접근
  const test1 = ()=>{
    securityApi.get("/test1")
    .then((res)=>{
      console.log('접근 가능')
    })
    .catch((error)=>{
      console.log(error)
    })
  }
  const test2 = ()=>{
    securityApi.get("/test2")
    .then((res)=>{
      console.log('접근 가능')
    })
    .catch((error)=>{
        console.log(error)
    })

  }
  const test3 = ()=>{
    securityApi.get("/test3")
    .then((res)=>{
      console.log('접근 가능')
    })
    .catch((error)=>{
      console.log(error)
    })

  }
  const test4 = ()=>{
    securityApi.get("/test4")
    .then((res)=>{
      console.log('접근 가능')
    })
    .catch((error)=>{
      console.log(error)
    })

  }
  const test5 = ()=>{
    securityApi.get("/test5")
    .then((res)=>{
      console.log('접근 가능')
    })
    .catch((error)=>{
      console.log(error)
    })
  }

  return (
    <div>
      <h2>Main page</h2>
      <div>
          <button 
            className='token-btn' 
            type='button'
            onClick={()=>{test()}}>
              서버에 토큰 가져가기
          </button>
        </div>
      <div className='navi-btn'>
        <button 
          type='button'
          onClick={()=>{navigate("/loginForm")}}
        >
            로그인 페이지
        </button>
        <button 
          type='button'
          onClick={()=>{navigate("/joinForm")}}
        >
          회원가입 페이지
        </button>
        <div>
          <button type='button'>관리자 페이지</button>
          <button type='button'>일반회원 페이지</button>
        </div>
        <div className='testbtn'>
          <h2>인증 + 인가에 따른 페이지 전급</h2>
          <p><button type='button' onClick={()=>{test1()}} >누구나</button></p>
          <p><button type='button' onClick={()=>{test2()}}>인증된 사람</button></p>
          <p><button type='button' onClick={()=>{test3()}}>일반회원</button></p>
          <p><button type='button' onClick={()=>{test4()}}>관리자</button></p>
          <p><button type='button' onClick={()=>{test5()}}>매니저 | 관리자 </button></p>
        </div>
      </div>
        
    </div>
  )
}

export default Main