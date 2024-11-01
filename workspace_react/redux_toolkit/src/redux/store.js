
//모든 state 변수를 저장하는 저장소 (프로젝트 당 한개만 생성가능)
import { configureStore } from "@reduxjs/toolkit";
import { numReducer } from "./numState";
import { memberReducer } from "./memberState";

const store = configureStore({
  reducer : {
    numState : numReducer,
    memberState : memberReducer
  }
}
);


export default store;