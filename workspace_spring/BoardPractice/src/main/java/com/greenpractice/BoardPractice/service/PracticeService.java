package com.greenpractice.BoardPractice.service;

import com.greenpractice.BoardPractice.vo.PracticeVO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PracticeService {


    List<PracticeVO> selectList();

    void insert(PracticeVO practiceVO);

    PracticeVO detail(int pNum);

    void delete(int pNum);
}
