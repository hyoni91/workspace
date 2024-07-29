import React, { useEffect, useState } from 'react'
import * as c_api from '../apis/c_apis'


function CarInfo() {
  
  //car목록
  const [carInfo,setCarInfo] = useState([])
  //car등록값
  const [regCar, setRegCar] = useState({
    brand : '',
    madelName : '',
    price : 0
  })
  console.log(regCar)

  //차량 목록
  useEffect(()=>{
    c_api.carList()
    .then((res)=>{
      setCarInfo(res.data)
    })
    .catch((error)=>{
      alert('error!')
      console.log(error)
    })
  },[])


  function getRegInfo(e){
    setRegCar({
      ...regCar,
      [e.target.name] : e.target.value
    })
  }

  //등록버튼
  function goInsert(){
    c_api.postInfo(regCar)
    .then((res)=>{

    })
    .catch((error)=>{
      alert('error!')
      console.log(error)
    })
  }

  return (
    <>
      <div className='sized'>
        <div className='title-h3'><h3>차량등록하기</h3></div>
        <div className='carinfo'>
          <div>
            <span>제조사</span>
            <select name='brand' onChange={(e)=>{getRegInfo(e)}}>
              <option value={'현대'}>현대</option>
              <option value={'기아'}>기아</option>
              <option value={'쌍용'}>쌍용</option>
            </select>
          </div>
          <div>
            <span>모델명</span>
            <input type='text' name='modelName' onChange={(e)=>{getRegInfo(e)}}/>
          </div>
          <div>
            <span>차량가격</span>
            <input type='text' name='price' onChange={(e)=>{getRegInfo(e)}}/>
          </div>
          <button className='carinfo-btn' onClick={()=>{goInsert(regCar)}}>등록하기</button>
        </div>
        <h3>차량 목록</h3>
        <table>
        <thead>
          <tr>
            <td>모델번호</td>
            <td>모델명</td>
            <td>제조사</td>
          </tr>
        </thead>
        {
          carInfo.length == 0 ?
          <div>현재 등록된 차량이 없습니다.</div>
          :
          carInfo.map((car,i)=>{
            return(
            <tbody>
              <tr key={i}>
                <td>{car.modelNum}</td>
                <td>{car.modelName}</td>
                <td>{car.brand}</td>
              </tr>
            </tbody>
            )
          })
        }
      </table>
      </div>
      
    </>
  )
}

export default CarInfo;