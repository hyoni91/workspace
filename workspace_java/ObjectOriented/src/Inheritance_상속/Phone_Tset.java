package Inheritance_상속;


/*
다형성 : https://m.blog.naver.com/dusehdrb8721/223099420283
부모클래스는 자식 클래스의 객체를 받을 수 있다.
다형성으로 생성된 객체는 부모클래스의 변수, 메서드만 사용 가능

*/

public class Phone_Tset {
    public static void main(String[] args) {

        MobilePhone mo1 = new MobilePhone();
        SmartPhone sp1 = new SmartPhone();


        MobilePhone mo2 = new SmartPhone();  // 하지만 스마트폰 기능 사용못함 모바일폰으로 인지?

//        SmartPhone sp1 = new MobilePhone();  오류



    }
}
