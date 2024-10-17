package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoxTest {
    public static void main(String[] args) {

        //제네릭 문법이 적용된 클래스의 자료형은 객체 생성 시 결정해야한다.
        //Box 객체 생성
        Box<String> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();
        Box<Apple> box3 = new Box<>();
        Box<Orange> box4 = new Box<>();

        box1.setData("제네릭~~~");
        box2.setData(111);
        box3.setData(new Apple());
        box4.setData(new Orange());

        String data1 = box1.getData();
        Integer data2 = box2.getData();
        Apple data3 = box3.getData();
        Orange data4 = box4.getData();

        System.out.println("== 제네릭문법 적용 결과 ==");
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println(data4);



        //리스트 생성 시 문법과 같다😲
        //리스트 ==> 제네릭으로 만들어짐
        //참고로 List는 List<E>로 만들어져 있다.
        List<String> list = new ArrayList<>();

        //Map도 제네릭 문법으로 만들어짐
        Map<String, Integer> map = new HashMap<>();

        Box<MemberVO> box5 = new Box<>();

    }
}



