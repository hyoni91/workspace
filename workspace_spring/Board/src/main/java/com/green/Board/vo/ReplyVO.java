package com.green.Board.vo;

import lombok.Data;

@Data
public class ReplyVO {
    //댓글 정보
    private int replyNum; //PK
    private String replyContent;
    private String replyDate;
    private String memId;  //FK
    private int boardNum; //FK
}
