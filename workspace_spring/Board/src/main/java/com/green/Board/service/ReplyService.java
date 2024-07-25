package com.green.Board.service;

import com.green.Board.vo.ReplyVO;

import java.util.List;

public interface ReplyService {

    //상세 댓글
    List<ReplyVO> detail(int boardNum);

    void insert(ReplyVO replyVO);

    void delete(int replyNum);
}
