import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

// App() 함수의 리턴문 안에 작성하는 코드가 화면에 나타남
// html 코드처럼 보이지만 실제로는 jsx문법이다.
// 그렇기 때문에, html과 다른 부분이 존재한다.
// return 안에는 그림 그리는 영역 (html같은 존재?)
function App() {
  const titless = ['울산 맛집', '부산 맛집', '창원 맛집']
  const tilessChange = ['전체', '변경','완료']

  //리액트에서 변수 만들기
  //[ 변수의 초기값,setter] ->구조분해할당 -> 변수 두개 만듦
  //likeCnt = 초기값 '0'   ->useState(0) 의 '0'
  //setLikeCnt = setter / 변수 값을 변경시켜주는 함수
  // useState를 사용하면 변경된 변수 값을 html에 재랜더링 해줌
 
  //좋아요
  // let[likeCnt, setLikeCnt] = useState(0);

  //좋아요 배열로
  let[likeCnt, setLikeCnt] = useState([0,0,0]);
  // 데이터 복사 (...) 활용
  //구조 분해 할당!!!!!!!!
  const copyLikeCnt = [...likeCnt];

  //모든 제목 정보를 저장하고 있는 변수 
  let [titles, setTitles] = useState(titless);
  //첫번째 제목 변경  --> title 변수명 바꿔줘야함! (return안에)
  let[title, setTitle] = useState(titles[0])

  //Detail컴포넌트가 보일지 안 보일지 결정하는 변수
  let [isShow, setIsShow] = useState(false);

  //map 도 반복시켜줌 forEach 
  //map 특징 : retrun:''; 가능!
  

  return (
    <div className="App">
      <div className='blog-navi'>
        <h3>My Blog</h3>
      </div>

      {/* 첫번째 제목 변경 */}
      <button type='button' className='btn' onClick={()=>{setTitle(title='대구 맛집')}}>제목 변경</button>

      {/* 전체 제목 변경 */}
      <button type='button' className='btn' onClick={()=>{setTitles(titles=tilessChange)}}>모든 제목 변경 </button>


      {/* 블로그 글 목록 */}
      {/* key={} 데이터 구분을 위한 속성값 */}
      {
        titless.map((title,index)=>{
          return (
            <Board title={title} key={index}/>
          )
        })
      }


    {/* 상세보기 화면 */}
      { 
        isShow == true ? <Detail /> : null  
      }
        
    </div>
  );
}


//컴포넌트는 앱 밖에서 
//상세보기 기능(컴포넌트)
//컴포넌트의 리턴문에 html 작성
function Detail(){
  return (
    // 모든 html 태그는 하나의 최상위 태그에 포함이 되어야 한다.
    <div className='detail'>
      <h4></h4>
      <p>날짜</p>
      <p>상세내용</p>
   </div>
  );
}

//블로그 게시글 하나에 대한 컴포넌트
//전달되는 데이터는 매개변수에 props를 사용해서 전달받음
function Board(props){
 return( 
 <div className='list'>
  <h4>
    <span>{props.title}</span>
    <span>👍</span>
    0
  </h4>
  <p>2024-07-04</p>
</div> 
)
}


export default App;
