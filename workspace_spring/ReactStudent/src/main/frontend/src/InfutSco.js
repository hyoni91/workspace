
import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';

const InfutSco = () => {
  const navigate = useNavigate();
  const {stuNum} = useParams();
  const [sco, setSco] = useState({
    stuNum : stuNum,
    stuName : '',
    korScore : 0,
    engScore : 0,
    mathScore : 0,
  })

  console.log(sco)

  //본래값
  useEffect(()=>{
    axios
    .get(`/stuDetail/${stuNum}`)
    .then((res)=>{
      setSco(res.data)
    }
    )
  },[])

  //score 값 들고오기
  function score (e){
    setSco(
      {
        ...sco,
        [e.target.name] : e.target.value
      }
    )
  }

  function inputSco(){
    axios
    .put(`/stuScore`, sco)
    .then((res)=>{
      console.log(res.data)
    })
    .catch((error)=>{
      console.log(error)
    })
  }

  return (
    <>
        <table>
          <h3>{sco.stuName} 학생의 성적을 입력합니다.</h3>
            <tr>
              <td>국어점수</td>
              <td><input type="text" name="korScore" onChange={(e)=>{
                score(e)
              }} /></td>
            </tr>
            <tr>
              <td>영어점수</td>
              <td><input type="text" name="engScore" onChange={(e)=>{score(e)}}/></td>
            </tr>
            <tr>
              <td>수학점수</td>
              <td><input type="text" name="mathScore" onChange={(e)=>{score(e)}}/></td>
            </tr>
            
          </table>
          <button type="button" onClick={()=>{
            inputSco()
            navigate('/stuScoInfo')
          }}>점수등록</button>
    </>
  )
}

export default InfutSco;