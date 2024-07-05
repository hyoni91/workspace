import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function App() {
  
  const board_list = [
  {
   boardNum : 1,
   title : '야옹이',
   content : '냐옹', 
   writer : '고양이씨'
  },
  {
    boardNum : 2,
    title : '멍멍이',
    content : '멍멍',
    writer : '강아지씨' 
  },
  {
    boardNum : 3,
    title : '토깽이',
    content : '깡충',
    writer : '토끼씨' 
  }];

  let [isDtail, setIsDtail] = useState(false)
  const [index, setIndex] = useState(0);
 

  return (
    <div className="App">
      
      {/* 게시글 목록 (map) */}
       <div className='container'>
          <table>
            <thead>
              <tr>
                <td>글번호</td>
                <td>제목</td>
                <td>작성자</td>
              </tr>
            </thead>
            <tbody>
            {/* {  
              board_list.map((board, index)=>{
              return( 
                <Board 
                  boardNum={board.boardNum}
                  title={board.title}  
                  writer={board.writer}
                  key={index}/>)})
            } */}
            {
              board_list.map((board,i)=>{
                return(
                  <tr key={i}>
                    <td>{board.boardNum}</td>
                    <td><span onClick={()=>{
                      setIndex(i)
                      setIsDtail(true)
                    }}>{board.title}</span></td>
                    <td>{board.writer}</td>
                  </tr>
                )
              })
            }
            </tbody>
          </table>
        {
          isDtail ? <Dtail board={board_list[index]}/> : null 
          
          
        }
      </div>
    </div>
  );
}


// //글목록
//   function Board(props){
//   return (
//       <tr>
//         <td>{props.boardNum}</td>
//         <td>{props.title}</td>
//         <td>{props.writer}</td>
//       </tr>
//   );
//   }



//상세페이지
  function Dtail(props){

    return(
      <div className='detail'>
      <p>글번호 : {props.board.boardNum}</p>        
      <p>제목 : {props.board.title}</p>
      <p>내용 :{props.board.content} </p>
      <p>작성자 : {props.board.writer}</p>
     </div>
    )

  }



export default App;
