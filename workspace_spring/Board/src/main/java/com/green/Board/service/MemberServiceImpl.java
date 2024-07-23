package com.green.Board.service;

import com.green.Board.vo.MemberVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("memberService")
public class MemberServiceImpl implements MemberService{

    @Autowired
    private SqlSessionTemplate sqlSession;

    //아이디 중복 검사
    // 중복 true
    @Override
    public boolean IsDuplicate(String memId) {
        //쿼리문에서 String으로 받기로 했으므로 string으로 받기
        //조회가 안되면(값이 없음) string은 null이 나옴
        //null이 나오면 회원 가입 가능함
        String memberId = sqlSession.selectOne("memberMapper.isDuplicate", memId);

        return memberId != null;   //아이디가 널이 아니니??? ==> null이 아니면 true가 리턴되어 나옴
    }

    //회원가입
    @Override
    public void join(MemberVO memberVO) {
        sqlSession.insert("memberMapper.join", memberVO);
    }

    @Override
    public MemberVO login(MemberVO memberVO) {
        return sqlSession.selectOne("memberMapper.login" , memberVO);
    }

    //로그인

}
