package com.green.DataPractice.controller;

import com.green.DataPractice.vo.ScoreVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ScoreController {

    //첫번째 페이지
    @GetMapping("/input_score")
    public String scoreInput(ScoreVO scoreVO){
        return "input_score";
    }

    //첫번째 페이지에서 넘어 온 데이터를 받아, 두번째 페이지로 이동
    @PostMapping("/input_program")
    public String inputPro(ScoreVO scoreVO){
        System.out.println(scoreVO);  //콘솔창으로 잘 입력 받았는지 확인용
        return "input_program";
    }

    //두번째 페이지에서 넘어 온 데이터를 받아, 세번째 페이지 이동
    @PostMapping("/input_grade")
    public String grade(ScoreVO scoreVO){
        System.out.println(scoreVO);

        return "input_grade";
    }

    //세번째 페이지에서 넘어 온 데이터를 받아, 마지막 페이지 이동
    @PostMapping("/result_grade")
    public String result_grade(ScoreVO scoreVO){
        scoreVO.setAvg(); //이거 없으면 평균 값 0.0나옴 (이걸 실행 시켜줘야지 계산해줌)
        System.out.println(scoreVO);
        return "input_grade_result";
    }
}
