package com.green.ReactBoard.service;

import com.green.ReactBoard.vo.BoardVO;

import java.util.List;

public interface BoardService {

    //게시글 목록 조회
    List<BoardVO> getBoardList();

    //상세조회
    BoardVO detailBoard(int boardNum);

    //글등록
    void insertBoard(BoardVO boardVO);

    //글삭제
    void deleteBoard(int boardNum);

    //글수정
    void updateBoard(BoardVO boardVO);

}
