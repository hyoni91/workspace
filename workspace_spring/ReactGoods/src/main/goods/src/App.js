import logo from './logo.svg';
import './App.css';
import './reset.css';
import { Link, Route, Routes } from 'react-router-dom';
import ItemInfo from './ItemInfo';
import ItemInfut from './ItemInfut';
import InputDetail from './InputDetail';

function App() {
  return (
    <div className="App">
      <div className='header'>
        <ul>
          <li><Link to={'/'}>상품정보</Link></li>
          <li><Link to={'/insert'}>상품등록</Link></li>
          <li><Link to={'/order'}>주문하기</Link></li>
          <li><Link to={'/orderList'}>주문목록</Link></li>
        </ul>
      </div>

      <div className='content'>
        <Routes>
          <Route path='/' element={<ItemInfo />} />
          <Route path='/insert' element={<ItemInfut />} />
          <Route path='/order' element={<div>주문하기</div>} />
          <Route path='/orderList' element={<div>주문목록</div>} />
          <Route path='/detail/:itemNum' element={<InputDetail />}/>
        </Routes>
      </div>

      

    </div>
  );
}

export default App;
