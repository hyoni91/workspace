import axios from "axios";


//아이디 중복 검사 select
export function checkId(memId){
  const response = axios.get(`/member/isChkId/${memId}`)
  return response;
}

//회원가입 insert
export function getJoinInfo(data){
  const response = axios.post(`/member/join`, data)
  return response;
}

//로그인 조회 select
export function getLoginInfo(data){
  const response = axios.post(`/member/login`, data)
  return response;
}