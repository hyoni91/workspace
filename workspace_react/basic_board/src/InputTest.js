import { useState } from "react";

const InputTest = () => {
  //글 등록 연습 // input태그에 입력한 내용을 저장하는 변수
  const [inputData, setInputData] = useState('')
  const [inputData2, setInputData2] = useState('')

  //글 등록 연습 [배열로]
  const [stu, setStu] = useState({
    stuName : '',
    age : 0,
    score : 0,
    addr : ''
  })

   //자주 쓰는 기능 함수로 만들기
  function changeStu(e){
    setStu({
      ...stu,
      [e.target.name] : e.target.value
    });
  }

    return(
      //  글 등록 연습 
      // 리액트 특징 : 입력하는 순간 => 입력내용 저장 (클릭하면 데이터 이동이 아님 주의)}
      <>
        <div>
          <h3>글 등록 연습</h3>
          이름 : <input type='text' onChange={(e)=>{
            // console.log(e.target.value)
            setInputData(e.target.value)
          }} />
          <br />
          나이 : <input type='text' onChange={(e)=>{
            setInputData2(e.target.value)
          }}  />
        </div> 
  
        <div>
        <h3>글 등록 연습 객체/배열</h3>
          이름 : <input type='text' name='stuName' onChange={(e)=>{
            changeStu(e);
            }}/><br />
          나이 : <input type='text' name='age' onChange={(e)=>{
            changeStu(e);
          }}/><br />
          점수 : <input type='text' name='score' onChange={(e)=>{
            changeStu(e);
            }}
          /><br />
          주소 : <input type='text' name='addr' onChange={(e)=>{
            changeStu(e);
          }}/>
          
        </div>
  
        <div>
          이름 : {stu.stuName} <br/>
          나이 : {stu.age} <br/>
          점수 : {stu.score} <br/>
          주소 : {stu.addr} <br/>
        </div>
      </>
    )
}

export default InputTest;