import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

const InsertBoard = ()=>{
  const [input, setInput] = useState({})
  const navigate = useNavigate()

  //인풋 태그의 밸류값을 저장! 
  function inputData(e){
    setInput({
      ...input,
      [e.target.name] : e.target.value
    })
  }



    //글등록
    function inputButton(){
      //해당 쿼리가 빈값을 경우 axios함수 실행 안함
      const boardTitle = document.querySelector('input[name="boardTitle"]')
      if(boardTitle.value == ''){
        alert('제목은 필수입력입니다.')
        boardTitle.focus()
        return;
      }

      //이렇게도 가능함
      if(input.boardWriter == ''){
        alert('작성자는 필수입력입니다.')
        return;
      }


      axios
      .post('/insertBoard', input )
      .then((res)=>{
        alert('등록완료!')
        navigate('/')
        console.log(res.data)
      })
      .catch((error)=>{
        console.log('등록 오류!!')
        console.log(error)
      });
  
    }

  return(
    <>
      <h2>글 작성 화면</h2>
      <table className="insert-table">
        <tr>
          <td>제목</td>
          <td><input type="text" name="boardTitle" 
          onChange={(e)=>{
            inputData(e)
          }}/></td>
        </tr>
        <tr>
          <td>작성자</td>
          <td><input type="text" name="boardWriter" 
          onChange={(e)=>{
            inputData(e)
          }}/></td>
        </tr>
        <tr>
          <td>내용</td>
          <td><textarea cols={'23'} rows={'6'} name="boardContent" 
          onChange={(e)=>{
            inputData(e)
          }}/></td>
        </tr>
      </table>
      <button className="write-btn" type="button" onClick={()=>{inputButton()}}>등록하기</button>
    </>
  )

}

export default InsertBoard;