//reply table의 axios

import axios from "axios";

function getDetail2(boardNum){
  const response = axios.get(`/reply/detail/${boardNum}`)
  return response
}