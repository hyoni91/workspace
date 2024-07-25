package com.green.Board.controller;

import com.green.Board.service.ReplyService;
import com.green.Board.vo.ReplyVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reply")
public class ReplyController {
    //댓글 관련
    @Resource(name = "replyService")
    private ReplyService replyService;

    //댓글 상세
    @GetMapping("/detail/{boardNum}")
    List<ReplyVO> detail(@PathVariable("boardNum") int boardNum){
        return replyService.detail(boardNum);

    }

    //댓글 달기
    @PostMapping("/insert")
    public void insert(@RequestBody ReplyVO replyVO){
        replyService.insert(replyVO);
    }

    @DeleteMapping("/delete/{replyNum}")
    public void delete(@PathVariable("replyNum") int replyNum){
        replyService.delete(replyNum);
    }
}
