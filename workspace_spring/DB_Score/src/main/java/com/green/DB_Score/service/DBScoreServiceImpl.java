package com.green.DB_Score.service;

import com.green.DB_Score.vo.DBScoreVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("dbScoreService")
public class DBScoreServiceImpl implements DBScoreService {
   @Autowired
    SqlSessionTemplate sqlSession;
   List<DBScoreVO> stuScoreList = new ArrayList<>();

   //목록조회
    @Override
    public List<DBScoreVO> selectList() {
       List<DBScoreVO> stuList  = sqlSession.selectList("scoreMapper.select");
        return stuList;
    }

    //등록
    @Override
    public void insertStu(DBScoreVO dbScoreVO) {
        sqlSession.insert("scoreMapper.insert",dbScoreVO);
    }

    //상세조회
    @Override
    public DBScoreVO stuInfo(int stuNum) {
        DBScoreVO student = sqlSession.selectOne("scoreMapper.stuInfo",stuNum);
        return student;
    }

    //수정
    @Override
    public void stuUpdate(DBScoreVO dbScoreVO) {
        sqlSession.update("scoreMapper.update",dbScoreVO);
    }


}
