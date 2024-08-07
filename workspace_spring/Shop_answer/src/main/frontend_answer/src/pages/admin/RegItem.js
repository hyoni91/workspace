import axios from 'axios'
import './RegItem.css'
import React, { useEffect, useState } from 'react'
import Modal from '../common/Modal'

const RegItem = () => {
  //모달 띄우기
  const [isItemModal, setIsItemModal] = useState(false)

  //category목록
  const [categoryList, setCategoryList] = useState([])

  //inset입력값
  const [inputItem, setInputItem] = useState({
    cateCode: 2,
    itemName : '',
    itemPrice :0,
    itemIntro: ''
  })
  

  useEffect(()=>{
    axios.get('/api_admin/categoryList')
    .then((res)=>{
      setCategoryList(res.data)
    })
    .catch((error)=>{
      console.log(error)
    })
  },[])

  //onChange함수
  function handleItemInfo(e){
    setInputItem({
      ...inputItem,
      [e.target.name] : e.target.value
    })
  }

  //클릭시 등록
  function getItemInfo(){
    axios.post('/api_admin/insertItem', inputItem)
    .then((res)=>{
      setIsItemModal(true)
    })
    .catch((error)=>{
      console.log(error)
    })
  }

  console.log(inputItem)

  return (
    <div className='joinpage'>
      <div className='regItem'>
        <div>
          <span>상품 카테고리</span>
          <select  className='category-select' name='cateCode' onChange={(e)=>{handleItemInfo(e)}}>
            {
              categoryList.map((cate, i)=>{
                return(
                  <option value={cate.cateCode} key={i}>{cate.cateName}</option>
                )
              })
            }
          </select>
        </div>
        <div>
          <span>상품명</span>
          <input type='text' name='itemName'  onChange={(e)=>{handleItemInfo(e)}}/>
        </div>
        <div>
          <span>상품가격</span>
          <input type='text' name='itemPrice'  onChange={(e)=>{handleItemInfo(e)}}/>
        </div>
        <div>
          <span>상품소개</span>
          <textarea className='textarea' rows={'7'} name='itemIntro'  onChange={(e)=>{handleItemInfo(e)}} />
        </div>
        <div className='regItem-btn'><button type='button' onClick={()=>{getItemInfo()}}>등록하기</button></div>
      </div>
      {
        isItemModal?
        <Modal content={()=>{
          return(
        <div>
          😘😘😘😘<br />
          등록을 완료하였습니다!
        </div>
          )
      }} setIsShow={setIsItemModal} offBtn={()=>{}}/>
        :
        null
      }
    </div>
  )
}

export default RegItem;