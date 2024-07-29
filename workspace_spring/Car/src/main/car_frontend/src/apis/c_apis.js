import axios from "axios";


// 차량 등록
export function postInfo(data){
  const res = axios.post(`/car/insert`, data);
  return res;
}

// 차량 목록
export function carList(){
  const res = axios.get('/car/select')
  return res;
}