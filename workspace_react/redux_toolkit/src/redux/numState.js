import { createSlice } from "@reduxjs/toolkit"

//초기값 설정
const initNum = {
  value : 0
}

//slice : state변수의 초기화 및 함수 생성
const numSlice = createSlice({
  name : 'num',
  initialState : initNum,
  reducers : {
    addNum : (state,action) => {
      state.value = state.value +1
    },
    subNum : (state,action) => {
      state.value = state.value -1
    },
    resetNum : (state,action) => {
      state.value = 0
    },
    //action 주의사항 : 액션으로 넘어온 실제 데이터를 쓰고 싶을 경우 .payload를 호출한다.
    changeNum : (state,action) => {
      state.value = state.value + action.payload
    }
  }
});

//numSlice에 정의된 함수들
export const numActions = numSlice.actions;
//numSlice 전체 내용
export const numReducer = numSlice.reducer;