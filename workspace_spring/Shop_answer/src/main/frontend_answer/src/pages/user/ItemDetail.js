import React, { useEffect, useRef, useState } from 'react'
import './ItemDetail.css'
import axios from 'axios';
import { useParams } from 'react-router-dom';

const ItemDetail = ({loginInfo}) => {
  const {itemCode} = useParams();
  const [bookDetail, setBookDetail] = useState({
    itemCode:'',
    itemName:'',
    itemPrice:'',
    itemIntro:'',
    category: {
      cateName:''
    },
    imgList :[
      {
        attachedFileName:'',
        isMail:'',
        imgCode:'',
        itemCode:''
      },
      {
        attachedFileName:'',
        isMail:'',
        imgCode:'',
        itemCode:''
      }
    ]
  });

  useEffect(()=>{
    axios.get(`/api_item/itemDetail/${itemCode}`)
    .then((res)=>{
      setBookDetail(res.data)
      
    })
    .catch((error)=>{
      console.log(error)
    })
  },[])
  
  //cart에 관한 변수와 함수
  const itemCnt = useRef(0);
  const [cart, setCart] = useState(
    {
      cartCnt : 0,
      itemCode : itemCode,
      memId : loginInfo.memId
    }
);

console.log(cart)

  const onChangeCnt = e =>{
    setCart({
      ...cart,
      [e.target.name] : e.target.value
    })
  }

  function cartInput(){
    axios.post("/api_member/cartInsert", cart)
    .then((res)=>{
      console.log(res.data)
    })
    .catch((error)=>{
      console.log(error)
    })
  }



  return (
    <div>
      <div className='detail-header'>
        <div>
          <img src={(`http://localhost:8080/upload/${bookDetail.imgList[0].attachedFileName}`)}/>
        </div>
        <div className='detail-intro'>
          <h6>{bookDetail.category.cateName}</h6>
          <h3>{bookDetail.itemName}</h3>
          <p>{bookDetail.itemPrice.toLocaleString()}원</p>
          <div>
            수량
            <input type='number' min={1} max={10} ref={itemCnt} name='cartCnt' onChange={(e)=>{onChangeCnt(e)}}/>
          </div>
          <div>
            총가격
            <p>{(bookDetail.itemPrice*itemCnt.current.value).toLocaleString()}원</p>
          </div>
          <button type='button'>구매하기</button>
          <button type='button' onClick={()=>{cartInput(cart)}}>카트담기</button>
        </div>
      </div>
      <hr />
      <div className='detail-content'>
        {/* <h2>상세설명</h2> */}
        <h3>{bookDetail.itemIntro}</h3>
        <div className='detail-footer-img'>
          <img src={(`http://localhost:8080/upload/${bookDetail.imgList[1].attachedFileName}`)}/>
        </div>
      </div>
    </div>
  )
}

export default ItemDetail