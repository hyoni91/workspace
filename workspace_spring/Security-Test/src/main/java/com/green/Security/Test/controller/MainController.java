package com.green.Security.Test.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String main(){
        return "로로로로로로로";
    }

    @GetMapping("/test")
    public String test(){
        return "이거는 인증해야지롱";
    }
}
