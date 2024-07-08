package com.greenpractice.BoardPractice.controller;

import com.greenpractice.BoardPractice.service.PracticeService;
import com.greenpractice.BoardPractice.service.PracticeServiceImpl;
import com.greenpractice.BoardPractice.vo.PracticeVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PracticeConrtoller {

    @Resource(name = "practice")
    private PracticeServiceImpl practiceService;

    //게시글 목록
    @GetMapping("/")
    public String list( Model model){
        List<PracticeVO> boardList = practiceService.selectList();
        model.addAttribute("boardList", boardList);
        System.out.println(boardList);
        return "b_list";
    }


    // 글 등록
    @PostMapping("/write_form")
     public String writeForm(){

        return "write_form";
    }

    //등록
    @GetMapping("/reg_insert")
    public String insert(PracticeVO practiceVO){

        practiceService.insert(practiceVO);
        System.out.println(practiceVO);
        return "redirect:/";
    }

    //상세페이지
    @GetMapping("/pDetail")
    public String detail(PracticeVO practiceVO, Model model){

        PracticeVO detail = practiceService.detail(practiceVO.getPNum());
        model.addAttribute("board",detail);
        System.out.println(practiceVO);
        return "detail";
    }

    //삭제
    @GetMapping("/pDelete")
    public String delete(PracticeVO practiceVO){
        practiceService.delete(practiceVO.getPNum());
        System.out.println(practiceVO);
        return "redirect:/?pNum="+practiceVO.getPNum();
    }

    //수정 페이지
    @PostMapping("/pUpdate")
    public String update(PracticeVO practiceVO, Model model){
        model.addAttribute("board",practiceVO);
        System.out.println(practiceVO);

        return "update_form";
    }

    //수정
    @PostMapping("/reg_update")
    public String update(PracticeVO practiceVO){
        practiceService.update(practiceVO);
        return "redirect:/pDetail?pNum="+practiceVO.getPNum();
    }

    }

