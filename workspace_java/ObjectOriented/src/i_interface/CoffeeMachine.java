package i_interface;

/*
[클래스에 인터페이스를 적용하는 문법]
public class 클래스명 implements 인터페이스명
*/

//implements: 시행하다.
//Machine 인터페이스에 정의한 메서드를 구현한 CoffeeMachine 클래스를 생성하겠다.
//인터페이스를 구현한 클래스(커피머신)는 멤버변수 , 생성자 등 나머지 부문은 클래스와 동일하게 사용
public class CoffeeMachine implements Machine{

    @Override
    public void takeCoffee() {
        System.out.println("Ice Americano");
    }

    @Override
    public void takeYulmu() {
        System.out.println("Hot Yulmu");
    }

    @Override
    public void takeCocoa() {
        System.out.println("Ice Cocoa");
    }
}
