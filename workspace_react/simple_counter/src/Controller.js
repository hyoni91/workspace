

//Controller 컴포넌트
// 함수를 props로 전달 받기 
// 매개변수 num 은 evnet.target.value로 전달하기
function Controller(props){
  
  
  return(
    <div className='btn'>
    <button type='button' value={-10} onClick={(e)=>{
      props.changeCount(e.target.value)
    }}>-10</button>
    <button type='button' value={-1} onClick={(e)=>{
      props.changeCount(e.target.value)
    }} >-1</button>
    <button type='button' value={+1} onClick={(e)=>{
      props.changeCount(e.target.value)
    }}>+1</button>
    <button type='button' value={+10} onClick={(evnet)=>{props.changeCount(evnet.target.value);
    }}>+10</button>



  </div>
  )
}

export default Controller;





// onClick -> 하나하나, props와 useState로
{/* <div className='btn'>
<button type='button' onClick={() => {
 {props.setCnt(props.cnt-10)}
}}>-10</button>
<button type='button' onClick={() => {
 {props.setCnt(props.cnt-1)}
}} >-1</button> */}