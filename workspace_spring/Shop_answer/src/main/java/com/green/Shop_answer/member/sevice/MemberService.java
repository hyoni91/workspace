package com.green.Shop_answer.member.sevice;


import com.green.Shop_answer.member.vo.MemberVO;

public interface MemberService {

    //회원가입
    void join(MemberVO memberVO);

    //id중복체크
    boolean idChk(String memId);

    //로그인
    MemberVO login(MemberVO memberVO);
}
