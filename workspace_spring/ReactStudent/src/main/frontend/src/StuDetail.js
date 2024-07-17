import axios from "axios";
import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";

const StuDetail = ()=>{
  const {stuNum} = useParams()
  const [detail, setDetail] = useState({})
  console.log(stuNum)

  useEffect(()=>{
    axios
    .get(`/stuDetail/${stuNum}`)
    .then((res)=>{
      setDetail(res.data)
    })
    .catch((error)=>{
      alert('오류 발생')
      console.log(error)
    })
  })

  return(
    <>
      <h3>학생 상세 정보</h3>
      <table>
        <tr>
          <td>이름</td>
          <td>{detail.stuName}</td>
          <td>나이</td>
          <td>{detail.stuAge}</td>
        </tr>
        <tr>
          <td>연락처</td>
          <td>{detail.stuTel}</td>
          <td>주소</td>
          <td>{detail.stuAddr}</td>
        </tr>
        <tr>
          <td>국어점수</td>
          <td>{detail.korScore}</td>
          <td>영어점수</td>
          <td>{detail.engScore}</td>
        </tr>
        <tr>
          <td>수학점수</td>
          <td>{detail.mathScore}</td>
          <td>평균점수</td>
          <td>평균</td>
        </tr>
      </table>
    </>
  )
}

export default StuDetail;