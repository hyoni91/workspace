
import React, { useState } from 'react'
import * as m_api from '../../apis/m_api'
import { useParams } from 'react-router-dom'
import './Join.css';

const Join = () => {
  const [joinInfo, setJoinInfo] = useState({
    memId :'',
    memPw :'',
    comfirmPw:'',
    memName: '',
    memTel:'',
    post:'',
    memAddr:'',
    addrDetail:'',
    memEmail:'',
    memEmailDetail:'naver.com'
  })
  console.log(joinInfo)
  const [isDisabled, setIsDisabled] = useState(true)

  function changeInfo(e){

    if(e.target.name == 'memId'){
      setIsDisabled(true)
    }

    setJoinInfo({
      ...joinInfo,
      [e.target.name] : e.target.value
    })
  }

  //id 중복 체크
  function chkId(){

    if(joinInfo.memId == ''){
      alert('아이디는 필수 입력입니다.')
      return;
    }

    m_api.checkId(joinInfo.memId)
    .then((res)=>{
      const result = res.data;
      result? alert('사용 중인 아이디입니다.'): alert('사용 가능한 아이디입니다.')

      if(!result){
        setIsDisabled(false)
      }
    })
    .catch((error)=>{
      alert("error")
      console.log(error)
    })
  }

  //가입 
  function goJoin(){
    if(joinInfo.memPw != joinInfo.comfirmPw){
      alert('비밀번호가 일치하지 않습니다.')
      return;
    }

    m_api.getJoinInfo(joinInfo)
    .then((res)=>{})
    .catch((error)=>{
      alert('error')
      console.log(error)
    })

    
  }


  return (
    <div className='joinpage'>
        <table className='jointable'>
          <colgroup>
            <col width={'20%'}/>
            <col width={'*'}/>
          </colgroup>
          <tbody>
            <tr>
              <td>아이디</td>
              <td>
                <input className='input-size' type='text' name='memId' onChange={(e)=>{changeInfo(e)}}/>
              <button type='button'  onClick={()=>{ chkId()}}>중복확인</button>
              </td>
            </tr>
            <tr>
              <td>비밀번호</td>
              <td><input type='password' name='memPw' onChange={(e)=>{changeInfo(e)}}/></td>
            </tr>
            <tr>
              <td>비밀번호 확인</td>
              <td><input type='password' name='comfirmPw' onChange={(e)=>{changeInfo(e)}}/></td>
            </tr>
            <tr>
              <td>이름</td>
              <td><input type='text' name='memName'onChange={(e)=>{changeInfo(e)}}/></td>
            </tr>
            <tr>
              <td>연락처</td>
              <td><input type='text' name='memTel' placeholder='숫자만 입력하세요.' onChange={(e)=>{changeInfo(e)}}/></td>
            </tr>
            <tr className='addr-boxsize'>
              <td>주소</td>
              <td>
                <input type='text' placeholder='우편번호' name='post' onChange={(e)=>{changeInfo(e)}} />
              <button>검색</button>
                <p>
                  <input type='text' placeholder='주소' name='memAddr' onChange={(e)=>{changeInfo(e)}}/>
                  </p>
                <p>
                  <input type='text' placeholder='상세주소' name='addrDetail' onChange={(e)=>{changeInfo(e)}}/>
                  </p>
              </td>
            </tr>
            <tr>
              <td>이메일</td>
              <td><input className='inputmail-size' type='text' name='memEmail' onChange={(e)=>{changeInfo(e)}}/>
                  <select className='select-size' name='memEmailDetail' onChange={(e)=>{changeInfo(e)}} >
                    <option value={'naver.com'} >naver.com</option>
                    <option value={'gmail.com'}>gamail.com</option>
                    <option value={'yahoo.co.kr'}>yahoo.co.kr</option>
                  </select>
              </td>
            </tr>
          </tbody>
        </table>
      <div className='btn-div'><button type='button' disabled={isDisabled} onClick={()=>{goJoin(joinInfo)}}>회원가입</button></div>
    </div>
    
  )
}

export default Join;