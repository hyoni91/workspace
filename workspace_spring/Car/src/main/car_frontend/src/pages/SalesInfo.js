import React, { useState } from 'react'
import * as c_api from '../apis/c_apis'
import * as s_api from '../apis/s_apis'
import { useNavigate } from 'react-router-dom'

function SalesInfo() {
  const navigate = useNavigate()

  //모델이름 가져오기
  const [model, setModel] = useState([])

  //판매등록값
  const [saleInfo, setSaleInfo] = useState({
    modelNum :'',
    buyer:'',
    buyerTel:'',
    color:''

  })

  console.log(model)
  useState(()=>{
    c_api.carList()
    .then((res)=>{
      setModel(res.data)
    })
    .catch(()=>{})
  },[])

  //판매정보값
  const getSalesInfo = (e)=>{
    setSaleInfo({
      ...saleInfo,
      [e.target.name] : e.target.value
    })
  }

  //판매등록
  function regSaleInfo(){
    s_api.postSalesInfo(saleInfo)
    .then((res)=>{
      navigate('/carlist')
    })
    .catch((error)=>{
      alert(error)
      console.log(error)
    })
  }

  console.log(saleInfo)

  return (
    <div className='sales-content'>
      <h3>판매 정보 등록</h3>
      <div>
        <span>구매자명</span>
        <input className='sales-input' type='text' name='buyer' onChange={(e)=>{getSalesInfo(e)}}/>
      </div>
      <div>
        <span>색상</span>
        <select name='color' onChange={(e)=>{getSalesInfo(e)}}>
          <option value={'블랙'}>블랙</option>
          <option value={'화이트'}>화이트</option>
          <option value={'실버'}>실버</option>
          <option value={'레드'}>레드</option>
        </select>
        <span>모델</span>
        <select name='modelNum' onChange={(e)=>{getSalesInfo(e)}}> 
          {
            model.length == 0 ?
            <>등록된 모델이 없습니다.</>
            :
            model.map((model,i)=>{
              return(
                <option value={model.modelNum} key={i}>{model.modelName}</option>
              )
            })
          }
          </select>
      </div>
      <div>
        <span>연락처</span>
        <input type='text' name='buyerTel' onChange={(e)=>{getSalesInfo(e)}}/>
      </div>
      <button type='button' onClick={()=>{ regSaleInfo(saleInfo)}}>판매등록</button>
    </div>
  )
}

export default SalesInfo;