package class_basic;


import java.util.Scanner;

public class MonitorTest {
    public static void main(String[] args) {
        //모니터 설계도에서 모니터 객체 생성
        //객체 생성 문법 : 클래스명 객체명 = new 클래스명();
        Monitor mo = new Monitor();

        //객체의 정보(변수)값 확인 방법
        //문법 : 객체명.변수명;
        System.out.println(mo.brand); // 객체명.변수명
        System.out.println(mo.price);
        System.out.println(mo.color);

        //값 넣는 방법
        Monitor mo2 = new Monitor(); // 객체명을 달리해서 무한대로 작성가능
        mo2.price = 1000;
        mo2.brand = "samsung";
        mo2.color = "black";
        System.out.println(mo2.brand);

    }
}
