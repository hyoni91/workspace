package com.green.ReactStudent.controller;

import com.green.ReactStudent.service.StudentService;
import com.green.ReactStudent.vo.StudentVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.List;

@RestController
public class StudentConroller {

    @Resource(name="studentService")
    private StudentService studentService;


    @GetMapping("/stuList")
    public List<StudentVO> stuList(){
        return studentService.stuList();
    }

    @PostMapping("/stuInsert")
    public void stuInsert(@RequestBody StudentVO studentVO){
        System.out.println(studentVO);
          studentService.stuInsert(studentVO);
    }

    @GetMapping("/stuDetail/{stuNum}")
    public StudentVO stuDetail(@PathVariable("stuNum") int stuNum){
        System.out.println(stuNum);
        return studentService.stuDetail(stuNum);
    }

    @DeleteMapping("/stuDelete/{stuNum}")
    public void stuDelete(@PathVariable("stuNum") int stuNum){
        System.out.println(stuNum);
        studentService.stuDelete(stuNum);
    }

}
