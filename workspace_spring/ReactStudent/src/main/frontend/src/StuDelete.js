import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import { getStuList } from "./api";

const StuDelete = ()=>{
  const [stuDel, setStuDel] = useState([])
  // const navigate = useNavigate();
  // const {stuNum} = useParams();
  
  useEffect(()=>{
    getStuList()
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
      // 내가 지운 학번이랑 일치하는 정보 지우기! 
      // for문으로
      // stuDel.forEach((stu,i)=>{
      //   if(stu.stuNum == stuNum){
      //     stuDel.splice(i,1)
      //   }
      // }); 

      // //위의 for문을 lamda식으로
      stuDel.filter((stu,i)=>{
      stuDel.splice(stu.stuNum==stuNum , i)
      });
      // // 구조분해 할당으로 새로운 stuDel로 넣어주기
      // // 배열이 바뀌었다고 인식시키기 위해서 구조분해할당!
      setStuDel([...stuDel])

      //가장짧게! 람다식!!! (넘 느려~~`)
      // setStuDel([stuDel.filter((stu,i)=>{ return stu.stuNum != stuNum})]) 

    })
    .catch((error)=>{
      console.log(error)
      alert('error!')
    })
  }


  return(
    <>
      <div className="stuinfo">
        <h3>학생 삭제 페이지</h3>
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
                  <td><button className="btn-doko" type="button" value={stu.stuNum} onClick={()=>{
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