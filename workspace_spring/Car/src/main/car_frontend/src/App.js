import logo from './logo.svg';
import './App.css';
import './reset.css';
import { Route, Router, Routes, useNavigate } from 'react-router-dom';
import CarInfo from './pages/CarInfo';
import SalesInfo from './pages/SalesInfo';
import SaleList from './pages/SaleList';

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
        <Route path='/' element={<div>
        <img className='background-img' src={(`http://localhost:8080/images/car2.jpg`)}/>
        <h1 className='header-h1'>차량 관리 시스템</h1>
      </div>}/>
        <Route path='/carinfo' element={<CarInfo />}/>
        <Route path='/salesinfo' element={<SalesInfo />}/>
        <Route path='/carlist' element={<SaleList />}/>
      </Routes>


    </div>
  );
}

export default App;
