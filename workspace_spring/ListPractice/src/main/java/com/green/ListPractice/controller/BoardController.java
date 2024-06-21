package com.green.ListPractice.controller;

import com.green.ListPractice.vo.BoardVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BoardController {
    //게시글 목록을 저장할 리스트 생성
    List<BoardVO> boardList = new ArrayList<>(); //멤버변수에 해당


    //게시글 목록 화면
    @GetMapping("/board_list")
    public String boardList(Model model){
        //게시글 목록 데이터를 html로 전달
        model.addAttribute("boardList",boardList);
        return "board_list";
    }

    //글작성화면
    @GetMapping("/write_form")
    public String writeForm(){
        return "board_write_form";
    }

    //작성한 내용으로 글 등록하기
    @PostMapping("/regBoard")
    public String regBoard(BoardVO boardVO){
        System.out.println(boardVO);
        //글 등록(list에 넣기!!!)
        boardList.add(boardVO);
        //리다이렉트(Redirect) --> 이 메서드를 경유 후, 바로 html가는 것이 아니라
        // @GetMapping("/board_list")로 다시 이동해서(data가진 후) 해당 메서드 실행하겠다.
        return "redirect:/board_list";

    }


    @GetMapping("/board_detail")
    public String board_detail(@RequestParam(name = "boardNum") int boardNum , BoardVO boardVO, Model model){

        BoardVO result = null;
        //내가 클릭한 게시글의 상세 정보 구분하기 위해서는 ? = 글번호
        for(int i = 0; i<boardList.size(); i++ ){
            if(boardList.get(i).getBoardNum() == boardNum){
                result = boardList.get(i);
            }
        }

        //for문 밖에 빼야지~~~~~~~~~~!!!
        model.addAttribute("board",result);

        //내가 찾은 게시글을 html에 전달하기
        return "board_detail";
    }

    //a태그로
    @GetMapping("/remove_detail")  //이곳에서 삭제 후, 보드 리스트로 이동
    public String remove(@RequestParam(name = "boardNum") int boardNum , BoardVO boardVO, Model model){
        //삭제하기
        BoardVO remove = null;
        for(int i = 0; i<boardList.size(); i++ ){
            if(boardList.get(i).getBoardNum() == boardNum){
                remove = boardList.remove(i);
            }
        }
        model.addAttribute("remove",remove);
        return "redirect:/board_list";
    }


    //버튼으로
    //버튼으로 확인과 취소를 확인하고, 확인 시 게시글 삭제를 위해 메서드로 이동
    @GetMapping("/delete")
    public String delete(@RequestParam(name = "boardNum") int boardNum){

        int deleteIndex = 0; //삭제할 게시글의 index번호
         for(int i =0; i < boardList.size(); i++){
             if(boardList.get(i).getBoardNum() ==  boardNum){
                 deleteIndex = i;
             }
         }
        boardList.remove(deleteIndex);

        return "redirect:/board_list";   // Model을 안 써도 리다이렉트 하면 삭제 후, 데이터 가지고 보드 리스트 파일로 감!
    }

}
