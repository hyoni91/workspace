package com.green.ReactBoard.service;

import com.green.ReactBoard.vo.BoardVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
    @Autowired
    SqlSessionTemplate sqlSession;

    //게시글 목록 조회
    @Override
    public List<BoardVO> getBoardList() {
            List<BoardVO> boardList = sqlSession.selectList("boardMapper.getBoardList");
        return boardList;
    }

    //상세조회
    @Override
    public BoardVO detailBoard(int boardNum) {
         return sqlSession.selectOne("boardMapper.detail",boardNum);
    }

    //글등록
    @Override
    public void insertBoard(BoardVO boardVO) {
        sqlSession.insert("boardMapper.insertBoard", boardVO);
    }


    //글삭제
    @Override
    public void deleteBoard(int boardNum) {
        sqlSession.delete("boardMapper.deleteBoard", boardNum);
    }

    //글수정
    @Override
    public void updateBoard(BoardVO boardVO) {
        sqlSession.update("boardMapper.updateBoard", boardVO);
    }


}
