package com.green.DataPractice.controller;

import com.green.DataPractice.vo.ResumeVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ResumeController {

    @GetMapping("/resume")
    public String resume(ResumeVO resumeVO){
        return "resume";
    }

    @PostMapping("/resume_info")
    public String resume_info(ResumeVO resumeVO){
        System.out.println(resumeVO);
        return "resume_info";
    }

    @PostMapping("/resume_result")
    public String resume_result(ResumeVO resumeVO){
        System.out.println(resumeVO);
        return "resume_result";
    }
}
