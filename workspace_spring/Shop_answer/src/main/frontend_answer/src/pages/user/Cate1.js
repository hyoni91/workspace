import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'

const Cate1 = () => {
  const navigate = useNavigate()
  const {cateNum} = useParams()
  const [cate1List, setCate1List] = useState([])
  const [cateName, setCateName] = useState([])

    useEffect(()=>{
      axios.get('/api_admin/categoryList')
    .then((res)=>{
      console.log(res.data[0].cateName)
      res.data.map((cate,i)=>{
        if(cate.cateCode == cateNum){
          setCateName(cate.cateName)
        }
      })
  })
    .catch(()=>{})
    },[cateNum])
    

    // if(cateNum == 1){
    //   return (<>인터넷/IT</>)
    // }else if(cateNum == 2){
    //   return (<>소설/에세이</>)
    // } else{
    //   return (<>자기계발</>)
    // }
  
  useEffect(()=>{
    axios.get(`/api_item/cate1List/${cateNum}`)
    .then((res)=>{
      setCate1List(res.data)
    })
    .catch((error)=>{
      console.log(error)
    })

    

  },[cateNum])

  return (
    <>
      <div className='item-list-title'>{cateName}</div>
      <div className='item-list-div'>

        {
          cate1List.map((item,i)=>{
            return(
              <div key={i} className='item-div'>
                <img onClick={()=>{navigate(`/book_detail/${item.itemCode}`)}} src={(`http://localhost:8080/upload/${item.imgList[0].attachedFileName}`)}/>
                <h6>{item.category.cateName}</h6>
                <h4 onClick={()=>{navigate(`/book_detail/${item.itemCode}`)}}>{item.itemName}</h4>
                <p>{item.itemPrice.toLocaleString()}원</p>
              </div>
            )
          })
        }
        
      </div>
    </>
  )
}

export default Cate1