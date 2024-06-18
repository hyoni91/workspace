package com.green.Start;

//페이지를 이동시 자바를 통해서!
//page 이동 담당 자바 파일(@Controller)
//@ : 어노테이션

/*@Controller: 이 어노테이션은 해당 클래스가 스프링의 컨트롤러임을 선언
               스프링은 이 어노테이션이 붙은 클래스를 검색하여 웹 애플리케이션의 컴포넌트로 등록

@GetMapping("/a"): 이 어노테이션은 HTTP GET 메서드에 대한 매핑을 지정한다. 즉, "/a" 경로로의 GET 요청이 이 메서드에 매핑한다.*/

//html에서 a태그 사용해서 페이지 이동도 가능함!(대신 자바 string 리턴 메서드가 있어야함)

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    //컨트롤러 내의 메서드의 리턴타입이 문자열(String)인 경우, 리턴 값과 같은 문자열 이름의 html 파일을 실행시킴.
    @GetMapping("/t1")
    public String goTest1(){
        System.out.println("goTest1 실행");  // java 통해서 실행되는 것을 확인할 수 있음
        return "test1";
    }

    @GetMapping("/t2")
    public String goTest2(){
        System.out.println("goTest2 실행");
        return "test2";
    }

    @GetMapping("/t3")
    public String goTest3(){
        System.out.println("goTest3 실행");
        return "test3";
    }

}
