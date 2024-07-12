import { useState } from "react";
import { useNavigate } from "react-router-dom";

const Insert = ({board, setBoard}) => {
  const navigate = useNavigate();

  const [boardInput, setBoardInput] = useState({
    boardNum : 0,
    title : '',
    content : '',
    writer : '',
    createDate : ''
  }
  )

  
  function changeBoard(e){
    setBoardInput({
      ...boardInput,
      [e.target.name] : e.target.value
    }) 
  }

  console.log(boardInput)

  return(
    <div className='write_form'>
      <h2>글 작성 화면</h2>
      <table>
        <tr>
          <td>글번호</td>
          <td><input type='text' name='boardNum' onChange={(e)=>{
            changeBoard(e)
          }}></input></td>
        </tr>
        <tr>
          <td>제목</td>
          <td><input type='text' name="title" onChange={(e)=>{
            changeBoard(e)
          }}></input></td>
        </tr>
        <tr>
          <td>작성자</td>
          <td><input type='text' name="writer" onChange={(e)=>{
            changeBoard(e)
          }}></input></td>
        </tr>
        <tr>
          <td>작성일</td>
          <td><input type='date' name="createDate" onChange={(e)=>{
            changeBoard(e)
          }}></input></td>
        </tr>
        <tr>
          <td>내용</td>
          <td><textarea name="content" cols={'35'} rows={'10'} 
          onChange={(e)=>{changeBoard(e)
          }} ></textarea></td>
        </tr>
      </table>
      <button type="button" onClick={(e)=>{
        setBoard([...board, boardInput]) 
        navigate('/')
      }}>글 등록하기</button>
    </div>
    
  )

}

export default Insert;