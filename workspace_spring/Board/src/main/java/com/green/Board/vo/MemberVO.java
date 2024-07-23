package com.green.Board.vo;

import lombok.Data;

import java.util.List;

@Data
public class MemberVO {
    //회원정보
    private String memId; //PK
    private String memPw; //not null
    private String memName; //not null
    private String gender;
    private String memRole; //회원등급 디폴트 USER

}
