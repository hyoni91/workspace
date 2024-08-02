
import React, { useRef, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'
import './Join.css';
import { useDaumPostcodePopup } from 'react-daum-postcode';
import axios from 'axios';
import Modal from '../common/Modal';

const Join = () => {
  const navigate = useNavigate()

  //회원가입 버튼 여부
  const [isDisabled, setIsDisabled] = useState(true)

  //모달창 랜더링 여부
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

  //input태그를 참조하는 변수 
  const email_1 = useRef();
  const email_2 = useRef();

  //daum 주소 api 팝업창을 띄우기 위한 함수선언 
  const open =  useDaumPostcodePopup();

  //주소 검색 팝업창이 닫힐 때 실행되는 함수 
  function handleComplete(data){
    //우편 번호와 도로명주소 가져오기
    //input태그에 검색한 내용 넣어주기
    setJoinData(
      {
        ...joinData,
        post :  data.zonecode ,
        memAddr : data.roadAddress
      })
  }

  //주소 검색 클릭시 실행되는 함수 
  function handleClick(){
    open({onComplete : handleComplete});
  }

  //회원가입 정보
  const [joinData, setJoinData] = useState({
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

  console.log(joinData)
  
  function changeJoinData(e){
      if(e.target.name == 'memId'){
        setIsDisabled(true)
      }
      setJoinData({
        ...joinData,
        [e.target.name] : e.target.name != 'memEmail' ? 
                          e.target.value : 
                          email_1.current.value + email_2.current.value
      })
    }

    //id중복 확인
  function idChkBtn(){

    if(joinData.memId == ''){
      alert('아이디는 필수입력입니다.')
      return;
    }

    axios.get(`/api_member/idChk/${joinData.memId}`)
    .then((res)=>{
      const result = res.data;
      result? alert('이미 사용중인 아이디입니다.'): alert('사용 가능합니다.')

      if(!result){
        setIsDisabled(false)
      }
    })
    .catch((error)=>{
      console.log(error)
    })

  }



  //회원 가입 버튼 클릭 시 insert쿼리 실행하기
  function join(){

    if(joinData.memPw != joinData.comfirmPw){
      alert('비밀번호가 일치하지 않습니다.')
      return;
    }

    axios.post(`/api_member/join`, joinData)
    .then((res)=>{
      setIsShow(true)     
      navigate('/')
    
    })
    .catch((error)=>{
      console.log(error)
    })
  }


  return (
    <div className='joinpage'>
      {
        isShow? <Modal  content={setModalContent}   setIsShow={setIsShow}/> : null
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
                <input className='input-size' type='text' id='id' name='memId' onChange={(e)=>{changeJoinData(e)}}/>
              <button type='button' onClick={()=>{idChkBtn()}}>중복확인</button>
              </td>
            </tr>
            <tr>
              <td>비밀번호</td>
              <td><input type='password' name='memPw' onChange={(e)=>{changeJoinData(e)}}/></td>
            </tr>
            <tr>
              <td>비밀번호 확인</td>
              <td><input type='password' name='comfirmPw' onChange={(e)=>{changeJoinData(e)}}/></td>
            </tr>
            <tr>
              <td>이름</td>
              <td><input type='text' name='memName'onChange={(e)=>{changeJoinData(e)}}/></td>
            </tr>
            <tr>
              <td>연락처</td>
              <td><input type='text' name='memTel' placeholder='숫자만 입력하세요.' onChange={(e)=>{changeJoinData(e)}}/></td>
            </tr>
            <tr className='addr-boxsize'>
              <td>주소</td>
              <td>
                <input type='text' placeholder='우편번호' name='post'  value={joinData.post} readOnly={true} onChange={(e)=>{changeJoinData(e)}} onClick={handleClick} />
              <button type='button' onClick={handleClick}>검색</button>
                <p>
                  <input type='text' placeholder='주소' name='memAddr' value={joinData.memAddr} readOnly={true} onChange={(e)=>{changeJoinData(e)}} onClick={handleClick}/>
                  </p>
                <p>
                  <input type='text' placeholder='상세주소를 입력해 주세요.' name='addrDetail' onChange={(e)=>{changeJoinData(e)}}/>
                  </p>
              </td>
            </tr>
            <tr>
              <td>이메일</td>
              <td><input className='inputmail-size' type='text' name='memEmail' ref={email_1} onChange={(e)=>{changeJoinData(e)}}/>
                  <select className='select-size' name='memEmail' ref={email_2} onChange={(e)=>{changeJoinData(e)}} >
                    <option value={'@naver.com'} >naver.com</option>
                    <option value={'@gmail.com'}>gamail.com</option>
                    <option value={'@yahoo.co.kr'}>yahoo.co.kr</option>
                  </select>
              </td>
            </tr>
          </tbody>
        </table>
      <div className='btn-div'><button type='button' disabled={isDisabled} onClick={()=>{
        join()
        }}>회원가입</button>
      </div>
    </div>
    
  )
}

export default Join;