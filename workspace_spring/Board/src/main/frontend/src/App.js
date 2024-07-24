import logo from './logo.svg';
import './App.css';
import './reset.css'
import { Route, Routes, useNavigate } from 'react-router-dom';
import BoardList from './pages/BoardList';
import Join from './pages/Join';
import Login from './pages/Login';
import WirteFrom from './pages/WirteFrom';
import Detail from './pages/Detail';
import Update from './pages/Update';
import Joincopy from './pages/Join copy';
import { useEffect, useState } from 'react';

function App() {
  //로그인 여부 state변수
  const navigate = useNavigate()
  const getLoginInfo = JSON.parse(window.sessionStorage.getItem('loginInfo'))
  const [ isLogin, setIsLogin ] = useState({});
  console.log(isLogin)
  useEffect(()=>{
    if(getLoginInfo != null){
      setIsLogin(getLoginInfo)
    }
  },[])

  return (
    <div className="App">

        <div className='login-div'>
          { 
              isLogin.memName != null ?
              <div> 
                <span className='namespan'>'{isLogin.memName}'</span> 님 반갑습니다. 
                  <span className='logout' onClick={()=>{
                    //Storage의 정보 제거 & 그림을 다시 그리기 위해 state변수 값 변경
                    const result = window.sessionStorage.removeItem(setIsLogin('loginInfo'))
                  }}>💁‍♀️logout</span>
              </div>
              :
              <>
                <span onClick={()=>{navigate('/login')}}>Login</span> 
                <span onClick={()=>{navigate('/join')}}>Join</span>
              </>
              
            }
        </div>
      <Routes>
        <Route path='/' element={<BoardList/>}/>
        <Route path='/join' element={<Join />}/>
        <Route path='/login' element={<Login setIsLogin={setIsLogin}/>}/>
        <Route path='/wirteForm' element={<WirteFrom getLoginInfo={getLoginInfo}/>}/>
        <Route path='/detail/:boardNum' element={<Detail />}/>
        <Route path='/update' element={<Update />}/>
        {/* <Route path='/test' element={<Joincopy/>}/> */}
      </Routes>
    
      
    
      
    </div>
  );
}

export default App;
