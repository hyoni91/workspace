package com.green.BasicBoard.service;

import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;

import java.util.List;

public interface BoardService {

    //게시글 화면 목록
    List<BoardVO> bList(SearchVO searchVO);

    //글등록
    void bInsert(BoardVO boardVO);

    //상세조회
    BoardVO bDtail(int bNum);

    //수정
    void bUpdate(BoardVO boardVO);

    //삭제
    void bDelete(int bNum);

    //조회수 증가
    void updateReadCnt(int bNum);



}
