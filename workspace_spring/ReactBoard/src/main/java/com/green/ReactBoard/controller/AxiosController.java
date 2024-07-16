package com.green.ReactBoard.controller;


import com.green.ReactBoard.service.AxiosService;
import com.green.ReactBoard.vo.BoardVO;
import com.green.ReactBoard.vo.MemberVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.SubmissionPublisher;

@RestController
public class AxiosController {

    @Resource(name="axiosService")
    private AxiosService axiosService;

    //get1 데이터 조회 버튼
    @GetMapping("/getList")
    public List<BoardVO> getList(){
        return axiosService.getList();
    }

    //post1 버튼
    @PostMapping("/axiosInsert")
    public int axiosInsert(@RequestBody MemberVO memberVO){
        //데이터베이스 insert 쿼리 실행하는 코드 작성
        //axios에서 이 코드의 url과 자바코드가 실행된 후 react의 then 또는 catch가 실행된다.
        System.out.println(memberVO);
        return 10;
    }

    //put1 버튼
    @PutMapping("/axiosUpdate")
    public int axiosUpdate(@RequestBody BoardVO boardVO){
        //데이터베이스 업데이트 쿼리 실행하는 코드 작성
        System.out.println(boardVO);
        return 10;
    }

    //get2 빈값이 있는 버튼 (/{객체명})
    @GetMapping("/axiosDetail/{boardNum}")
    public void axiosDetail(@PathVariable("boardNum") int boardNum){
        System.out.println("boardNum = " + boardNum);
    }

}
