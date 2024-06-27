package com.green.DB_Member.service;


import com.green.DB_Member.vo.MemberVO;

import java.util.List;

//작성한 쿼리를 실행할 메서드의 정의
//메서드의 매개변수 : 실행할 쿼리에 빈값을 채워주는 데이터
//메서드의 리턴타입 : 쿼리 실행 결과 데이터 베이스에서 가져오는 데이터 타입
public interface DBService {

    //회원번호가 1번인 회원의 이름을 조회하는 쿼리를 실행할 메서드
    //리턴 타입은 <select>태그의 조회결과에 따라 달라짐
    String selectNum1();

    //전달받은 회원번호로(memNum 매개변수) 회원 나이 조회
    int select2(int memNum);

    //전달받은 나이 이상인 회원의 이름을 조회
    //Mapper의 resultType은 조회된 데이터에서 하나의 행 정보를 담을 자료형이지만
    //java에서는 조회된 데이터의 모든 정보를 담을 자료형
    List<String> selcet3(int memAge);

    //전달받은 회원 번호를 지닌 회원의 회원번호, 이름, 나이, 주소를 조회
    MemberVO select4(int memNum);

    //모든 회원의 회원번호, 이름, 나이, 주소를 조회
    List<MemberVO> select5();

    //delete, update, insert => 리턴타입 : void 혹은 int
    //전달받은 회원번호를 가진 회원을 삭제
    int delete(int memNum);

    //전달받은 정보로 회원 등록
    void insert(MemberVO memberVO);

    //전달받은 정보로 회원 정보 수정
    void update(MemberVO memberVO);

}
