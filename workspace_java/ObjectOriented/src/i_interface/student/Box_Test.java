package i_interface.student;

//Wrapper class : 기본자료형을 클래스로 표현한 것 (기본자료형처럼 사용하면 된다.)
//int -> Integer
//double -> Double
//boolean -> Boolean
//float -> Float

import i_interface.Box;

public class Box_Test {
    public static void main(String[] args) {

        //정수 '10'을 클래스화
        Integer int1 =  Integer.valueOf(10);
        Integer b =10;   //-> 문법은 기본자료형과 동일하게도 쓸 수 있음 String 과 같은?
        int c = 10;

        Box box = new Box();

        box.setBox(3);  //int 가 아닌  자동으로 Integer 로 받은 것!
        box.setBox(32.33);  //double 이 아닌 자동으로 Double 로 받은 것!


    }
}
