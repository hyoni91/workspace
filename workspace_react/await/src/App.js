import './App.css';
import axios from 'axios';
import { getList } from './testApi';

function App() {

  //동기 & 비동기(axios)
  function test1(){
    console.log("test1 시작")

    let result = '';
    
    axios.get("/test1")
    .then(res => {
      result = res.data;
      console.log("test1 결과 : " + result)

    })
    .catch(error => console.log(error))
    console.log("test1 끝")
  }


  //async 사용 : 함수 앞에 위치 => 함수가 비동기 방식으로 실행
  //await 사용 : 동기 방식으로 실행
  async function test2(){
    try{
      console.log("test2 시작")
      let result = '';   
      const res = await axios.get("/test1")  //결과를 받아오면 실행됨 = then의 결과와 같음
      result =  res.data;
      console.log("test2 결과: " + result)
      console.log("test2 끝")
    }catch(error){
      console.log(error) //catch문 결과와 같음
    }
  }

  function test3(){
    console.log("test3 시작")
    test2()
    console.log("test3 끝")
  }

  

  return (
    <div className="container">
      <div className='button-div'>
        <button 
          type='button'
          onClick={()=>{test1()}}  
        >
          TEST_1
        </button>
      </div>
      <div className='button-div'>
        <button 
          type='button'
          onClick={()=>{test2()}}  
        >
          TEST_2
        </button>
      </div>
      <div className='button-div'>
        <button 
          type='button'
          onClick={()=>{test3()}}  
        >
          TEST_3
        </button>
      </div>
      <div className='button-div'>
        <button 
          type='button'
          onClick={()=>{getList()}}  
        >
          getList함수 
        </button>
      </div>
    </div>
  );
}

export default App;
