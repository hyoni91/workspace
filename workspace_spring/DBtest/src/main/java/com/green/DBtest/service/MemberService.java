package com.green.DBtest.service;


//인터페이스에는 멤버변수 x , 생성자 x -> 혼자만으로는 객체생성 불가능
//오직 추상메서드만 존재 (메서드의 이름만 존재하고 몸통은 없음)
//인터페이스는 단독 사용이 불가능 -> 클래스의 정의부분에서 사용을 한다.
public interface MemberService {

    //TEST_MEMBER 테이블에 데이터 1개 삽입
    void insertMember();

    //TEST_MEMBER 테이블에 데이터 1개 삽입
    void insertMember2();

}
