package com.green.Shop.member.controller;

import com.green.Shop.member.sevice.MemberService;
import com.green.Shop.member.vo.MemberVO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("member")
public class MemberController {

    @Resource(name = "memberService")
    private MemberService memberService;

    //아이디중복검사
    @GetMapping("/isChkId/{memId}")
    public boolean isChkId(@PathVariable("memId") String memId){
        log.info("===============================id:"+ memId);
        return memberService.isDuplicate(memId);
    }

    @PostMapping("join")
    public void join(@RequestBody MemberVO memberVO){
        log.info("=============================member:"+ memberVO);
        memberService.join(memberVO);
    }
}
