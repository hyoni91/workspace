import axios from 'axios'
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom'
import { getRegMember } from '../apis';

function Join() {
  const navigate = useNavigate();
  const [member, setMember] = useState({})


  function getMember(e){
    setMember(
      {
        ...member,
        [e.target.name] : e.target.value
      }
    )
  }

  function regMember(){
    getRegMember(member)
    .then((res)=>{
      navigate('/login')
    })
    .catch((error)=>{
      console.log(error)
      alert('error!')
    })
  }

  return (
    <>
      <div className='content'>
        <div className='login-div'>
          <span onClick={()=>{navigate('/login')}}>Login</span> 
          <span onClick={()=>{navigate('/join')}}>Join</span>
        </div>
        <h2>회원가입</h2>
        <table className='join-table'>
          <tr>
            <td>아이디</td>
          </tr>
          <tr>
            <td>
              <input type='text' required placeholder='아이디를 입력하세요' name='memId' onChange={(e)=>{
                getMember(e)
              }}/>
              <button type='button'>중복확인</button>
            </td>
          </tr>
          <tr>
            <td>비밀번호</td>
          </tr>
          <tr>
            <td><input type='password' name='memPw' placeholder='비밀번호를 입력하세요.' required onChange={(e)=>{getMember(e)}}/></td>
          </tr>
          <tr>
            <td>비밀번호 확인</td>
          </tr>
          <tr>
            <td><input type='password' placeholder='비밀번호를 확인하세요.' required name='memPwCheck' /></td>
          </tr>
          <tr>
            <td>이름</td>
          </tr>
          <tr>
          <td><input type='text' placeholder='이름을 입력하세요.'  required name='memName' onChange={(e)=>{getMember(e)}}/></td>
          </tr>
          <tr>
            <td>성별</td>
          </tr>
          <tr>
          <td>
            <input type='radio' name='gender' value={'male'} onChange={(e)=>{getMember(e)}}/>남
            <input type='radio' name='gender' value={'female'} checked/>여
          </td>
          </tr>
        </table>
        <button type='button' className='btn' onClick={()=>{
          regMember()
        }}>회원가입</button>
      </div>
    </>
  )
}

export default Join;