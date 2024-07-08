

//Viewer 컴포넌트
function Viewer (props){
  return(
    <div className="view">
        <h4>현재카운터</h4>
        <p>
          {props.cnt}
        </p>
      </div>
  )

}

//Viewer 라는 컴포넌트를 내보내겠습니다.
//export default 컴포넌트명
export default Viewer;   