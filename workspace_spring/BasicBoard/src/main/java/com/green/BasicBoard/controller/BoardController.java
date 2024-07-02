package com.green.BasicBoard.controller;

import com.green.BasicBoard.service.BoardServiceImpl;
import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.List;

@Controller
public class BoardController {
    @Resource(name="boardService")
    private BoardServiceImpl boardService;


    //목록조회 & 검색
    @RequestMapping("/")
    public String boardList(Model model, SearchVO searchVO){
        //searchVO 데이터 검사 (검색누르면 searchVO에 값 전달함)
        //html은 from으로 데이터 받아옴 (method:post)
        System.out.println(searchVO);

        // 리턴값으로 받은 후, 모델로 html에 넘기기 (getMapping)
        List<BoardVO> bList = boardService.bList(searchVO);  //빈값채우기(searchVO)
        model.addAttribute("bList", bList);
        return "board_list";
    }

    //글 등록 페이지
    @PostMapping("/b_write_form")
    public String bWriteForm(){
        return "b_write_form";
    }

    //글등록완료
    @PostMapping("/reg_board")
    public String bInsert(BoardVO boardVO){
        System.out.println(boardVO);
         boardService.bInsert(boardVO);
        return "redirect:/";
    }

    //상세페이지
    @GetMapping("/bDetail")
    public String bDetail(@RequestParam(name="bNum") int bNum, Model model){
        BoardVO board = boardService.bDtail(bNum);
        boardService.updateReadCnt(bNum);
        model.addAttribute("board",board);

        return "b_detail";
    }

    //수정페이지
    @GetMapping("/updateForm")
    public String update_form(@RequestParam(name = "bNum")int bNum, Model model){
        BoardVO boardVO = boardService.bDtail(bNum);
        System.out.println(boardVO);
        model.addAttribute("bUp",boardVO);

        return "update_form";
    }

    //수정하기
    @PostMapping("/update")
    public String update(BoardVO boardVO){
        boardService.bUpdate(boardVO);
        System.out.println(boardVO);
        return "redirect:/bDetail?bNum=" + boardVO.getBNum();
    }


    //삭제
    @GetMapping("/bDelete")
    public String bDelete(@RequestParam(name="bNum")int bNum){
        boardService.bDelete(bNum);
        return "redirect:/";
    }

}
