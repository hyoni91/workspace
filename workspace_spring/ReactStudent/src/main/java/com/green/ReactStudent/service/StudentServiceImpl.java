package com.green.ReactStudent.service;

import com.green.ReactStudent.vo.StudentVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService{

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<StudentVO> stuList() {

        return sqlSession.selectList("studentMapper.stuList");
    }

    //글등록
    @Override
    public void stuInsert(StudentVO studentVO) {
        sqlSession.insert("studentMapper.stuInsert", studentVO);
    }

    @Override
    public StudentVO stuDetail(int stuNum) {

        return sqlSession.selectOne("studentMapper.detail", stuNum);
    }

    @Override
    public void stuDelete(int stuNum) {
        sqlSession.delete("studentMapper.delete", stuNum);
    }
}
