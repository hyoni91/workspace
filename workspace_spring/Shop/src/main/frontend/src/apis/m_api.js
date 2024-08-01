import axios from "axios";


export function checkId(memId){
  const response = axios.get(`/member/isChkId/${memId}`)
  return response;
}

export function getJoinInfo(data){
  const response = axios.post(`/member/join`, data)
  return response;
}