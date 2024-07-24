package com.green.Board.service;

import com.green.Board.vo.ReplyVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("replyService")
public class ReplyServiceImpl implements ReplyService{

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public ReplyVO detail(int boardNum) {
        return sqlSession.selectOne("replyMapper.detail", boardNum);
    }
}
