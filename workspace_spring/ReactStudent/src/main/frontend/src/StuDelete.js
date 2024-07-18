import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

const StuDelete = ()=>{
  const [stuDel, setStuDel] = useState([])
  const navigate = useNavigate();
  const {stuNum} = useParams();
 

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
      // 자동 새로고침을 하기 위해서 useState값 변화 시키기
      // 내가 지운 사람이랑 똑같이 지우기! 
      stuDel.forEach((stu,i)=>{
        if(stu.stuNum == stuNum){
          stuDel.splice(i,1)
        }
      }); 
      // 구조분해 할당으로 새로운 stuDel로 넣어주기
      setStuDel([...stuDel])
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
                  <td>{i+1}</td>
                  <td>{stu.stuName}</td>
                  <td><button type="button" value={stu.stuNum} onClick={()=>{
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