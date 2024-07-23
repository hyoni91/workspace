
//board table의 axios

import axios from "axios";

export function getBoardList(){
  const response = axios.get('/board/list')
  return response;
}