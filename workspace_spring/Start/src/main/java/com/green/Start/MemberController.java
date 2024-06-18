package com.green.Start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MemberController {

    //1.자바에서 html로 데이터를 전달하기 위해서는 실행되는 메서드의 매개변수의 model 인터페이스 객체 선언
    //2.선언한 객체명.addAttribute메서드를 사용하여 데이터를 전달한다.
    @GetMapping("/main")
    public String goMain(Model m){
        m.addAttribute("name","java");  //Model addAttribute(String name(Key), Object value(Value));
        m.addAttribute("age",1110); // html 이릉으로 전달 -> 키값으로 리턴
        return "main";
    }

    @GetMapping("/test_login")
    public String goLogin(Model mo1){
        String[] hobbies = {"독서","운동","베이킹"};
        mo1.addAttribute("hobby",hobbies);

        Member member1 = new Member("김석진",22,100);
        mo1.addAttribute("member",member1);

    return "test_login";

    }

    @GetMapping("/test_join")
    public String goJoin(Model mo2){
        List<Member> list =new ArrayList<>();
        Member m1 = new Member("lala",20,100);
        Member m2 = new Member("oya",18,50);
        Member m3 = new Member("uoon",25,80);
        list.add(m1);
        list.add(m2);
        list.add(m3);
        mo2.addAttribute("memberList",list);

        return "test_join";
    }

}
