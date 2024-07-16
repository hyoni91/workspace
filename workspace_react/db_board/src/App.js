import logo from './logo.svg';
import './App.css';
import { Route, Routes } from 'react-router-dom';
import BoardList from './BoardList';
import InsertBoard from './InsertBoard';
import DetailBoard from './DetailBoard';
import AxiosTest from './AxiosTest';
import UpdateBoard from './UpdateBoard';

function App() {
  return (
    <div className="App">
      <Routes>
        {/* axios예제 페이지 */}
        <Route path='/practice' element={<AxiosTest />}/>

        {/* 게시글 목록 */}
        <Route path='/' element={<BoardList />}/>
        {/* 작성 */}
        <Route path='/insertBoard' element={<InsertBoard />}/>
        {/* 상세 */}
        <Route path='/detail/:boardNum' element={<DetailBoard />}/>
        {/* 수정 */}
        <Route path='/update/:boardNum' element={<UpdateBoard />}/>
        {/* 삭제 */}
        <Route path='/:boardNum' element={<UpdateBoard />}/>
        
      </Routes>
    </div>
  );
}

export default App;
