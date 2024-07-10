import logo from './logo.svg';
import './App.css';
import data from './data';
import ItemList from './ItemList';
import Item from './Item';
import axios from 'axios';

function App() {
  //상품 목록 데이터 
  // const item_list = data  리액트에서 data선언 후 사용

  // 자바에서 받은 값 넣기 위해 선언
  let item_list = []; 

  //spring에서 get해오기 
  //응답 (res)  java데이터 받기 (get)
  //then (받아 온 후, 할 일)
 axios.get('/test1')
    .then((respons)=>{
      console.log(respons.data)
    }); 

  axios.get('/test2')
    .then((res)=>{
      console.log(res.data)
    })

  let arr = [] 
  axios.get('/test3')
    .then((res)=>{
      console.log(res.data)
      arr = res.data
    })  
   
    
    axios.get('/test4')
    .then((res)=>{
      console.log(res.data)
      item_list = res.data;
    })
    

    
  


  return (
    <div className="App">
      <div className='header'>
        Book Shop☀
      </div>
      <div className='banner'>
        <img src={process.env.PUBLIC_URL + '/header.jpg'}/>
      </div>
      <ItemList item_list = {item_list} />

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
