package com.green.DBtest.controller;

import com.green.DBtest.service.MemberService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @Resource(name = "memberService")
    private MemberService memberService;

    //이 메소드가 실행되면 TEST_MEMBER 테이블에 하나의 데이터가 INSERT 됨
    @GetMapping("/insert1")
    public String insert1(){
        memberService.insertMember();
        return "insert_1";
    }



}
