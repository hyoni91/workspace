import React, { useEffect, useRef, useState } from 'react'
import './ItemDetail.css'
import axios from 'axios';
import { useParams } from 'react-router-dom';

const ItemDetail = ({loginInfo}) => {
  const {itemCode} = useParams();
  console.log(loginInfo)
  
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
        isMain:'',
        imgCode:'',
        itemCode:''
      },
      {
        attachedFileName:'',
        isMain:'',
        imgCode:'',
        itemCode:''
      }
    ]
  });

  //대표이미지와 서브이미지 저장
  const [mainimg, setMainImgName] = useState('')
  const [subimg, setSubImgName] = useState('')

  //변수 다시 넣기
  let img1 = '';
  let img2 = '';

  //반복문 안에 state변수를 직접 넣지 않은 이유는 반복이 끝나기도 전에 재랜더링이 되기 때문에
  //반복문을 다 돌고 난 후 state변수에 값을  저장
  //이때 state변수가 여러개일 경우 모든 변수에 변수값을 저장할 동안 재랜더링이 일어나지 않는다.

  useEffect(()=>{
    axios.get(`/api_item/itemDetail/${itemCode}`)
    .then((res)=>{
      res.data.imgList.forEach((img,i) => {
        if(img.isMain == 'Y'){
          img1 = img.attachedFileName
        }img2 = img.attachedFileName
      });
      setMainImgName(img1)
      setSubImgName(img2)
      setBookDetail(res.data)
    })
    .catch((error)=>{
      console.log(error)
    })
  },[])
  
  //cart에 관한 변수와 함수
  //사실장 useRef는 필요가 없음
  const itemCnt = useRef(1);
  const [cart, setCart] = useState(
    {
      cartCnt : 1,
      itemCode : itemCode,
      memId : loginInfo.memId
    }
);

// console.log(cart)

  const onChangeCnt = e =>{
    setCart({
      ...cart,
      [e.target.name] : e.target.value
    })
  }

  function cartInput(){
    if(window.confirm('장바구니에 담을까요?')){
      axios.post("/api_member/cartInsert", cart)
      .then((res)=>{
        console.log(res.data)
      })
      .catch((error)=>{
        console.log(error)
      })
    }
  }



  return (
    <div>
      <div className='detail-header'>
        <div className='detail-mainimg'>
          <img src={(`http://localhost:8080/upload/${mainimg}`)}/>
        </div>
        <div className='detail-intro'>
          <h6>{bookDetail.category.cateName}</h6>
          <h3>{bookDetail.itemName}</h3>
          <p>{bookDetail.itemPrice.toLocaleString()}원</p>
          <div>
            수량
            <input type='number' min={1} max={10} readOnly ref={itemCnt} name='cartCnt' defaultValue={1} onChange={(e)=>{onChangeCnt(e)}}/>
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
          <img src={(`http://localhost:8080/upload/${subimg}`)}/>
        </div>
      </div>
    </div>
  )
}

export default ItemDetail