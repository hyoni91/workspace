package com.green.DB_Member.vo;

//html에서 넘어오는 데이터를 편하게 받기 위한 클래스
//변수명은 DB를 베이스로 넣기!

import lombok.Data;

@Data
public class MemberVO {
    private int memNum;
    private String memName;
    private int memAge;
    private String memAddr;
}
