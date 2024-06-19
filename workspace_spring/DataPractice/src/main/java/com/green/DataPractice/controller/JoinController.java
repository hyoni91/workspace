package com.green.DataPractice.controller;

import com.green.DataPractice.vo.MemberVO;
import com.green.DataPractice.vo.SurveyVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


//MemberVO랑 세트임

@Controller
public class JoinController {

    @GetMapping("/reg_member")
    public String joinPage(MemberVO memberVO){
        return "reg_member";
    }

    //커맨드 객체는 Model인스턴스를 사용하지 않아도 자동으로 html에 정보 전달 됨.
    //이때, 넘어가는 데이터는 클래스명에서 앞글자만 소문자로 바꾼 이름으로 넘어간다!!!!!!
    @PostMapping("/member_info")
    public String goLogin(MemberVO memberVO, Model m){
//        m.addAttribute("member",memberVO);  이거 안 해도됨. (커맨드 객체가 있어서)
        System.out.println(memberVO); //데이터가 넘어 왔는지 확인용
        return "member_info";
    }



//    Survey html Controller
    @GetMapping("/survey")
    public String survey(){
        return "survey";
    }

    @PostMapping("/survey_result")
    public String survey_result (SurveyVO surveyVO){
        System.out.println(surveyVO);
        return "survey_result";
    }


    //연습(각 page 마다 데이터를 끌어오기)
    @GetMapping("/aaaa")
    public String input_name(){
        return "input_name";
    }

    @PostMapping ("/bbbb")
    public String input_age(@RequestParam(name = "name") String name, Model model){
        System.out.println(name);
        model.addAttribute("name",name);
        return "input_age";
    }

    @PostMapping ("/cccc")
    public String input_result(@RequestParam(name = "age") String age,@RequestParam(name = "name") String name, Model model2){
        model2.addAttribute("age",age);
        model2.addAttribute("name",name);
        return "input_result";
    }


}
