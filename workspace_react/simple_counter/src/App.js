import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import Viewer from './Viewer';
import Controller from './Controller';

// 컴포넌트는 통상 js파일을 따로 만듦
// 만든 컴포넌트는 export로 내보내기 해야함
// App파일에 컴포넌트를 불러오려면 import해야함 (자동완성 추천)
function App() {
  //useState 는 값을 변경시키는 두번째 매개변수의 함수를 이용해야만 재렌더링 해줌
  const [cnt, setCnt] = useState(0);

  //controller 함수 
  //매개변수 num -> 변수로 변화값 만들어 주기
  function changeCount(num){
    const result = cnt + Number(num);
    setCnt(result)
  }

  // 부모 컴포넌트 -> 자식 컴포넌트에게 값 전달 가능 (props)
  // 즉, 뷰 컴포넌트에서 엡 컴포넌트로 값 전달 불가능
  return (
    <div className="App">
      <h2>Simple Counter</h2>

      <Viewer  cnt={cnt} />
      
      {/* 함수 그 자체를 전달할 수 있음 */}
      <Controller changeCount={changeCount}/>
    
    </div>
  );
}
  

export default App;




// onClick -> 하나하나, props와 useState로
// <Viewer  cnt={cnt} />
// <Controller  cnt={cnt} setCnt={setCnt}/>