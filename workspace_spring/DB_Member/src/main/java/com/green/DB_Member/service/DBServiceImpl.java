package com.green.DB_Member.service;

import com.green.DB_Member.vo.MemberVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//인터페이스를 구현할 메서드 설계
@Service("dbService")
public class DBServiceImpl implements DBService{
    @Autowired
    SqlSessionTemplate sqlSession;


    //실행할 쿼리가 select 의 경우, selectOne() 또는 selectList() 메서드 중 하나 사용!
    //조회 결과 데이터가 0행 또는 1행 : selectOne()
    //조회 결과 데이터의 행 개수가 고정되지 않으면 : selectList() --> 현시점 이후에 추가 되었을 때, 행 개수가 여러개가 될수 있으면 List
    @Override
    public String selectNum1() {
     String name = sqlSession.selectOne("dbMapper.selectNum1");
        return name;
    }

    //전달받은 회원번호로(memNum 매개변수) 회원 나이 조회
    @Override
    public int select2(int memNum) {
        int age = sqlSession.selectOne("dbMapper.select2",memNum);
        return age;
    }

    //전달받은 나이 이상의 회원 이름을 조회
    @Override
    public List<String> selcet3(int memAge) {
       List<String> nameList = sqlSession.selectList("dbMapper.select3",memAge);
        return nameList;
    }

    //전달받은 회원 번호를 지닌 회원의 회원번호, 이름, 나이, 주소를 조회
    @Override
    public MemberVO select4(int memNum) {
        MemberVO member1 = sqlSession.selectOne("dbMapper.select4",memNum);
        return member1;
    }


    //모든 회원의 회원번호, 이름, 나이, 주소를 조회
    @Override
    public List<MemberVO> select5() {
        List<MemberVO> memberList = sqlSession.selectList("dbMapper.select5");

        return memberList;
    }

    @Override
    public int delete(int memNum) {
        int result = sqlSession.delete("dbMapper.delete",memNum);
        return result;
    }

    @Override
    public void insert(MemberVO memberVO) {
        sqlSession.insert("dbMapper.insert", memberVO);
    }

    @Override
    public void update(MemberVO memberVO) {
        sqlSession.update("dbMapper.update", memberVO);
    }


}

