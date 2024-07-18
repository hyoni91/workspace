import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'

function InputDetail() {
  const {itemNum} = useParams();
  const [detail , setDetail] = useState({});
  const navigate = useNavigate()
  
  //수정용
  const [input, setInput] = useState({
    itemName : detail.itemName,
    itemPrice : 0,
    itemIntro : '',
    itemNum : itemNum
  });
 

  //디테일 정보 받아오기
  useEffect(()=>{
    axios
    .get(`/itemDetail/${itemNum}`)
    .then((res)=>{
      setDetail(res.data)
    })
    .catch((error)=>{})
  },[])

   //변경할 인풋의 밸류갑 가져오기
    function changValue(e){
    setInput({
      ...input,
      [e.target.name] : e.target.value
    })
  }

  console.log(input)
  //수정하기 버튼
  function goUpdate(){
    axios
    .put('/itemUpdate',input)
    .then((res)=>{
    })
    .catch((error)=>{
      console.log(error)
    })
  }


  return (
    <>
      <div className='iteminfo'>
        <table className='detail-table'>
          <h3>상품 상세 정보</h3>
          <tr>
            <td>상품번호</td>
            <td><input type='text' name='itemNum' readOnly value={detail.itemNum} /></td>
          </tr>
          <tr>
            <td>상품명</td>
            <td><input type='text' name='itemName' defaultValue={detail.itemName} onChange={(e)=>{
              changValue(e)
            }} /></td>
          </tr>
          <tr>
            <td>상품가격</td>
            <td><input type='text' name='itemPrice' defaultValue={detail.itemPrice} onChange={(e)=>{changValue(e)}}/></td>
          </tr>          
          <tr>
            <td>판매자</td>
            <td><input type='text' readOnly name='seller' value={detail.seller}/></td>
          </tr>          
          <tr>
            <td>판매시작일</td>
            <td><input type='text' readOnly name='regDate' value={detail.regDate}/></td>
          </tr>          
          <tr>
            <td>상품 설명</td>
            <td><textarea cols={'21'} rows={'5'} defaultValue={detail.itemIntro} onChange={(e)=>{changValue(e)}}/></td>
          </tr>          
        </table>
        <button type='button' onClick={()=>{
          goUpdate()
          navigate('/')
        }}>수정하기</button>
      </div>
    </>
  )
}

export default InputDetail;