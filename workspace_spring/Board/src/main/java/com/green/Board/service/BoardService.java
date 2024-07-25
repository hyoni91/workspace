package com.green.Board.service;

import com.green.Board.vo.BoardVO;
import com.green.Board.vo.SearchVO;

import java.util.List;

public interface BoardService {

    List<BoardVO> getBoardList();

    //글 등록
    void insert(BoardVO boardVO);

    //상세 글
    BoardVO detail(int boardNum);

}
