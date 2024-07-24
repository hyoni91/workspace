package com.green.Board.service;

import com.green.Board.vo.BoardVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<BoardVO> getBoardList() {
        return sqlSession.selectList("boardMapper.boardList");

    }

    @Override
    public void insert(BoardVO boardVO) {
        sqlSession.insert("boardMapper.insert", boardVO);
    }

    @Override
    public BoardVO detail(int boardNum) {
        return sqlSession.selectOne("boardMapper.detail", boardNum);
    }

//    @Override
//    public BoardVO detail(int boardNum) {
//        return sqlSession.selectOne("boardMapper.detail", boardNum);
//    }
}
