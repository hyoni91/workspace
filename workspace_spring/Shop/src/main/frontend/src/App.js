import './App.css';
import './reset.css';
import { Route, Routes, useNavigate } from 'react-router-dom';
import UserLayout from './pages/user/UserLayout';
import AdminLayout from './pages/admin/AdminLayout';
import Join from './pages/user/Join';
import Login from './pages/user/Login';
import { useEffect, useState } from 'react';
import ItemList from './pages/user/ItemList';

function App() {
  const navigate = useNavigate()

  const getLoginInfo = () =>{
    JSON.parse(window.sessionStorage.getItem('loginInfo'))}

  const [isLogin, setIsLogin] =useState({});

  useEffect(()=>{
    if(getLoginInfo != null){
      setIsLogin(getLoginInfo)
    }
    },[])

    console.log(isLogin)
  return (
    <div className="container">
      <div className='login-div'>
      <div className='header'>
        {
          isLogin != null?
            <>
                <span> <span className='memName-span'>'{isLogin.memName}'</span>님</span>
              <span>LOGOUT</span>
            </>

          :
          <>
            <span onClick={()=>{navigate('login')}}>LOGIN</span>
            <span onClick={()=>{navigate('join')}}>JOIN</span>
          </>
        }
          
        </div>
        <div className='banner'>
          <div>
            <img className='banner-img' src='http://localhost:8080/images/book_banner.jpg' />
          </div>
          <div className='title-div'>BOOK STORE</div>
        </div>
        
      </div>
      <div className='layout-div'>
        <Routes>

          {/* user route */}
          <Route path='/' element={<UserLayout />}>
            <Route path='' element={<ItemList />}/>
            <Route path='join' element={<Join />}/>
            <Route path='login' element={<Login setIsLogin={setIsLogin}/>}/>
            
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
