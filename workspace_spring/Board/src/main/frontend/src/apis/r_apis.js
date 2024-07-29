//reply table의 axios

import axios from "axios";


//댓글 상세정보
export function getDetail2(boardNum){
  const response = axios.get(`/reply/detail/${boardNum}`)
  return response
}

//댓글등록
export function goInsert(data){
  const response = axios.post(`/reply/insert`, data)
  return response
}

//댓글삭제
export function goDelete(replyNum) {
  const response = axios.delete(`/reply/delete/${replyNum}`)
  return response
} 

//해당 게시글 댓글 모두 삭제
export function goDeleteAll(boardNum){
  const response = axios.delete(`/reply/deleteAll/${boardNum}`)
  return response
}