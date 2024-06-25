package com.green.ListPractice.controller;

import com.green.ListPractice.service.StudentService;
import com.green.ListPractice.vo.StudentVO;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

//    List<StudentVO> stu_list = new ArrayList<>();

//    @GetMapping("/stu_list")
//    public String stu_list(Model model){
//        model.addAttribute("stu_list",stu_list);   //학생 목록 리스트!
//        return "stu_list";
//    }
//
//    @GetMapping("/write_student")
//    public String write_student(){
//        return "write_student";
//    }
//
//    @PostMapping("/reg_student")
//    public String reg_student(StudentVO studentVO){
//        stu_list.add(studentVO);  //학생 목록 리스트에 학생 데이터 저장
//        System.out.println(studentVO); //확인용
//
//        stuSV.regStu(studentVO);
//
//        return "redirect:/stu_list";
//    }
//
//        @GetMapping("/detail")
//    public String student_detail(@RequestParam(name="stuNum") int stuNum, StudentVO studentVO, Model model){
//        StudentVO result = null;
//
//        for(int i = 0 ; i < stu_list.size(); i++){
//            if(stu_list.get(i).getStuNum()==stuNum){
//                result = stu_list.get(i);
//            }
//        }
//        model.addAttribute("student",result);
//
//        return "student_detail";
//    }
//        @GetMapping("/delete_stu")
//    public String delete_stu(@RequestParam(name="stuNum") int stuNum, StudentVO studentVO){
//        int index = 0;
//
//        for(int i = 0; i < stu_list.size(); i++){
//            if(stu_list.get(i).getStuNum()==stuNum){
//                index = i;
//            }
//        }
//        stu_list.remove(index);
//        return "redirect:/stu_list";
//
//        }





    //StudentService 클래스 이용하여 더욱 간결하게
    //클래스를 사용하기 위해서 객체생성
    StudentService stuSV = new StudentService();

    @GetMapping("/stu_list")
    public String stu_list(Model model){

        //학생 목록 데이터 조회 메서드를 리스트에 추가하기
        List<StudentVO> stu_list = stuSV.getStuList();
        //학생목록을 html로 전달하기
        model.addAttribute("stu_list",stu_list);
        return "stu_list";
    }

    //등록하기 위해 페이지 열기
    @GetMapping("/write_student")
    public String write_student(){
        return "write_student";
    }

    //등록하고 목록으로 돌아가기
    @PostMapping("/reg_student")
    public String reg_student(StudentVO studentVO){
        //목록조회 메서드
        stuSV.regStu(studentVO);

        return "redirect:/stu_list";
    }

    //학번으로 조회해서 상세정보
    @GetMapping("/student_detail")
    public String stu_detail(@RequestParam(name="stuNum") int stuNum, StudentVO studentVO, Model model){
        model.addAttribute("student",stuSV.getDetailStu(stuNum));

        return "student_detail";
    }


    @GetMapping("/delete_stu")
    public String delete_stu(@RequestParam(name="stuNum") int stuNum, StudentVO studentVO, Model model){
        model.addAttribute("student",stuSV.getDelete(stuNum));

        return "redirect:/stu_list";
    }

    //정보 수정을 위해 페이지를 염 (이때 디테일 기능을 불러와서 수정 전 값을 확인)
    @GetMapping("/update_stu")
    public String updateStu(@RequestParam(name="stuNum") int stuNum, Model model){

        model.addAttribute("student",stuSV.getDetailStu(stuNum));
        return "update_student";
    }


    //수정 (디테일페이지의 매개변수인 stuNum도 넘겨야함)
    @PostMapping("/reg_update")
    public String regUpdateStu(StudentVO studentVO){

        stuSV.setUpdateStu(studentVO);

        //html로 바로 보내지 않고 student_detail메서드를 다시 실행시킨 후 html로 이동
        return "redirect:/student_detail?stuNum=" + studentVO.getStuNum();  //stuNum 넘겨주기 (학번)
    }

    }


