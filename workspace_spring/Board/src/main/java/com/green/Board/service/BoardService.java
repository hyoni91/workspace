package com.green.Board.service;

import com.green.Board.vo.BoardVO;

import java.util.List;

public interface BoardService {

    List<BoardVO> getBoardList();

//    //상세
//    BoardVO detail(int boardNum);

    //글 등록
    void insert(BoardVO boardVO);

    //상세 글
    BoardVO detail(int boardNum);
}
