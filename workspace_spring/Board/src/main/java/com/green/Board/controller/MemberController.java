package com.green.Board.controller;

import com.green.Board.service.MemberService;
import com.green.Board.vo.MemberVO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j //로그를 남길때 쓰는 어노테이션
@RestController
@RequestMapping("/member")
public class MemberController {
    // login, join 회원관련

    @Resource(name = "memberService")
    private MemberService memberService;

    //중복확인
    @GetMapping("/idChk/{inputId}")
    public boolean idChk(@PathVariable("inputId") String inputId){
        log.info(inputId);
        return memberService.IsDuplicate(inputId);
    }

    //회원가입
    @PostMapping("/join")
    public void join(@RequestBody MemberVO memberVO){
        System.out.println(memberVO);
        memberService.join(memberVO);
    }

    //로그인
    @PostMapping("/login")
    public void login(@RequestBody MemberVO memberVO){

        memberService.login(memberVO);
    }


}
