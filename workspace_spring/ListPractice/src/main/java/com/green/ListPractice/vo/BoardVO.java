package com.green.ListPractice.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data

//VO : Value Object
//DTO : Data Transfer Object (데이터 전달 객체)

//게시글 하나에 대한 정보를 담는 클래스
public class BoardVO {
    private int boardNum; //글번호
    private String title; //제목
    private String writer; //작성자
    private String createDate; //작성일
    private String content; //내용


    //람북으로  setter,getter,tostring 넣음
    // 어노테이션 setter,getter,tostring
    //보려면 Structure켜서 확인하면 됨!
    //@Setter
    //@Getter
    //@ToString
    //@Data (여러가지 다 나옴)

}
