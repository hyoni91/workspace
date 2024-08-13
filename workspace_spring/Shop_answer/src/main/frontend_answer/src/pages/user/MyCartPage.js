import React from 'react'

const MyCartPage = () => {
  return (
    <div>
      <h4>나의 장바구니 목록</h4>
      <div className='cart-table'>
        <table>
          <thead>
            <tr>
              <td>No</td>
              <td><input type='checkbox'/></td>
              <td>상품 정보</td>
              <td>가격</td>
              <td>수량</td>
              <td>구매가격</td>
              <td>구매일시</td>
              <td></td>
            </tr>
          </thead>
        </table>
      </div>
    </div>
  )
}

export default MyCartPage;