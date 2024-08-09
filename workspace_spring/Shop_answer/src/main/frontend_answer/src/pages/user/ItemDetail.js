import React, { useEffect, useState } from 'react'
import './ItemDetail.css'
import axios from 'axios';
import { useParams } from 'react-router-dom';

const ItemDetail = () => {
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
  console.log(bookDetail)

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
          <button type='button'>구매하기</button>
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