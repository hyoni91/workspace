
import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { Outlet, Route, Routes, useNavigate } from 'react-router-dom'
import InputDetail from './InputDetail';

function ItemInfo() {
  const [itemList , setItemList] = useState([])
  const navigate = useNavigate();

  useEffect(()=>{
    axios
    .get('/itemList')
    .then((res)=>{
      setItemList(res.data)
    })
    .catch((error)=>{
      alert('error!')
      console.log(error)
    })

  },[])


  return (
    <>
      <div className='item'>
        <div className='itemList'>
          <h3>총 {itemList.length}개의 상품이 등록되었습니다.</h3>
          <table className='item-table'>
            <thead>
              <tr >
                <td>No</td>
                <td>상품명</td>
                <td>상품가격</td>
                <td>판매자</td>
              </tr>
            </thead>
            <tbody>
              {
                itemList.length == 0 ?
                <tr>
                  <td colSpan={'4'}>등록된 정보가 없습니다.</td>
                </tr>
                :
                itemList.map((item ,i )=>{
                  return(
                    <tr key={i}>
                      <td>{i+1}</td>
                      <td><span onClick={()=>{
                        navigate(`/itemDetail/${item.itemNum}`)
                        
                      }}>{item.itemName}</span></td>
                      <td>{item.itemPrice}</td>
                      <td>{item.seller}</td>
                    </tr>
                  )
                })
              }
            </tbody>
          </table>
        </div>
        <div className='itemDetail'>
          <Routes>
            <Route path='/itemDetail/:itemNum' element={<InputDetail />}/>
          </Routes>
          </div>
      </div>
    </>
  )
}

export default ItemInfo;