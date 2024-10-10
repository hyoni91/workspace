import React from 'react'
import { useNavigate } from 'react-router-dom'

const Main = () => {
  const navigate = useNavigate()

  return (
    <div>
      <h2>Main page</h2>
      <h3>welcom to my page</h3>
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
      </div>
    </div>
  )
}

export default Main