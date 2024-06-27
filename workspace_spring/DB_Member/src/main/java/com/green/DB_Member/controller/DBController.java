package com.green.DB_Member.controller;

import com.green.DB_Member.service.DBService;
import com.green.DB_Member.service.DBServiceImpl;
import com.green.DB_Member.vo.MemberVO;
import jakarta.annotation.Resource;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//데이터베이스 기본적인 문법 연습
@Controller
public class DBController {

    @Resource(name="dbService")
    private DBServiceImpl dbService;

    //회원번호가 1번인 학생의 이름을 조회
    @GetMapping("/select1")
    public String select1(){
        String name = dbService.selectNum1();
        System.out.println("조회한 이름 : " + name );

        return "db_result";
    }

    //전달된 회원번호를 지닌 회원의 나이를 조회 (나이는 회원의 번호로 받아야함!)
    @GetMapping("/select2")
    public String select2(){
        int age = dbService.select2(5);
        System.out.println("조회한 나이: " + age);

        return "db_result";
    }

    //전달받은 나이 이상의 회원의 이름을 조회
    @GetMapping("/select3")
    public String select3(){
        List<String> nameList = dbService.selcet3(20);
        for(String name : nameList){
            System.out.println("조회된 이름 : " +name);
        }
        return "db_result";
    }

    //전달받은 회원 번호를 지닌 회원의 회원번호, 이름, 나이, 주소를 조회
    @GetMapping("/select4")
    public String select4(){
        MemberVO member1 = dbService.select4(1);
        System.out.println("조회된 회원 : "+ member1);

        return "db_result";
    }

    //모든 회원의 회원번호, 이름, 나이, 주소를 조회
    @GetMapping("/select5")
    public String select5(){
        List<MemberVO> memberList = dbService.select5();
        for (MemberVO member : memberList){
            System.out.println("조회된 회원 : " + member);
        }

        return "db_result";
    }


    //전달받은 회원번호를 가진 회원을 삭제
    @GetMapping("/delete")
    public String delete(){
       int result = dbService.delete(12);
        System.out.println("삭제된 행의 수: " + result);
        return "db_result";
    }

    //전달받은 정보로 회원 등록
    @GetMapping("/insert")
    public String insert(){
        MemberVO member = new MemberVO();
        member.setMemNum(9);
        member.setMemName("하늘이");
        member.setMemAge(18);
        member.setMemAddr("하늘");
        dbService.insert(member);

        return "db_result";
    }

    //전달받은 정보로 회원 정보 수정
    @GetMapping("/update")
    public String update(){
        MemberVO updateMem = new MemberVO();
        updateMem.setMemNum(11);
        updateMem.setMemName("바다");
        updateMem.setMemAge(30);
        updateMem.setMemAddr("푸른바다");
        dbService.update(updateMem);

        return "db_result";
    }

}
