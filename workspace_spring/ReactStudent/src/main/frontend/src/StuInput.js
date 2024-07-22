import axios from "axios";
import { useState } from "react";
import { useNavigate } from "react-router-dom";


const StuInput = ()=>{
  const [input, setInput] = useState({})
  const navigate = useNavigate()

  //글 value값 가져오기
  function insertData(e){
    setInput(
      {...input,
      [e.target.name] : e.target.value
      }
    )
  }

  function goInput(){
    
    const name = document.querySelector('input[name="stuName"]')
    if(name == ''){
      alert('이름 입력은 필수입니다!')
      name.focus()
      return;
    }

    axios.post('/stuInsert',input)
    .then((res)=>{
      alert('등록 완료')
      console.log(res.data)
    })
    .catch((error)=>{
      alert('오류 발생')
      console.log(error)
    })
  }

  return(
    <>
      <div className="stuinfo">
        <h3>학생 등록 페이지</h3>
        <table>
          <tr>
            <td>이름</td>
            <td><input type="text" name="stuName" onChange={(e)=>{
              insertData(e)
            }}/></td>
          </tr>
          <tr>
            <td>나이</td>
            <td><input type="text" name="stuAge" onChange={(e)=>{
              insertData(e)
            }}/></td>
          </tr>
          <tr>
            <td>연락처</td>
            <td><input type="text" name="stuTel" onChange={(e)=>{
              insertData(e)
            }}/></td>
          </tr>
          <tr>
            <td>주소</td>
            <td><input type="text" name="stuAddr" onChange={(e)=>{
              insertData(e)
            }}/></td>
          </tr>
        </table>
        <button  type="button" onClick={()=>{goInput(
          navigate('/')
        )}}>학생 등록</button>
      </div>
    </>
  )
}

export default StuInput;