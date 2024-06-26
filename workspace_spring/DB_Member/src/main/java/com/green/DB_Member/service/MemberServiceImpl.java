package com.green.DB_Member.service;


import com.green.DB_Member.vo.MemberVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//MVC 의 M : Model
//MemberService 인터페이스의 추상메서드를 구현한 클래스
//해당 클래스에서는 데이터베이스 쿼리 작업을 진행한다.
//mybatis 를 이용해 쿼리 작업을 하기 위해서는
//SqlSessionTemplate(mybatis 클래스) 클래스의 객체가 필요하다
//SqlSessionTemplate 클래스에는 쿼리 작업을 위한 메서드가 정의되어 있다.
//mybatis를 이용하면 sql세션템플레이트를 쓸 것임을 알기 때문에 객체생성을 하지 않아도 쓸 수 있다.

@Service("memberService")  // MeberServiceImpl을 memberService란 이름으로 객체생성 해줌
public class MemberServiceImpl implements MemberService{

    @Autowired // 생성된 객체의 자료형을 비교하여 생성된 객체를 사용
    private SqlSessionTemplate sqlSession;

    //데이터베이스에 회원정보 등록
    @Override
    public void insertMember(MemberVO memberVO) {
        //첫번째 매개변수 : namespace.쿼리id
        //두번째 매개변수 : 빈 값을 채울 매개변수나 값(직접입력)
    sqlSession.insert("memberMapper.insertMember",memberVO);


    }
}
