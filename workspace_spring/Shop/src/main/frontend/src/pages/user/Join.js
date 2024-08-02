
import React, { useRef, useState } from 'react'
import * as m_api from '../../apis/m_api'
import { useNavigate, useParams } from 'react-router-dom'
import './Join.css';
import { useDaumPostcodePopup } from 'react-daum-postcode';
import Modal from './common/Modal';

const Join = () => {
  const naviget = useNavigate();
  //모달창 여부
  const [isShow, setIsShow] = useState(false)

   //모달창 안의 내용을 생성하는 함수 
  function setModalContent(){
    return(
      <div>
        환영합니다😍 <br />
        회원가입을 축하합니다.
        </div>
    )
  }


  // input태그 참조 변수
  const email_1 = useRef();
  const email_2 = useRef();

  const [joinInfo, setJoinInfo] = useState({
    memId :'',
    memPw :'',
    comfirmPw:'',
    memName: '',
    memTel:'',
    post:'',
    memAddr:'',
    addrDetail:'',
    memEmail:''
  })
  console.log(joinInfo)

  //회원가입 버튼 
  const [isDisabled, setIsDisabled] = useState(true)

  //주소 팝업 (다음주소)
  const open = useDaumPostcodePopup();

  //주소 입력후 팝업창 닫힐 때 실행 되는 함수
  function handleComplete(data){
    setJoinInfo({
      ...joinInfo,
      post:data.zonecode,
      memAddr : data.roadAddress
    })
  }

  //주소 검색 클릭 시 실행되는 함수 
  function handleClick(){
    open({onComplete : handleComplete})
  }


  function changeInfo(e){

    if(e.target.name == 'memId'){
      setIsDisabled(true)
    }

    setJoinInfo({
      ...joinInfo,
      [e.target.name] : e.target.name != 'memEmail'? 
                        e.target.value :
                        email_1.current.value + email_2.current.value
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
    .then((res)=>{
      naviget('/')
    })
    .catch((error)=>{
      alert('error')
      console.log(error)
    })

    
  }


  return (
    <div className='joinpage'>
      {
        isShow? <Modal content={setModalContent} setIsShow={setIsShow}  /> : null
      }
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
                <input type='text' placeholder='우편번호' readOnly name='post' value={joinInfo.post} onChange={(e)=>{changeInfo(e)}} onClick={handleClick} />
              <button type='button' onClick={handleClick}>검색</button>
                <p>
                  <input type='text' placeholder='주소' readOnly name='memAddr' value={joinInfo.memAddr} onChange={(e)=>{changeInfo(e)}} onClick={handleClick} />
                  </p>
                <p>
                  <input type='text' placeholder='상세주소' name='addrDetail' onChange={(e)=>{changeInfo(e)}}/>
                  </p>
              </td>
            </tr>
            <tr>
              <td>이메일</td>
              <td><input className='inputmail-size' type='text' ref={email_1} name='memEmail' onChange={(e)=>{changeInfo(e)}}/>
                  <select className='select-size' ref={email_2} name='memEmail' onChange={(e)=>{changeInfo(e)}} >
                    <option value={'@naver.com'} >naver.com</option>
                    <option value={'@gmail.com'}>gamail.com</option>
                    <option value={'@yahoo.co.kr'}>yahoo.co.kr</option>
                  </select>
              </td>
            </tr>
          </tbody>
        </table>
      <div className='btn-div'><button type='button' disabled={isDisabled} onClick={()=>{goJoin(joinInfo); setIsShow(true) }}>회원가입</button></div>
    </div>
    
  )
}

export default Join;