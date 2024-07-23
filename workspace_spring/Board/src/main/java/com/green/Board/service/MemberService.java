package com.green.Board.service;

import com.green.Board.vo.MemberVO;

public interface MemberService {

    boolean IsDuplicate(String memId);

    void join(MemberVO memberVO);

    //login
    MemberVO login(MemberVO memberVO);
}
