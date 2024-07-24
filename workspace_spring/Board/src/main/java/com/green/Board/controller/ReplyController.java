package com.green.Board.controller;

import com.green.Board.service.ReplyService;
import com.green.Board.vo.ReplyVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reply")
public class ReplyController {
    //댓글 관련
    @Resource(name = "replyService")
    private ReplyService replyService;

    //댓글 상세
    @GetMapping("/list")
    ReplyVO detail(@PathVariable("boardNum") int boardNum){
        return replyService.detail(boardNum);

    }
}
