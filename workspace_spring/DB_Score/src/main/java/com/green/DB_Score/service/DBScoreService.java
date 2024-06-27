package com.green.DB_Score.service;

import com.green.DB_Score.vo.DBScoreVO;

import java.util.List;

public interface DBScoreService {

    //첫페이지 목록
    List<DBScoreVO> selectList();

    //학생등록
    void insertStu(DBScoreVO dbScoreVO);

    //해당학생 상세정보
    DBScoreVO stuInfo(int stuNum);

    //학생정보수정
    void stuUpdate(DBScoreVO dbScoreVO);
}
