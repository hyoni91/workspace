
//Member table의 axios

import axios from "axios";

//멤버등록(가입)
export function getRegMember(data){
  const response = axios.post('/member/join', data)
  return response;
}

//id중복검사 (해당 id값을 자바로 전달해서 쿼리에 조회되는지 확인)
export function checkId(inputId){
  const response = axios.get(`/member/idChk/${inputId}`)
  return response;
}

//login (input에서 id와 pw 두개의 값을 자바로 전달해야한다.)
//select 쿼리를 실행하지만 get이 아니어도 됨
//post는 데이터 전달에 유용하기 때문에 이럴땐 post사용 권장
export function goLogin(data){
  const response = axios.post(`/member/login`, data)
  return response;
}