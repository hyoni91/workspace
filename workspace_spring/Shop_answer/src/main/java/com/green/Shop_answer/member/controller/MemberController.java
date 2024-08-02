package com.green.Shop_answer.member.controller;

import com.green.Shop_answer.member.sevice.MemberService;
import com.green.Shop_answer.member.vo.MemberVO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api_member")
public class MemberController {

    @Resource(name = "memberService")
    private MemberService memberService;

    @PostMapping("/join")
    public void join(@RequestBody MemberVO memberVO){
        memberService.join(memberVO);
    }

    @GetMapping("/idChk/{memId}")
    public boolean idChk(@PathVariable("memId") String memId){
        //idChk는 null이 아니니? ture = null이 아니다 ---> 중복
        //idChk는 nulldl 아니니? false = null이다 ---->  가입가능
        log.info("===================================memid:" + memId);

        return memberService.idChk(memId);

    }

}
