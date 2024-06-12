package Inheritance_상속;

//https://m.blog.naver.com/fusi/223362059311
//상속: 부모클래스의 멤버변수와 메서드를 물려받는 것
//사용이유? 코드의 재활용(초보자가 상속을 이해하는 개념)
//연관성이 없는 다수의 클래스들에 연관성을 부여하여 데이터의 관리를 효율적으로 할 수 있도록 해주는 기능

/*
    상속 문법
    하위 클래스명 뒤에 extends 상위클래스명 {}
    extends (확장한다) : 부모클래스의 모든 속성과 메서드 상속 받고, 이를 확장한 기능을 추가, 변경가능
*/


//Woman :부모클래스, 슈퍼클래스, 상위클래스
//BusinessWoman: 자식클래스 , 서브클래스 , 하위클래스
public class Woman {
    String name;

    //디폴트 생성자
    public Woman(){

    }

    //매개변수를 받는 생성자
    public Woman(String name){
        this.name = name;
    }

    public void tellName(){
        System.out.println("이름은 김하루입니다.");
    }
}


//extends (확장한다) : 부모클래스의 모든 속성과 메서드 상속 받고, 이를 확장한 기능을 추가, 변경가능
class BusinessWoman extends Woman {
    String company;


    //상속받은 클래스의 생성자 가장 첫번째 줄에는 super()라는 메서드가 숨겨져 있다.
    public BusinessWoman(){
//        super();  //부모클래스의 기본(디폴트)생성자를 호출
        System.out.println("생성자호출");

    }


    public void tellCompany(){
        System.out.println("저는 삼성에 다닙니다.");
    }
}




// 통상적으로 클래스는 한 파일에 하나!
// 상속공부를 위해 같은페이지에 적음(단, public 은 못 붙임)


/* 생성자 첫줄에 와야하므로 둘 중 하나만 올 수 있음
//super(); -> 부모클래스의 생성자 호출
//this(); -> 현재 클래스의 생성자 호출
*/

//super.변수 -> 부모 클래스의 변수 호출
//this.변수 -> 현재 클래스의 변수 호출