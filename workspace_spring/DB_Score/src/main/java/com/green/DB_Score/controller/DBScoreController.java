package com.green.DB_Score.controller;

import com.green.DB_Score.service.DBScoreService;
import com.green.DB_Score.service.DBScoreServiceImpl;
import com.green.DB_Score.vo.DBScoreVO;
import jakarta.annotation.Resource;
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
public class DBScoreController {
    @Resource(name = "dbScoreService")
   private DBScoreServiceImpl dbScoreService;

    @GetMapping("/")
    public String dblist(Model model){
        List<DBScoreVO> stuList = dbScoreService.selectList();
        model.addAttribute("stuList",stuList);
        return "stu_list";
    }

    //등록페이지
    @PostMapping("/writeForm")
    public String writeform(){

        return "write_form";
    }

    //등록
    @PostMapping("/regStuScore")
    public String regStuScore(DBScoreVO dbScoreVO){
        dbScoreService.insertStu(dbScoreVO);
        return "redirect:/";
    }

    //상세페이지
    @GetMapping("/DBdetail")
    public String DBDetail(@RequestParam(name="stuNum") int stuNum, Model model){
       DBScoreVO student = dbScoreService.stuInfo(stuNum);
       model.addAttribute("stuDetail", student);
        return "stu_detail";
    }

    //수정페이지
    @GetMapping("/updateForm")
    public String updateForm(@RequestParam(name="stuNum")int stuNum,Model model){
        model.addAttribute("stuUpdate", stuNum);
        return "stu_update";
    }

    //수정
    @GetMapping("/DBupdate")
    public String DBUpdate( DBScoreVO dbScoreVO){
        dbScoreService.stuUpdate(dbScoreVO);
        return "redirect:/DBdetail?stuNum=" + dbScoreVO.getStuNum();
    }

    //삭제
    @GetMapping("/DBdelete")
    public String DBdelete(@RequestParam(name="stuNum") int stuNum){
        dbScoreService.stuDelete(stuNum);
        return "redirect:/";
    }




}
