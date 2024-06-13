package object_class;

import class_basic.man.Man;

public class Tv_test {
    public static void main(String[] args) {
        Televisiton tv = new Televisiton();

        //객체명.변수명    객체명.메서드명으로 변수와 메서드 기능 사용가능
        System.out.println(tv.modelName);
        tv.powerOn();

        //object 클래스는 모든 클래스의 부모클래스다 (최상위클래스)
        //자바는 자료형이 다르면 데이터 저장이 불가
        //다형성에 의해서 부모 클래스로 자식 클래스 객체를 저장할 수 있다. (자식클래스 기능은 구현못함)
        Object object1 = new Televisiton();
        Object object2 = new Man("name",11,"addr");
    }
}
