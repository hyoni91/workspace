import React, { useEffect, useState } from 'react'
import './MyCartPage.css'
import { BsCart4 } from "react-icons/bs";
import axios from 'axios';


const MyCartPage = ({loginInfo}) => {
const [myCart,setMyCart] = useState({})
console.log(myCart)

  useEffect(()=>{
    axios.get(`/api_item/cartList/${loginInfo.memId}`)
    .then((res)=>{
      setMyCart(res.data)
    })
    .catch((error)=>{
      console.log(error)
    })
  },[])

  return (
    <div className='cartpage'>
      <h4>나의 장바구니</h4>
      <div className='cart-content'>
        <table className='cart-table'>
          <colgroup>
            <col width={'10%'}/>
            <col width={'10%'}/>
            <col width={'*'}/>
            <col width={'10%'}/>
            <col width={'10%'}/>
            <col width={'10%'}/>
            <col width={'10%'}/>
            <col width={'10%'}/>
          </colgroup>
          <thead>
            <tr>
              <td>No</td>
              <td><input className='cart-chkbox' type='checkbox'/></td>
              <td>상품 정보</td>
              <td>가격</td>
              <td>수량</td>
              <td>구매가격</td>
              <td>구매일시</td>
              <td></td>
            </tr>
          </thead>
          <tbody>
            {
              myCart == null ?
              <tr>
                <td colSpan={'8'}>현재 등록 된 상품이 없습니다.</td>
              </tr>
              :
                  <tr>
                    <td>{myCart.itemName}</td>
                    <td>{myCart.itemName}</td>
                    <td>{myCart.itemName}</td>
                    <td>{myCart.itemPrice}</td>
                    <td></td>
                  </tr>

            }
          </tbody>
        </table>
      </div>
    </div>
  )
}

export default MyCartPage;