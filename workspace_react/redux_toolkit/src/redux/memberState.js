import { createSlice } from "@reduxjs/toolkit"

//회원정보 초기값 설정 
const initMember = {
  memId : '아이디정보없음',
  memName : '이름정보없음',
  memAge : 0
}

//slice변수 생성
const memberSlice = createSlice({
  name : 'member',
  initialState: initMember,
  reducers : {
    changeMemberInfo : (state,action)=>{
      state.memId = action.payload.memId
      state.memName = action.payload.memName
      state.memAge = action.payload.memAge
    },
    changeMemberName : (state,action)=>{
      state.memName = action.payload
    },
    changeMemberAge : (state,action)=>{
      state.memAge = action.payload
    }
  }
})


export const memberActions = memberSlice.actions;
export const memberReducer = memberSlice.reducer;