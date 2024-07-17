import logo from './logo.svg';
import './App.css';

import { Link, Route, Routes } from 'react-router-dom';
import StuInfo from './StuInfo';
import StuInput from './StuInput';
import StuDelete from './StuDelete';
import StuScoInfo from './StuScoInfo';
import StuDetail from './StuDetail';

function App() {
  return (
    <div className="App">
      <div className='stu-menu'>
        <ul>
          <li><Link  to={'/'}>학생정보조회</Link></li>
          <li><Link  to={'/stuInput'}>학생등록</Link></li>
          <li><Link  to={'/stuDelete'}>학생삭제</Link></li>
          <li><Link  to={'/stuScoInfo'}>성적관리</Link></li>
        </ul>
      </div>

      <div className='content'>
        <Routes>
          <Route path='/' element={<StuInfo />}/>
          <Route path='/stuInput' element={<StuInput />}/>
          <Route path='/stuDelete' element={<StuDelete />}/>
          <Route path='/stuScoInfo' element={<StuScoInfo />}/>
          <Route path='/detail/:stuNum' element={<StuDetail />}/>
        </Routes>
      </div>
    
    </div>
  );
}

export default App;
