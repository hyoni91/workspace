import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';

function ItemInfut() {
  const [input , setInput] = useState({})
  const navigate = useNavigate();

//등록 값 들고오기
function getInput(e){
  setInput(
    {
      ...input,
      [e.target.name] : e.target.value
    }
  )
}

console.log(input)

  function goInput(){
    axios
    .post('/itemInsert', input)
    .then((res)=>{
    
    })
    .catch((error)=>{
      console.log(error)
      alert('error!')
    })
  }


  return (
    <>
      <div className='iteminfo'>
        <h3>상품 등록 페이지</h3>
        <table className='item-table'>
          <tr>
            <td>상품명</td>
            <td><input type='text' name='itemName' onChange={(e)=>{
              getInput(e)
            }}/></td>
          </tr>
          <tr>
            <td>상품가격</td>
            <td><input type='text' name='itemPrice' onChange={(e)=>{getInput(e)}}/></td>
          </tr>
          <tr>
            <td>판매자</td>
            <td><input type='text' name='seller' onChange={(e)=>{getInput(e)}}/></td>
          </tr>
          <tr>
            <td>상품설명</td>
            <td><textarea cols={'23'} rows={'5'} name='itemIntro' onChange={(e)=>{getInput(e)}}/></td>
          </tr>
        </table>
        <button type='button' onClick={()=>{
          goInput();
          navigate('/')
        }}>등록하기</button>
      </div>
    </>

  )
}

export default ItemInfut;