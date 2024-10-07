package com.green.Security.Test.service;

import com.green.Security.Test.vo.MemberVO;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("memberService")
@RequiredArgsConstructor
//  [spring] 핵심원리, IOC, DI 참고하기 많은 코드가 생략되어있음!!!!!!!!!!!!!
public class MemberServiceImpl implements MemberService{
    /*달라진 점
     1. 선언한 객체 위의 Autowired어노테이션 생략
     2. 선언한 변수에 final 추가
     3. 클래스 위에 @RequiredArgsConstructor 어노테이션 추가
    */


    // 생성자 주입
    private final SqlSessionTemplate sqlSession;

    @Override
    public void test1() {
        System.out.println("집중이 안돼");
    }

    @Override
    public void join(MemberVO memberVO) {
        sqlSession.insert("memberMapper.join", memberVO);
    }

    @Override
    public MemberVO getMemberForLogin(String memId) {
        return sqlSession.selectOne("memberMapper.getMemberForLogin", memId);
    }
}
