import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

// App() 함수의 리턴문 안에 작성하는 코드가 화면에 나타남
// html 코드처럼 보이지만 실제로는 jsx문법이다.
// 그렇기 때문에, html과 다른 부분이 존재한다.
// return 안에는 그림 그리는 영역 (html같은 존재?)
function App() {
  const titles = ['울산 맛집', '부산 맛집', '창원 맛집']

  //좋아요 개수 변수 선언
  let cnt = 0;
  //리액트에서 변수 만들기
  //[ 변수의 초기값,setter] ->구조분해할당 -> 변수 두개 만듦
  //likeCnt = 초기값 '0'   ->useState(0) 의 '0'
  //setLikeCnt = setter
  let[likeCnt, setLikeCnt] = useState(0);
  


  return (
    <div className="App">
      <div className='blog-navi'>
        <h3>My Blog</h3>
      </div>

      <div className='list'>
      <h4>
        {titles[0]} 
        <span onClick={()=>{setLikeCnt(likeCnt+1)}}>👍</span>
        <span onClick={()=>{}}>👍</span>
        likes({cnt}) / {likeCnt}
      </h4>
      <p>2024-07-04</p>
      </div>
      <div className='list'>
      <h4>{titles[1]}</h4>
      <p>2024-07-04</p>
      </div>
      <div className='list'>
      <h4>{titles[2]}</h4>
      <p>2024-07-04</p>
      </div>
    </div>
  );
}

 
export default App;
