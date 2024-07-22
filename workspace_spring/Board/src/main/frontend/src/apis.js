import axios from "axios"



  export function getBoardList(){
  const response = axios.get('/board/list')
  return response;
}


export function getRegMember(member){
  const response = axios.post('/member/join', member)
  return response;
}