package com.green.Board.controller;

import com.green.Board.service.BoardService;
import com.green.Board.vo.BoardVO;
import jakarta.annotation.Resource;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/board")
public class BoardController {
    //게시판 관련

    @Resource(name="boardService")
    private BoardService boardService;

    //게시글 목록
    @GetMapping("/list")
    public List<BoardVO> getBoardList(){
        return boardService.getBoardList();
    }

//    //상세페이지
//    @GetMapping("/detail")
//    public BoardVO detail(@PathVariable("boardNum") int boardNum){
//        log.info(boardNum);
//        return boardService.detail(boardNum);
//    }

    //글등록
    @PostMapping("/insert")
    public void insert(@RequestBody BoardVO boardVO){
        System.out.println(boardVO);
        boardService.insert(boardVO);
    }

    //상세글
    @GetMapping("/detail/{boardNum}")
    public BoardVO detail(@PathVariable("boardNum") int boardNum){
        System.out.println(boardService.detail(boardNum));
        return boardService.detail(boardNum);
    }
}



