import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

const StuInfo = ()=>{
  const [stuList , setStuList] = useState([])
  const navigate = useNavigate()
  
  useEffect(()=>{
    axios
    .get('/stuList')
    .then((res)=>{
      setStuList(res.data)
      console.log(stuList)
    })
    .catch((error)=>{
      alert('error!')
      console.log(error)
    })
  },[])
  
  return(
    <>
      <div className="stuinfo">
        <h3>학생 정보 조회</h3>
        <table className="stu-table">
          <colgroup>
          <col width={'10%'}/>
          <col width={'25%'}/>
          <col width={'*'}/>
          <col width={'*'}/>
          <col width={'*'}/>
          <col width={'15%'}/>
          </colgroup>
          <thead>
            <tr>
              <td>No</td>
              <td>학생명</td>
              <td>국어점수</td>
              <td>영어점수</td>
              <td>수학점수</td>
              <td>평균</td>
            </tr>
          </thead>
          <tbody>
            {
              stuList.map((stu,i)=>{
                if(stu == []){
                  return(
                    <tr>
                      <td colSpan={6}>등록된 정보가 없습니다.</td>
                    </tr>
                  )
                } else {
                  return(
                  
                    <tr key={i}>
                      <td>{stu.stuNum}</td>
                      <td><span onClick={()=>{
                        navigate(`/detail/${stu.stuNum}`)
                      }}>{stu.stuName}</span></td>
                      <td>{stu.korScore}</td>
                      <td>{stu.engScore}</td>
                      <td>{stu.mathScore}</td>
                      <td>평균점수</td>
                    </tr>
                  )
                }
              })
            }
          </tbody>
        </table>
      </div>
    </>
    
  )
}

export default StuInfo;