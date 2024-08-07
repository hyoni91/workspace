import './App.css';
import './reset.css';
import { Route, Routes, useNavigate } from 'react-router-dom';
import UserLayout from './pages/user/UserLayout';
import AdminLayout from './pages/admin/AdminLayout';
import Join from './pages/user/Join';
import Login from './pages/user/Login';
import { useEffect, useState } from 'react';
import RegItem from './pages/admin/RegItem';

function App() {
  const navigate = useNavigate()

  const [isLogin, setIsLogin] =useState({});

  useEffect(()=>{
    const getLoginInfo = window.sessionStorage.getItem('loginInfo')

    if(getLoginInfo != null){
      
      const obj_loginInfo = JSON.parse(getLoginInfo)
      
      setIsLogin(obj_loginInfo)

    }
    },[])

    console.log(isLogin)
  return (
    <div className="container">
      <div className='login-div'>
      <div className='header'>
        {
          Object.keys(isLogin) != 0?
            <>
                <span> <span className='memName-span'>'{isLogin.memName}'</span>님</span>
              <span onClick={()=>{
                window.sessionStorage.removeItem('loginInfo')
                  setIsLogin({})
                  navigate('/')
              }}>LOGOUT</span>
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
            <Route path='join' element={<Join />}/>
            <Route path='login' element={<Login setIsLogin={setIsLogin} isLogin={isLogin}  />}/>
            
          </Route>

          {/* admin route */}
          <Route path='/admin' element={<AdminLayout />}>
            <Route path='regItem' element={<RegItem />}/>
          </Route>

        </Routes>
      </div>

    </div>
  );
}

export default App;
