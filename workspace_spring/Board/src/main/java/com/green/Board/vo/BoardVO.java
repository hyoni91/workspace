package com.green.Board.vo;

import lombok.Data;

import java.util.List;

@Data
public class BoardVO {
    //게시글 정보
    private int boardNum;  //PK
    private String title;
    private String content;
    private String memId;  //FK
    private String createDate;


}
