import React from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { numActions } from './redux/numState';

const UseRedux = () => {
  //store에 저장된 state변수 num가져오기
  //매개변수 state : store에 저장된 모든 state변수 
  const num = useSelector(state => state.numState.value); //0 가져옴 

  //store에 저장된 함수 호출을 위한 dispatch생성
  const dispatch = useDispatch();

  //증가 함수예시
  //함수로 만들어서 사용하지 않고 짧으면 바로 사용 ok 
  //onclick참고 
  // const addNum = () => dispatch(numActions.addNum())  

  return (
    <div>
      <h2>COUNT APP (Redux사용)</h2>
      <div>
        <h3>{num}</h3>
        <div className='count'>
          <button 
            type='button' 
            onClick={()=>dispatch(numActions.addNum())}
          >
            +1
          </button>
          <button 
            type='button' 
            onClick={()=>dispatch(numActions.subNum())}
          >
            -1
          </button>
          <button 
            type='button' 
            onClick={()=>dispatch(numActions.resetNum())}
          >
            RESET
          </button>
          <button 
            type='button' 
            onClick={()=>dispatch(numActions.changeNum(50))}
          >
            Change
          </button>
        </div>
      </div>
    </div>
  )
}

export default UseRedux