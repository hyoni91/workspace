package com.green.Board.controller;

import com.green.Board.service.BoardService;
import com.green.Board.vo.BoardVO;
import com.green.Board.vo.PageVO;
import com.green.Board.vo.ReplyVO;
import com.green.Board.vo.SearchVO;
import jakarta.annotation.Resource;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/board")
public class BoardController {
    //게시판 관련
    @Resource(name="boardService")
    private BoardService boardService;

    //게시글 목록
    @PostMapping("/list")
    public Map<String, Object> getBoardList(@RequestBody(required = false) SearchVO searchVO , PageVO pageVO){
        log.info("======================넘어온 페이지 번호 :"+ searchVO.getPageNo());

        //페이지 정보를 담을 수 있는 PageVO 객체 생성
        //매개변수에는 전체 게시글 개수를 담고 있는 쿼리를 불러온다.
        PageVO pageInfo = new PageVO(boardService.getTotalBoard());

        //화면상 나타나는 현재 페이지 번호
        if(searchVO.getPageNo() !=0){
            pageInfo.setNowPageNo(searchVO.getPageNo());
        }
        //메서드 호출
        pageInfo.setPageInfo();
        //페이지 VO 내용 확인
        System.out.println(pageInfo);

        //리액트로 가져갈 모든 데이터를 담을 변수
        Map<String,Object> mapData = new HashMap<>();
        //페이징 정보가 담긴 데이터
        mapData.put("pageInfo", pageInfo);

        //게시글 목록 정보가 담긴 데이터
        mapData.put("boardList",boardService.getBoardList(pageVO));

        return mapData;
    }

    //글등록
    @PostMapping("/insert")
    public void insert(@RequestBody BoardVO boardVO){
        System.out.println(boardVO);
        boardService.insert(boardVO);
    }

    //상세글
    @GetMapping("/detail/{boardNum}")
    public BoardVO detail(@PathVariable("boardNum") int boardNum){
        System.out.println(boardService.detail(boardNum));
        return boardService.detail(boardNum);
    }

    //글삭제
    @DeleteMapping("/delete/{boardNum}")
    public void delete(@PathVariable("boardNum") int boardNum){
        boardService.delete(boardNum);
    }

    //글 수정
    @PutMapping("/update")
    public void update(@RequestBody BoardVO boardVO){
        boardService.update(boardVO);
    }

}



