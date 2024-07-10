package com.green.AxiosTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//react는 RestController 비동기통신?
//컨트롤러 안의 메서드 리턴이 html파일명이 아님!

@RestController
public class AxiosController {

    @GetMapping("/test1")
    public String test1(){
        return "집에 가고 싶다";
    }

    @GetMapping("/test2")
    public int test2(){
        return 100;
    }

    @GetMapping("/test3")
    public int[] test3(){
        int[] arr = {1,2,3,4,5};
        return arr;
    }

    @GetMapping("/test4")
    public List<ItemVO> test4(){

        List<ItemVO> items = new ArrayList<>();

        //ItemVO객체를 3개 리액트로 전달하기
        ItemVO item1 = new ItemVO(1,"자바EE",20000,"초보자를 위한 자바","book_1.jpg");
        ItemVO item2 = new ItemVO(2,"코어자바",15000,"자바 정복","book_2.jpg");
        ItemVO item3 = new ItemVO(3,"딥러닝",20000,"자자자자바바바바러러러닝","book_3.jpg");

        items.add(item1);
        items.add(item2);
        items.add(item3);

        return items;
    }




}
