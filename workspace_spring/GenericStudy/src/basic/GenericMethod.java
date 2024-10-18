package basic;

import java.util.List;

//클래스가 제네릭이 아닌! 클래스 안의 특정 메소드만 제네릭화 시키기
public class GenericMethod {

    //매개변수로 데이터가 전달 되고, 그 데이터는 자료형이 정해지지 않음
    //이러한 매개변수를 전달받아 box에 저장하고
    //데이터가 저장된 box를 리턴하는 메소드
    //static : 제네릭 메소드를 편하게 쓰려고 작성했을 뿐 제네릭 메소드와 상관없음! (객체없이 실행하면 바로 실행됨!)
    public static  <T> Box<T> makeBox (T data){
        Box<T> box = new Box<T>();
        box.setData(data);

        return box;
    }

    public static <T> void peekBox(Box<T> box){
        System.out.println(box.getData());
    }


    //제네릭 메소드일까? --> 정답 : NO!
    //와일드 카드 문법
    // ? : 어떤 자료형도 받을 수 있음
    public static void wildCardBox(Box<?> box){
        System.out.println(box.getData());
    }


    //와이들 카드 상한제한
    // Phone클래스 혹은 Phone클래스를 상속한 클래스만 들어 올 수 있음
    public static void wildCardBox1(Box<? extends Phone> box){
        System.out.println(box.getData());
    }

    //와이들 카드 하한제한
    //MobliePhone클래스 혹은 MobilePhone클래스의 부모클래스만 허용-->  Phone 과 Object
    public static void wildCardBox2(Box<? super MobliePhone> box){
        System.out.println(box.getData());
    }


}
