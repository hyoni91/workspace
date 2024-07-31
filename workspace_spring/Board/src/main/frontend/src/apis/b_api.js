
//board table의 axios

import axios from "axios";

//글목록
export function getBoardList(pageNo){
  //pageNo는 현재 searchVO로 데이터를 받고 있기 때문에 객체로 들어옴.
  // pageNo만 받기위해? 객체 형태로 넘겨줌
  const response = axios.post('/board/list', {'pageNo':pageNo})
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