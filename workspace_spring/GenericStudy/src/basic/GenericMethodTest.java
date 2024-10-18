package basic;

public class GenericMethodTest {
    public static void main(String[] args) {

        //<참고>Static사용해서 객체 생성 안 했음
        //제네릭 메소드 호출
        //제네릭 메소드의 자료형은 메소드를 호출할 때 결정한다.
        //자료형은 제네릭 메소드 명 앞에 적어준다.
        //변수는 리턴타입에 맞춰서 작성하기
        Box<String> box1 =  GenericMethod.makeBox("wow");
        Box<Integer> box2 = GenericMethod.makeBox(123456789);

        System.out.println(box1.getData());
        System.out.println(box2.getData());

        System.out.println("----------제네릭 문법----------");

        Box<String> box = new Box<>();
        box.setData("box");
        Box<Integer> box3 = new Box<>();
        box3.setData(123);
        GenericMethod.peekBox(box);
        GenericMethod.peekBox(box3);

        System.out.println("----------와일드 카드----------");

        GenericMethod.wildCardBox(box);
        GenericMethod.wildCardBox(box3);

        Box<Phone> b1 = new Box<>();
        GenericMethod.wildCardBox1(b1);


    }
}
