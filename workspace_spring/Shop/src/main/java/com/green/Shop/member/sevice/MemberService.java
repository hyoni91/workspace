package com.green.Shop.member.sevice;

import com.green.Shop.member.vo.MemberVO;

public interface MemberService {

    boolean isDuplicate(String memId);

    void join(MemberVO memberVO);

    MemberVO login(MemberVO memberVO);

}
