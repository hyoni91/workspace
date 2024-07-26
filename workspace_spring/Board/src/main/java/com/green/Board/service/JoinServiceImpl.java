package com.green.Board.service;

import com.green.Board.vo.BoardVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("joinService")
public class JoinServiceImpl implements JoinService{

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<BoardVO> joinTest1() {
        return sqlSession.selectList("joinMapper.testB");
    }

    @Override
    public BoardVO joinTest2() {
        return sqlSession.selectOne("joinMapper.test2");
    }

}
