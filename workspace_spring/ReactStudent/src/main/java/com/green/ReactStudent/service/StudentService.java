package com.green.ReactStudent.service;

import com.green.ReactStudent.vo.StudentVO;

import java.util.List;

public interface StudentService {

    //학생목록
    List<StudentVO> stuList();

    //글등록
    void stuInsert(StudentVO studentVO);

    //상세조회
    StudentVO stuDetail(int stuNum);

    //삭제
    void stuDelete(int stuNum);

    //score등록
    void stuUpdate(StudentVO studentVO);
}
