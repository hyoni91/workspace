import React, { useEffect, useRef, useState } from 'react'
import * as c_api from '../apis/c_apis'
import { useNavigate } from 'react-router-dom'


function CarInfo() {
  const navigate = useNavigate()

  //car목록
  const [carInfo,setCarInfo] = useState([])
  //car등록값
  const [regCar, setRegCar] = useState({
    brand : '현대',
    madelName : '',
    price : 0
  })


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
  },[regCar])


  function getRegInfo(e){
    setRegCar({
      ...regCar,
      [e.target.name] : e.target.value
    })
  }

  //등록버튼
  function goInsert(){
    c_api.postInfo(regCar)
    .then((res)=>
      {
      navigate('/carinfo')
      setRegCar({
        brand: '현대',
        modelName: '',
        price: 0
      })

      
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
            <p>제조사</p>
            <select name='brand' onChange={(e)=>{getRegInfo(e)}}>
              <option value={'현대'}>현대</option>
              <option value={'기아'}>기아</option>
              <option value={'쌍용'}>쌍용</option>
            </select>
          </div>
          <div>
            <p>모델명</p>
            <input type='text' name='modelName' onChange={(e)=>{getRegInfo(e)}}/>
          </div>
          <div>
            <p>차량가격</p>
            <input type='text' name='price' onChange={(e)=>{getRegInfo(e)}}/>
          </div>
          <button className='carinfo-btn' onClick={()=>{goInsert(regCar)}}>등록하기</button>
        </div>
        {/* <h3>차량 목록</h3> */}
        <table className='carInfoTable'>
        <thead>
          <tr>
            <td>모델번호</td>
            <td>모델명</td>
            <td>제조사</td>
          </tr>
        </thead>
        {
          carInfo.length == 0 ?
          <tbody>
            <tr>
              <td colSpan={'3'}>현재 등록된 차량이 없습니다.</td>
            </tr>
            
          </tbody>
          :
          carInfo.map((car,i)=>{
            return(
            <tbody key={i}>
              <tr>
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