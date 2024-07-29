import logo from './logo.svg';
import './App.css';
import './reset.css';
import { Route, Router, Routes, useNavigate } from 'react-router-dom';
import CarInfo from './pages/CarInfo';

function App() {
  const navigate = useNavigate();
  return (
    <div className="container">
      <div className='header'>
        <div className='menubar'>
          <ul>
            <li onClick={()=>{navigate('/')}}>홈</li>
            <li onClick={()=>{navigate('/carinfo')}}>차량관리</li>
            <li onClick={()=>{navigate('/salesinfo')}}>판매정보등록</li>
            <li onClick={()=>{navigate('/carlist')}}>판매정보목록</li>
          </ul>
        </div>
      </div>

      <Routes>
        <Route path='/' element={<h1 className='header-h1'>차량 관리 시스템</h1>}/>
        <Route path='/carinfo' element={<CarInfo />}/>
        <Route path='/salesinfo' element={<div>판매정보</div>}/>
        <Route path='/carlist' element={<div>판매목록</div>}/>
      </Routes>


    </div>
  );
}

export default App;
