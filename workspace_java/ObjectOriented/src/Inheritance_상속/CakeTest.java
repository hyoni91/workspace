package Inheritance_상속;

public class CakeTest {
    public static void main(String[] args) {

        CheeseCake cake1 = new CheeseCake();
        cake1.eat(); //자식 클래스에서 재정의한 메서드가 실행됨

        //이곳에 cake1객체로 부모 메서드의 eat 메서드를 다시 불러올 수 있는가? no


    }
}
