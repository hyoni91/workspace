import logo from './logo.svg';
import './App.css';
import { Route, Routes } from 'react-router-dom';
import BoardList from './BoardList';
import InsertBoard from './InsertBoard';

function App() {
  return (
    <div className="App">
      <Routes>
        //게시글 목록 페이지
        <Route path='/' element={<BoardList />}/>
        <Route path='/insertBoard' element={<InsertBoard />}/>
        <Route path='/detail' element={<div>detail페이지</div>}/>
      </Routes>
    </div>
  );
}

export default App;
