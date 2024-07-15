import logo from './logo.svg';
import './App.css';
import data from './data';
import ItemList from './ItemList';
import Item from './Item';
import axios from 'axios';
import { Link, Route, Routes } from 'react-router-dom';
import Detail from './Detail';

function App() {
  //상품 목록 데이터 
  const item_list = data;

  return (
    <div className="App">
      
      {/* 클릭하면 페이지 이동 */}
      <div className='header'>
        Book Shop☀
        <Link to={'/list'}>상품 목록</Link> 
      </div>
      <div className='banner'>
        <img src={process.env.PUBLIC_URL + '/header.jpg'}/>
      </div>

      {/* 이동할 수 있는 페이지의 url등   path='URL'  element={내용}*/}
      <Routes>
        <Route path='/' element={<div>메인페이지</div>} />
        <Route path='/list' element={<ItemList item_list = {item_list} />}/>
        <Route path='/detail/:id' element={<Detail item={item_list}/> }/>
        <Route path='*' element={<div>잘못된 페이지 입니다.</div>}/>
      </Routes>


      {/* 구조분해 할당 예시 */}
      {/* <Test  name={'yam'} age={20}/> */}
    </div>
  );
}


//props는 객체형태!!!!!!!!!!
//구조분해 할당으로 props사용하기
const Test = ({name,age})=>{
  return (
    <div> name = {name}, age ={age} </div>
  );
}

export default App;
