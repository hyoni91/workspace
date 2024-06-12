package Inheritance_상속;

/*
https://m.blog.naver.com/dusehdrb8721/223099420283
메서드 오버라이딩(OverRiding) : 상속 관계일 경우, 부모클래스의 메서드를 자식 클래서에서 재정의 할 수 있다.
*/


public class Cake {

    public void eat(){
        System.out.println("케이크 냠냠");
    }
}

class CheeseCake extends Cake{

    //부모에게 받은 eat 과 본인의 eat 메서드(오버라이딩)
    public void eat(){
//        super.eat();  //부모 클래스의 eat메서드를 호출 할 수 있음
        System.out.println("치케 냠냠");
    }


}
