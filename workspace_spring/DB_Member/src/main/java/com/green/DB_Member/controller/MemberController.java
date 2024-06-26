package com.green.DB_Member.controller;

import com.green.DB_Member.service.MemberService;
import com.green.DB_Member.service.MemberServiceImpl;
import com.green.DB_Member.vo.MemberVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//MVC 의 C :controller
@Controller // 컨트롤러 + 객체 생성
public class MemberController {

    @Resource(name="memberService") // memberService (여기선 MemberServiceImpl)라는 이름으로 만들어진 객체를 다음 변수명에 넣어주세요
    private MemberServiceImpl memberService;

    //회원 목록 페이지
    @GetMapping("/")
    public String memberList(){

        return "member_list";
    }

    @GetMapping("/insertForm")
    public String memberInsert(){

        return "reg_member";
    }

    //회원 등록 + 회원 목록 페이지
    @PostMapping("/insetMember")
    public String insertMember(MemberVO memberVO){
        System.out.println(memberVO);

        //HTML에서 가져온 데이터를 TEST_MEMBER 테이블에 INSERT
        memberService.insertMember(memberVO);

        return "redirect:/";
    }



}
