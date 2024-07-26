package com.green.Board.controller;

import com.green.Board.service.JoinService;
import com.green.Board.vo.BoardVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/join")
public class JoinController {

    @Resource(name = "joinService")
    private JoinService joinService;

    @GetMapping("/test1")
    public List<BoardVO> test1(){
        List<BoardVO> list = joinService.joinTest1();

        return list;
    }

    @GetMapping("/test2")
    public BoardVO test2(){
        return joinService.joinTest2();
    }
}
