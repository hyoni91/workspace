package com.green.DBtest.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Impl => implements(구현하다)
//TEST_MEMBER 테이블에 데이터를 조작하는 DB(쿼리작성) 작업을 하는 클래스
@Service("memberService")  // MemberServiceImpl memberService(소괄호 안에 넣은 이름으로 객체 생성됨) = new MemberServiceImpl();
public class MemberServiceImpl implements MemberService{

    //쿼리 실행을 위한 메서드를 가지고 있는 객체
    /*
    [쿼리 실행을 위한 메서드]
    데이터 삽입(INSERT): 객체명.insert("쿼리가 있는 mapper 파일의 namespace.쿼리 id" , [실행할 쿼리의 빈값을 채우 데이터]);
    데이터 조회(SELECT(One)) : 객체명.selectOne("쿼리가 있는 mapper 파일의 namespace.쿼리 id" , []);
    데이터 조회(SELECT (List)) : 객체명.selectList("쿼리가 있는 mapper 파일의 namespace.쿼리 id", []);
    데이터 수정(UPDATE) : 객체명.update("쿼리가 있는 mapper 파일의 namespace.쿼리 id", []);
    데이터 삭제(DELETE) : 객체명.delete("쿼리가 있는 mapper 파일의 namespace.쿼리 id", []);
    */

    //@Autowired: 의존성 주입(DI)을 수행할 때 사용됩니다. 스프링은 해당 어노테이션이 지정된 필드나 생성자를 찾아 해당하는 빈(객체)을 주입
    @Autowired
    private SqlSessionTemplate sqlSession;

    //이 메소드가 실행되면 TEST_MEMBER 테이블에 하나의 데이터가 INSERT 되는 기능 구현
    @Override
    public void insertMember() {
        sqlSession.insert("memberMapper.insert1");

    }

    @Override
    public void insertMember2() {
        sqlSession.insert("memberMapper.insert2", 20);
    }
}
