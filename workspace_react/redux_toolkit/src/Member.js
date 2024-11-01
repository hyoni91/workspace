import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useDispatch, useSelector } from 'react-redux';
import store from './redux/store';
import { memberActions } from './redux/memberState';

const Member = () => {
  //회원정보를 저장하고 있는 변수 불러오기
  const member = useSelector(state => state.memberState);
  const dispatch = useDispatch();

  useEffect(()=>{
   //DB에서 조회한 데이터(axios로 가져왔다고 가정)
    const selectedMember = {
      memId : 'SUSU',
      memName : '슈퍼',
      memAge : 30
    }
    //조회한 정보로 store에 저장된 member객체 정보 변경
    dispatch(memberActions.changeMemberName('수퍼참치'))
    dispatch(memberActions.changeMemberAge(20))
    dispatch(memberActions.changeMemberInfo(selectedMember));

  },[dispatch])


  return (
    <div>
      <h3>회원 상세 정보</h3>
      <div className='member'>
        <div>ID : {member.memId}</div>
        <div>이름 : {member.memName}</div>
        <div>나이 : {member.memAge}</div>
      </div>
    </div>
  )
}

export default Member;