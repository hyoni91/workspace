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
        //insert는 리액트에 데이터 넘길 필요없어서 리턴 따로 필요없음 (데이터 넘기는 건 res.data를 말함)
    }

    //로그인
    @PostMapping("/login")
    public MemberVO login(@RequestBody MemberVO memberVO){
       MemberVO member =  memberService.login(memberVO);
       //member에 조회된 데이터 없으면 null값을 가진다.
       //이때, 리액트는 null이 아닌 빈 문자로 들어간다.
        return member; //react에 자료 넘겨줌  res.data!!!
    }


}
