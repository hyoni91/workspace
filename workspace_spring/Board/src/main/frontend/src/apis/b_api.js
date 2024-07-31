
//board table의 axios

import axios from "axios";

//글목록
export function getBoardList(){
  const response = axios.post('/board/list')
  return response;
}

//글작성
export function getWiterInfo(data){
  const response = axios.post(`/board/insert`, data)
  return response;
}

//게시글 상세
export function getDetail(boardNum){
  const response = axios.get(`/board/detail/${boardNum}`)
  return response
}

//게시글 삭제
export function goDelete(boardNum){
  const response = axios.delete(`/board/delete/${boardNum}`)
  return response
}

//게시글 수정
export function getBoardUpdate(data){
  const response = axios.put(`/board/update`, data)
  return response;
}