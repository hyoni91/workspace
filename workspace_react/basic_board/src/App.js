import logo from './logo.svg';
import './App.css';
import data from './data';
import BaordList from './BaordList';
import { Route, Routes, useParams } from 'react-router-dom';
import Detail from './Detail';
import Insert from './Insert';
import { useState } from 'react';
import InputTest from './InputTest';


function App() {
  //const board = data;   전개연산자 전 
  const [board, setBoard] = useState(data);

  return (
    <div className="App">
      <Routes>
        <Route path='/' element={<BaordList data={board} />}/>
        <Route path='/writeForm' element={<Insert board={board} setBoard={setBoard}/>}/>
        <Route path='/insert' element={<BaordList data={board}/>}/>
        <Route path='/detail/:boardNum' element={<Detail data={board}/>}/>
        <Route path='/delete/:boardNum' element={<Detail data={board} setBoard={setBoard}/>} />

        {/* input 값 입력받기 연습  */}
        <Route path='/insert_test' element={<InputTest />} />
      </Routes>

    </div>
  );
}

export default App;


