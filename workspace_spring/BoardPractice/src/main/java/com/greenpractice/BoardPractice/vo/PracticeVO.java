package com.greenpractice.BoardPractice.vo;

import lombok.Data;

@Data
public class PracticeVO {

    private int pNum;
    private String title;
    private String writer;
    private String content;
    private String pDate;
    private int readCnt;
}
