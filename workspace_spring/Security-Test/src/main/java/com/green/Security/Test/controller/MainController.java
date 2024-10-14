package com.green.Security.Test.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    //클라이언트 헤더에 토큰을 잘 전달 받았는지 확인
    @GetMapping("/getToken")
    public String getTokenTest(){

        return "헤더에 토큰 전달 받았음";
    }

    //인증받지 않은 사람도 접근할 수 있는 요청
    @GetMapping("/test1")
    public String test1(){
        return "인증받지 않은 사람도 접근 가능";
    }


    //인증받은 사람만 접근할 수 있는 요청
    @GetMapping("/test2")
    public String test2(){
        return "인증받은 사람만 접근 가능";
    }

    //인증 + 일반회원만 접근 가능
    @GetMapping("/test3")
    public String test3(){
        return "인증 + 일반회원만 접근 가능";
    }

    //인증 + 관리자 권한만 있는 사람만 접근 가능
    @GetMapping("/test4")
    public String test4(){
        return "인증 + 관리자 권한만 있는 사람만 접근 가능";
    }

    //인증 + 매니저 or 관리자만 접근 가능
    @GetMapping("/test5")
    public String test5(){
        return "인증 + 매니저 or 관리자만 접근 가능";
    }




}
