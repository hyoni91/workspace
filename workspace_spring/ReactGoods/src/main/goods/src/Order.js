import axios from 'axios'
import React, { useEffect, useState } from 'react'

function Order() {
  const [item, setItem] = useState([
    {
      itemNum : 0
      ,itemName : ''
    }
  ])

  useEffect(()=>{
    axios
    .get('/itemList')
    .then((res)=>{
      setItem(res.data)
    })
    .catch((error)=>{
      console.log(error)
      alert('error!')
    })
  },[])

  return (
    <div className='iteminfo'>
      <table className='item-table'>
        <tr>
          <td>주문상품</td>
          <td>
            <select>
              {
                item.map((item,i)=>{
                  return(
                    <option>{item.itemName}</option>
                  )
                })
              }
            </select>
          </td>
        </tr>
        <tr>
          <td>상품단가</td>
          <td>
            {}
          </td>
        </tr>
        <tr>
          <td>주문자</td>
          <td><input type='text'/></td>
        </tr>
        <tr>
          <td>주문 수량</td>
          <td><input type='number'/></td>
        </tr>
      </table>
      <button type='button'>주문하기</button>
    </div>
  )
}

export default Order;