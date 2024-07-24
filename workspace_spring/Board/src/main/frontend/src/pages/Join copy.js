import axios from 'axios'
import React, { useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'
import * as api from '../apis/m_api'

function Joincopy() {
  const navigate = useNavigate();

    //input 밸류값 저장할 state변수
    //gender은 초기값을 줬기 때문에 거기에 맞춰서 초기값 넣어주기
    const [member, setMember] = useState({
      memId : ''
      ,memPw :''
      ,confirmPw:''
      ,memName :''
      ,gender : 'female'
  })

  //가입버튼 활성화 여부 state변수
  const [isDisabled, setIsDisabled] = useState(true)


  //onchage로 input 밸류 값 저장하는 함수
  function getMember(e){

    //id의 input 밸류 값이 변경되면, 가입 버튼을 비활성화
    // e.target.name의 값이 memId일 경우 밸류값의 변경이 있었다는 뜻
    if(e.target.name == 'memId'){
      setIsDisabled(true)
    }
    setMember(
      {
        ...member,
        [e.target.name] : e.target.value
      }
    )
  }

  //id중복확인
  function checkId (){

    //아이디 빈 칸의 경우 입력해달라고 메세지 띄우기
    if(member.memId == ''){
      alert('ID입력 필수')
      return;
    }

    //input의 id밸류 값을 가지고 자바로 가서 중복 확인 쿼리 실행
    api.checkId(member.memId)
    .then((res)=>{
      const result = res.data;
      result? alert('id 중복') : alert('사용가능')

      // 사용이 가능할 경우 가입버튼 활성화
      if(!result){
        setIsDisabled(false);
      } 
    })
    .catch((error)=>{
      alert('error!')
      console.log(error)
    })
  }

  //가입 버튼 누르면 member의 data가지고 db에 저장해주기 
  function regMember(){
    //validation (유효성 검사) 비번 일치하는지
    if(member.memPw != member.confirmPw){
      alert('비밀번호가 일치하지 않습니다.')
      return;
    }

    //아이디는 4~8자 
    const idLength = member.memId.length
    if(idLength < 4 || idLength  > 8){
      alert('아이디는 4~8자 사이로 작성하세요')
      return;
    }


    api.getRegMember(member)
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
        <div className='joindiv'>
            <div className='id'>
              <label>아이디</label>
                <input type='text' required placeholder='아이디를 입력하세요' name='memId' onChange={(e)=>{
                  getMember(e)
                }}/>
                <button className='checkBtn' type='button' onClick={()=>{
                  checkId()
                }}>중복확인</button>
            </div>
            <div className='pw'>
              <label>비밀번호</label>
              <input type='password' name='memPw' placeholder='비밀번호를 입력하세요.' required onChange={(e)=>{getMember(e)}}/>
            </div>
            <div className='pwchk'>
              <label>비밀번호 확인</label>
              <input type='password' placeholder='비밀번호를 확인하세요.' required name='confirmPw' onChange={(e)=>{getMember(e)}} />
            </div>
            <div className='name'>
              <label>이름</label>
            <input type='text' placeholder='이름을 입력하세요.'  required name='memName' onChange={(e)=>{getMember(e)}}/>
            </div>
            <div className='gender'>
              <label>성별</label>
              <input className='radio' type='radio' name='gender' value={'male'} checked={member.gender == 'male'} onChange={(e)=>{getMember(e)}}/>남
              <input className='radio'  type='radio' name='gender' value={'female'} checked={member.gender == 'female'} onChange={(e)=>{getMember(e)}} />여
            </div>
        </div>
        <button type='button' className='joinbtn' disabled={isDisabled} onClick={()=>{
          regMember()
        }}>가입하기</button>
      </div>
    </>
  )
}

export default Joincopy;