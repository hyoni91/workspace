package com.green.Security.Test.controller;


import com.green.Security.Test.service.MemberService;
import com.green.Security.Test.vo.MemberVO;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    //생성자 주입 방식(적극 권장!)  * 한번 주입된 멤버서비스 객체는 final 사용하여 코드 변경을 막는다.
    private final MemberService memberService;
    private final PasswordEncoder passwordEncoder;

    @GetMapping("/loginForm")
    public String loginForm(){
        String name = "java";

        //name 변수의 값을 암호화
        String encodedName = passwordEncoder.encode(name);
        System.out.println(encodedName);
        //출력 예시 : $2a$10$D5jtMrVY4ggVoFHHy1Tpue2jPLcYQRXPiGnD5xO8M93ylI42/qBAC

        //같은 문자열을 중복으로  암호화하면 둘 다 값이 다름
        String encodedName1 = passwordEncoder.encode(name);
        System.out.println(encodedName1);

        // 원본 데이터와 암호화된 데이터가 매치하는지 확인 (예)비밀번호가 일치하는 지 확인하기
        // 첫번째 매개변수 : 암호화 되지 전의 데이터
        // 두번째 매개변수 : 암호화된 데이터
        // 리턴타입 : boolean
        Boolean result1 = passwordEncoder.matches(name, encodedName);
        Boolean result2 = passwordEncoder.matches(name, encodedName1);
        Boolean result3 = passwordEncoder.matches("jang", encodedName1);
        System.out.println(result1); //true
        System.out.println(result2); //true
        System.out.println(result3); //false

        return "로그인 페이지";
    }

    @GetMapping("/joinForm")
    public String joinForm(){
        return "회원가입 페이지";
    }


    // 데이터 받기
    @PostMapping("/join")
    public String join(@RequestBody MemberVO memberVO){
        System.out.println(memberVO);

        //비밀번호 암호화
        String encodedPw = passwordEncoder.encode(memberVO.getMemPw());
        //암호화된 값으로 set하기
        memberVO.setMemPw(encodedPw);
        //기본권한 세팅하기
        memberVO.setMemRole("user");

        memberService.join(memberVO);

        return "회원가입 성공";

    }


}
