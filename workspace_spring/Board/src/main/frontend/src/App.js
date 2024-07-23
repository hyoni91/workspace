import logo from './logo.svg';
import './App.css';
import './reset.css'
import { Route, Routes } from 'react-router-dom';
import BoardList from './pages/BoardList';
import Join from './pages/Join';
import Login from './pages/Login';
import WirteFrom from './pages/WirteFrom';
import Detail from './pages/Detail';
import Update from './pages/Update';

function App() {
  return (
    <div className="App">
      
      <Routes>
        <Route path='/' element={<BoardList />}/>
        <Route path='/join' element={<Join />}/>
        <Route path='/login' element={<Login />}/>
        <Route path='/wirteForm' element={<WirteFrom />}/>
        <Route path='/detail/:boardNum' element={<Detail />}/>
        <Route path='/update' element={<Update />}/>
      </Routes>

    </div>
  );
}

export default App;
