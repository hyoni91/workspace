package com.green.SpringFisrt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//http://localhost:8080  고정!
@Controller
public class FirstController {

    @GetMapping("/a")
    public String goFirst(){
        return "first";
    }

    @GetMapping("/b")
    public String goSecond(){
        System.out.println(11111);
        return "second";
    }

    @GetMapping("/c")
    public String goThird(){
        System.out.println(222);
        return "third";
    }

    @GetMapping("/login")
    public String goLogin(){
        return "login";
    }

    @GetMapping("/loginResult")
    public String loginResult(){
        System.out.println("loginResult 메서드 실행");
        return "";
    }

}
