import React, { useEffect, useState } from 'react'
import * as c_api from '../apis/c_apis'
import * as s_api from '../apis/s_apis'
import axios, { Axios } from 'axios'

function SaleList() {
  const [salesList, setSalesList] = useState([])


  console.log(salesList)
  useEffect(()=>{
      axios.get('/sales/select')
      .then((res)=>{
        setSalesList(res.data)
      })
      .catch((error)=>{
        console(error)
      })

  },[])

  return (
    <div className='listContent'>
      <table className='saleListTable'>
        {/* <colgroup>
          <col width={'8%'}/>
          <col width={'15%'}/>
          <col width={'30%'}/>
          <col width={'20%'}/>
          <col width={'15%'}/>
          <col width={'15%'}/>
          <col width={'*'}/>
        </colgroup> */}
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
            salesList.length == 0 ?
            <tr>
              <td colSpan={'6'}>등록된 구매정보가 없습니다.</td>
            </tr>
            :
            
            salesList.map((sale, i)=>{
              return(
              <tr key={i}>
                <td>{i+1}</td>
                <td>{sale.buyer}</td>
                <td>{sale.buyerTel}</td>
                <td>{sale.sdate}</td>
                <td>{sale.color}</td>
                <td>{sale.carVO.modelName}</td>
                <td>{sale.carVO.price.toLocaleString()}원</td>
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