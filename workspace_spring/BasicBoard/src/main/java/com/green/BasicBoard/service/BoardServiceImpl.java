package com.green.BasicBoard.service;

import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;
import jakarta.annotation.Resource;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
    @Autowired
    SqlSessionTemplate sqlSession;
    List<BoardVO> boardList = new ArrayList<>();

    //목록조회
    @Override
    public List<BoardVO> bList(SearchVO searchVO) {
        List<BoardVO> board = sqlSession.selectList("boardMapper.select", searchVO);
        return board;
    }

    //등록하기
    @Override
    public void bInsert(BoardVO boardVO) {
        sqlSession.insert("boardMapper.insert",boardVO);
    }

    //상세정보
    @Override
    public BoardVO bDtail(int bNum) {
        return sqlSession.selectOne("boardMapper.detail",bNum);
    }

    @Override
    public void bUpdate(BoardVO boardVO) {
        sqlSession.update("boardMapper.update",boardVO);

    }

    @Override
    public void bDelete(int bNum) {
        sqlSession.delete("boardMapper.delete",bNum);
    }


}
