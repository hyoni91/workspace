package com.green.DataPractice.controller;

import com.green.DataPractice.vo.ScoreVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ScoreController {

    @GetMapping("/score_input")
    public String scoreInput(ScoreVO scoreVO){
        return "inputscore";
    }

    @PostMapping("/input_program")
    public String inputPro(ScoreVO scoreVO){
        return "input_program";
    }

    @PostMapping("/grade")
    public String grade(ScoreVO scoreVO){
        return "grade";
    }

    @PostMapping("/result_grade")
    public String result_grade(ScoreVO scoreVO){
        scoreVO.setAvg();
        System.out.println(scoreVO.getAvg());
        return "result_grade";
    }

}
