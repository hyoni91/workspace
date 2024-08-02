import React, { useEffect, useState } from 'react'
import * as c_api from '../apis/c_apis'
import * as s_api from '../apis/s_apis'
import axios from 'axios'

function SaleList() {
  const [carList, setCarList] = useState([])
  const [salesList, setSalesList] = useState([])

  console.log(carList)
  console.log(salesList)
  useEffect(()=>{
    axios.all([c_api.carList(), s_api.selectSaleInfo()])
    .then((axios.spread((res1,res2)=>{
      setCarList(res1.data)
      setSalesList(res2.data)
    })))
    .catch((error)=>{
      alert(error)
      console.log(error)
    })
  },[])

  return (
    <div className='listContent'>
      <table className='saleListTable'>
        <thead >
          <tr>
            <td rowSpan={'2'}>No</td>
            <td colSpan={'4'}>구매자정보</td>
            <td colSpan={'2'}>차량정보</td>
          </tr>
          <tr>
            <td>구매자명</td>
            <td>연락처</td>
            <td>구매일</td>
            <td>색상</td>
            <td>모델명</td>
            <td>금액</td>
          </tr>
        </thead>
        <tbody>
          {
            carList.length == 0 ? 
            <tr>
              <td colSpan={'6'}>구매 정보가 없습니다.</td>
            </tr>
            :
            salesList.map((sale,i)=>{
              return(
              <tr key={i}>
                <td>{i+1}</td>
                <td>{sale.buyer}</td>
                <td>{sale.buyerTel}</td>
                <td>{sale.sdate}</td>
                <td>{sale.color}</td>
              </tr>
              )
            })
          }
          
        </tbody>
      </table>
      
    </div>
  )
}

export default SaleList;