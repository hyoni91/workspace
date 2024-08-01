import './App.css';
import './reset.css'
import { Route, Routes } from 'react-router-dom';
import UserLayout from './pages/user/UserLayout';
import AdminLayout from './pages/admin/AdminLayout';

function App() {
  return (
    <div className="container">
      <div className='header'>
        <div className='login-div'>
          <span>login</span>
          <span>join</span>
        </div>
      </div>
      <div className='layout-div'>
        <Routes>

          {/* user route */}
          <Route path='/' element={<UserLayout />}>
            {/* 첫 화면은 상품목록 (부모 라우터의 주소가 / 이므로 path는 공백 OK) */}
            <Route path='' element={<div>상품 목록 화면</div>}/>
            <Route path='test1' element={<div>test first view</div>}/>
            <Route path='test2' element={<div>test second view</div>}/>
          </Route>

          {/* admin route */}
          <Route path='/admin' element={<AdminLayout />}>
            <Route path='test1' element={<div>admin first page</div>}/>
            <Route path='test2' element={<div>admin second page</div>}/>
          </Route>

        </Routes>
      </div>

    </div>
  );
}

export default App;
