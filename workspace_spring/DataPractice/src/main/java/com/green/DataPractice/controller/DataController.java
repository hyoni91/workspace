package com.green.DataPractice.controller;

import com.green.DataPractice.vo.LoginVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataController {

    @GetMapping("/loginForm")
    public String loginForm(){
        return "login";
    }

    //form태그로 전달되는 데이터를 전달받기 [@RequestParam]
    //@RequestParam(name= "id") String id  --> @RequestParam(iinput 태그의 name속성 값) 값을 저장할 변수 선언
    //@RequestParam(name= "input 태그의 name속성 값") String id
    @GetMapping("/loginPage")
    public String loginPage(@RequestParam(name= "id") String id, @RequestParam(name="pw") String pw ){
        System.out.println("id = " + id); //input으로 받은 id값 출력
        System.out.println("pw = " + pw); //input으로 받은 pw값 출력
        return "login_result";
    }

    //form태그로 전달되는 데이터 전달받기 [객체사용]
    //html에서 전달되는 데이터의 이름(input 태그의 name속성 값)과
    //매개변수로 전달된 클래스의 멤버변수명이 일치하면 html에서 넘어온 데이터를 객체에 자동으로 저장시켜준다.
    //클래스에는 반드시 getter 와 setter가 생성되어야 한다!
    //html에서 넘어온 데이터를 받기 위해서 컨트롤러안의 메서드에서 매개변수로 활용하는 객체를 커멘드 객체라고 지칭한다.
    @PostMapping("/loginPage1")  //form의 post 속성으로 설정했으므로 post로 받기.
    public String loginPage1(LoginVO loginVO, Model m){ //커멘드 객체 (컨트롤러 에서만! 가능)
        System.out.println("id = " + loginVO.getId());
        System.out.println("id = " + loginVO.getPw());
        m.addAttribute("loginInfo",loginVO);
        return "login_result";
    }


    }

