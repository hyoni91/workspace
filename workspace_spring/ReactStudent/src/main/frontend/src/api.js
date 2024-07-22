
// API 활용 , 자주쓰는 기능 함수로 정의

import axios from "axios";

//서버(스프링)과 통신하는 기능을 모아놓은 js함수
//학생 목록 조회 API
//밑에 처럼 쓰면, 이 친구를 쓸 때 최초로 한번만 실행 -->데이터 갱신이 어려움
// export const getStuList1 = axios.get('/stuList')

//함수로 해야해요~~~
//함수로 쓰면, 실행시킬때 마다 다시 이친구를 실행시킴 --->데이터 갱신마다 실행됨 
export const getStuList = () =>{
  const response = axios.get('/stuList');
  return response
}


export const getStuDetail = (stuNum)=>{
  const res = axios.get(`/stuDetail/${stuNum}`);
  return res;
}

