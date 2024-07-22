import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import * as api from './api'  // * 모든 기능을 가져옴 , 기능 불러올 때 이름은 api

const StuScoInfo = ()=>{
  const [scoList , setScoList] = useState([])
  const navigate = useNavigate()

  useEffect(()=>{

    api.getStuList()
    .then((res)=>{
      setScoList(res.data)
    })
    .catch((error)=>{
      console.log(error)
    })
  },[])



  return(
    <>
      <div className="stuinfo">
        <h3>성적 관리 페이지</h3>
        <table className="stu-table2">
        <colgroup>
            <col width={'30%'}/>
            <col width={'30%'}/>
            <col width={'*'}/>
          </colgroup>
          <thead>
            <tr>
              <td>No</td>
              <td>학생명</td>
              <td>성적입력</td>
            </tr>
          </thead>
          <tbody>
            {
              scoList.map((stu,i)=>{
                return(
                  <tr key={i}>
                    <td>{i+1}</td>
                    <td>{stu.stuName}</td>
                    <td><button className="btn-doko" type="button" onClick={()=>{
                      navigate(`/infutSco/${stu.stuNum}`)
                    }}>성적입력</button></td>
                  </tr>
                )
              })
            }
          </tbody>
        </table>
        
      </div>
    </>
  )
}

export default StuScoInfo;