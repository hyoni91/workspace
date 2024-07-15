package com.green.ReactBoard.controller;


import com.green.ReactBoard.service.BoardService;
import com.green.ReactBoard.vo.BoardVO;
import jakarta.annotation.Resource;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*  @Controller와의 다른점
 1. 해당 클래스의 리턴은 html 파일명이 아니다.
 2. return : react로 만든 화면에 보여줄 테이터를 리턴한다.
 3. 메서드의 리턴타입을 신중하게 지정해야한다.
*/

@RestController
public class BoardController {
    @Resource(name="boardService")
    private BoardService boardService;

    @GetMapping("/boardList")
    public List<BoardVO> getBoardList(){
        List<BoardVO> boardList = boardService.getBoardList();
        return boardList;
    }

    @GetMapping("insert")
    public void insertBoard(BoardVO boardVO){
        boardService.insertBoard(boardVO);
    }

}
