package com.green.Board.service;

import com.green.Board.vo.BoardVO;
import com.green.Board.vo.PageVO;
import com.green.Board.vo.SearchVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<BoardVO> getBoardList(PageVO pageVO) {
        return sqlSession.selectList("boardMapper.boardList", pageVO);
    }

    // 전체 게시글 개수
    @Override
    public int getTotalBoard() {
        return sqlSession.selectOne("boardMapper.totalBoardCnt");
    }


    @Override
    public void insert(BoardVO boardVO) {
        sqlSession.insert("boardMapper.insert", boardVO);
    }

    @Override
    public BoardVO detail(int boardNum) {
        return sqlSession.selectOne("boardMapper.detail", boardNum);
    }

    @Override
    public void delete(int boardNum) {
        sqlSession.delete("boardMapper.delete", boardNum);
    }

    //댓글과 게시글 함께 삭제
    @Override
    public void delete2(int boardNum) {
        sqlSession.delete("boardMapper.delete", boardNum);
        sqlSession.delete("replyMapper.delete", boardNum);

    }

    @Override
    public void update(BoardVO boardVO) {
        sqlSession.update("boardMapper.update", boardVO);
    }


}
