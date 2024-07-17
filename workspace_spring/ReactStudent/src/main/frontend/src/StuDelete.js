import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

const StuDelete = ()=>{
  const [stuDel, setStuDel] = useState([])
  const navigate = useNavigate();
  // const {stuNum} = useParams();
 

  useEffect(()=>{
  axios
  .get('/stuList')
  .then((res)=>{
    setStuDel(res.data)
    console.log(stuDel)
  })
  .catch((error)=>{
    alert('오류 발생!')
    console.log(error)
  })
  },[])

  function goDelete(stuNum){
    axios
    .delete(`/stuDelete/${stuNum}`)
    .then((res)=>{
      console.log(res.data)
    })
    .catch((error)=>{})
  }


  return(
    <>
      <div className="stuinfo">
        <h3>학생 삭제 페이지</h3>
        <table className="stu-table">
          <colgroup>
            <col width={'30%'}/>
            <col width={'*'}/>
            <col width={'*'}/>
          </colgroup>
          <thead>
            <tr>
              <td>No</td>
              <td>학생명</td>
              <td>삭제</td>
            </tr>
          </thead>
          <tbody>
            {
              stuDel.map((stu,i)=>{
                return(
                <tr key={i}>
                  <td>{stu.stuNum}</td>
                  <td>{stu.stuName}</td>
                  <td><button type="button" value={stu.stuNum} onChange={()=>{
                    goDelete(stu.stuNum)
                  }}>삭제</button></td>
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

export default StuDelete;