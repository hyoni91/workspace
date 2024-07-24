
//board table의 axios

import axios from "axios";

export function getBoardList(){
  const response = axios.get('/board/list')
  return response;
}

//글작성
export function getWiterInfo(data){
  const response = axios.post(`/board/insert`, data)
  return response;
}

//상세
export function getDetail(boardNum){
  const response = axios.get(`/board/detail/${boardNum}`)
  return response
}