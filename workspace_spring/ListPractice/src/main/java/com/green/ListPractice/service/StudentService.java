package com.green.ListPractice.service;


import com.green.ListPractice.vo.StudentVO;

import java.util.ArrayList;
import java.util.List;

//학생관리 프로그램의 핵심 기능을 정의 (MVC -> Model)
public class StudentService {
    List<StudentVO> stu_list = new ArrayList<>(); //학생정보를 저장할 리스트 목록 생성

    //목록조회
    public List<StudentVO> getStuList(){  //학생정보가 등록되면 리스트로 리턴받기
        return stu_list;  //학생정보가 다 들어있음!

    }

    //등록
    public void regStu(StudentVO studentVO){ //학생 정보를 매개변수 받기
        stu_list.add(studentVO); //매개변수로 받은 학생정보를 리스트에 저장하기
    }

    //상세조회
    public StudentVO getDetailStu(int stuNum){

        int index= 0;
        for(int i =0; i < stu_list.size(); i++){
            if(stu_list.get(i).getStuNum()==stuNum){
                index = i;
            }
        } return stu_list.get(index);
    }

    //삭제
    public StudentVO getDelete(int stuNum){
        int index= 0;
        for(int i =0; i < stu_list.size(); i++){
            if(stu_list.get(i).getStuNum()==stuNum){
                index = i;
            }
        } return stu_list.remove(index);
    }

    //정보수정
    public void setUpdateStu(StudentVO studentVO){

        for(StudentVO student : stu_list){
            if(student.getStuNum() == studentVO.getStuNum()){
                student.setStuName(studentVO.getStuName());
                student.setEngScore(studentVO.getEngScore());
                student.setKorScore(studentVO.getKorScore());
                student.setIntroduce(studentVO.getIntroduce());
            }
        }



    }



}
