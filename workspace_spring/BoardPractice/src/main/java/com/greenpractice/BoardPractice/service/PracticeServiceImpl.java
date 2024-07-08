package com.greenpractice.BoardPractice.service;


import com.greenpractice.BoardPractice.vo.PracticeVO;
import jakarta.annotation.Resource;
import org.apache.ibatis.javassist.expr.NewArray;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("practice")
public class PracticeServiceImpl implements PracticeService {
    @Autowired
    SqlSessionTemplate sqlSession;
    List<PracticeVO> boardList = new ArrayList<>();

    @Override
    public List<PracticeVO> selectList() {
        return sqlSession.selectList("board-practice.list");
    }

    @Override
    public void insert(PracticeVO practiceVO) {
        sqlSession.insert("board-practice.insert", practiceVO);
    }

    @Override
    public PracticeVO detail(int pNum) {
        return sqlSession.selectOne("board-practice.detail",pNum);
    }

    @Override
    public void delete(int pNum) {
        sqlSession.delete("board-practice.delete",pNum);
    }

    @Override
    public void update(PracticeVO practiceVO) {
        sqlSession.update("board-practice.update", practiceVO);

    }
}
