package com.green.DataPractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ATagController {

    @GetMapping("/a1")
    public String a1(Model model){
        model.addAttribute("stuName","KIM");  // html은 밸류값만 적으면 됨
        model.addAttribute("score",80);
        return "aTag_1";
    }

    @GetMapping("/a2")
    public String a2(@RequestParam(name="addr") String addr){
        System.out.println("addr = " + addr);  //html 데이터가 잘 넘어오는지 확인
        return "aTag_2";
    }

    @GetMapping("/a3")
    public String a3(@RequestParam(name="name") String name, @RequestParam(name="age") String age){
        System.out.println("name = " + name + " age = " + age);
        return "aTag_3";
    }

}
