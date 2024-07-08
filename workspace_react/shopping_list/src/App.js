import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import List from './List';
import Add from './Add';

function App() {

  //장보기 목록 변수
  const [list, setList] = useState(['계란', '우유','버터'])
 
  return (
    <div className="App">
       <h1> Shopping List</h1>

      <div className='list'>
        <h2> 장보기 목록🍳</h2>
          <List list={list} setList={setList}/>
      </div>

      <Add list={list} setList={setList}/>    
  
  
    </div>
  );
}



export default App;
