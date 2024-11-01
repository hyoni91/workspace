import { Route, Router, Routes, useNavigate } from 'react-router-dom';
import './App.css';
import Origin from './Origin';
import UseRedux from './UseRedux';
import Member from './Member';

function App() {
  const navigate = useNavigate()

  return (
    <div className="App">
    
      <Routes>
        <Route path='/' element={
          <div>
          <h4>숫자 세기(기존방식)</h4>
            <button type='button' onClick={()=>navigate('/origin')}>기존방식</button>
          <h4>숫자 세기(Redux사용)</h4>
            <button type='button' onClick={()=>navigate('/useRedux')}>리덕스사용</button>
          <h4>회원상세페이지</h4>
          <button type='button' onClick={()=>navigate('/detail')}>회원상세페이지</button>
        </div>
        }/>
        <Route path='/origin' element={<Origin></Origin>}/>
        <Route path='/useRedux' element={<UseRedux></UseRedux>}/>
        <Route path='/detail' element={<Member></Member>}/>
      </Routes>
    </div>
  );
}

export default App;
