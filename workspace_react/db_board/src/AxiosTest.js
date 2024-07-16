import axios from "axios";
import { useState } from "react";

const AxiosTest = ()=>{


  //spring 서버와 데이터 통신을 위해(data주고 받기) react에서는 axios기술을 사용한다.
  //axios는 데이터베이스의 작업 종류에 따라 함수 제공

  //쿼리에 빈 값이 없는 데이터조회
  function get1(){
    axios
    .get('/getList')
    .then((res)=>{
      console.log(res.data)
    })
    .catch((error)=>{
      console.log('error!!')
      console.log(error)
    })
  }

  //쿼리에 빈 값이 있는 데이터 조회
  function get2(){
    axios
    .get('/axiosDetail/1')
    .then((res)=>{})
    .catch((error)=>{})
  }

  const member = {
    name : 'kim'
    ,age : 20
  }

  //쿼리의 빈 값이 있는 데이터 삽입 (react에서 java로 데이터 전달)
  function post1(){
    axios
    .post('/axiosInsert', member)
    .then((res)=>{
      console.log(res.data)
    })
    .catch((error)=>{
      console.log('error!!')
      console.log(error)
    })
  }

  //쿼리의 빈 값이 있는 데이터 수정 (react에서 java로 데이터 전달)
  function put1(){
    axios
    .put('/axiosUpdate', {
      boardNum : 3,
      boardTitle: '어려워용',
      boardWriter : '아오~'
    })
    .then((res)=>{
      alert('내용을 수정했습니다.')
      console.log(res.data)
    })
    .catch((error)=>{
      console.log('error!!')
      console.log(error)
    })
  }


  return(
    <div>
      <h2>axios 통신예제</h2>
      <div className="btn">
        <button type="button" onClick={()=>{get1()}}>get1 데이터 조회</button>
      </div>
      <div className="btn">
        <button type="button" onClick={()=>{get2()}}>get2 데이터 조회(빈값)</button>
      </div>
      <div className="btn">
        <button type="button" onClick={()=>{post1()}}>post1 데이터 삽입</button>
      </div>
      <div className="btn">
        <button type="button" onClick={()=>{put1()}}>put1 데이터 수정</button>
      </div>
    </div>
  )

}

export default AxiosTest;