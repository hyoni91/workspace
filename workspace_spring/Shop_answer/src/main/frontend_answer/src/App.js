import './App.css';
import './reset.css'
import { Route, Routes, useNavigate } from 'react-router-dom';
import UserLayout from './pages/user/UserLayout';
import AdminLayout from './pages/admin/AdminLayout';
import Join from './pages/user/Join';


function App() {
  const navigate = useNavigate()
  return (
    <div className="container">
      <div className='login-div'>
      <div className='header'>
          <span onClick={()=>{navigate('login')}}>LOGIN</span>
          <span onClick={()=>{navigate('join')}}>JOIN</span>
        </div>
        <div className='banner'>
          <div>
            <img className='banner-img' src='http://localhost:8080/images/banner4.jpg' />
          </div>
          <div className='title-div'>BOOK STORE</div>
        </div>
        
      </div>
      <div className='layout-div'>
        <Routes>

          {/* user route */}
          <Route path='/' element={<UserLayout />}>
            <Route path='' element={<div>상품 목록 화면</div>}/>
            <Route path='join' element={<Join />}/>
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
