package com.green.Shop.member.sevice;

import com.green.Shop.member.vo.MemberVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public boolean isDuplicate(String memId) {
        //true =  null이 아니다 --> 가입 못함
        //false = null이다 --> 가입 됨
        String chKId = sqlSession.selectOne("memberMapper.isDuplicate",memId);
        return chKId !=null;
    }

    @Override
    public void join(MemberVO memberVO) {
        sqlSession.insert("memberMapper.join", memberVO);
    }

}
