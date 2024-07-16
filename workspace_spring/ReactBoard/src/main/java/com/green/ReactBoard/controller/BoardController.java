package com.green.ReactBoard.controller;


import com.green.ReactBoard.service.BoardService;
import com.green.ReactBoard.vo.BoardVO;
import jakarta.annotation.Resource;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.web.bind.annotation.*;

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

    //목록조회
    @GetMapping("/boardList")
    public List<BoardVO> getBoardList(){
        List<BoardVO> boardList = boardService.getBoardList();
        return boardList;
    }

    //상세보기
    @GetMapping("/detail/{boardNum}")
    public BoardVO detailBoard(@PathVariable("boardNum") int boardNum) {
        System.out.println(boardService.detailBoard(boardNum)); //확인용
        return boardService.detailBoard(boardNum);
    }

    //글등록
    @PostMapping("/insertBoard")
    public BoardVO insertBoard(@RequestBody BoardVO boardVO){
        System.out.println(boardVO);
         boardService.insertBoard(boardVO);
        return boardVO;
    }

    //삭제하기
    @DeleteMapping("/delete/{boardNum}")
    public void deleteBoard(@PathVariable("boardNum") int boardNum , BoardVO boardVO){
        System.out.println(boardNum);
        System.out.println(boardVO);
        boardService.deleteBoard(boardNum);

    }

    //수정하기
    @PutMapping("/updateBoard")
    public void updateBoard(@RequestBody BoardVO boardVO){
        System.out.println(boardVO);
        boardService.updateBoard(boardVO);
    }


}
