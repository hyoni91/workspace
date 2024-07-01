package com.green.BasicBoard.vo;

import lombok.Data;

@Data
public class BoardVO {
    private int bNum;
    private String bTitle;
    private String bWriter;
    private String bContent;
    private String bDate;
    private int readCnt;
}
