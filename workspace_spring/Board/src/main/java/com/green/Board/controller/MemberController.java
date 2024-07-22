package com.green.Board.controller;

import com.green.Board.service.MemberService;
import com.green.Board.vo.MemberVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {
    // login, join 회원관련

    @Resource(name = "memberService")
    private MemberService memberService;

    @PostMapping("/join")
    public void join(@RequestBody MemberVO memberVO){
        System.out.println(memberVO);
        memberService.join(memberVO);
    }
}
