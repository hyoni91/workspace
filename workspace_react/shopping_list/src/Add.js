import { useState } from "react";


//onChang : 값이 바뀔 때마다 무언가를 하겠다.

function Add(props){
  //input태그의 내용을 저장할 변수 
  let [text, setText] = useState();
  return(
    <div className='btn'>
    <input type='text' onChange={(e)=>{
      setText(e.target.value)
    }}></input>
    <button type='button' onClick={(e)=>{
      //input태그에 입력한 내용가져오기
      // text; 에 저장~~~
      //가져온 내용을 list에 추가하기
      props.list.push(text);   // 입력한 내용push
      //변경된 list의 내용으로 setList 함수를 호출하기
      props.setList([...props.list]);  // 이거이거이거!!
      
    }}>추가
    </button>
  </div>
  )
}

export default Add;
