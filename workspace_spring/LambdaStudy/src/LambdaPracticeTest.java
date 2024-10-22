import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.List;

public class LambdaPracticeTest {
    public static void main(String[] args) {

        //문제1.람다식으로 LambdaPractice 인터페이스 안의 printName 메소드의 기능을
        //사용하여 '홍길동입니다' 호출 및 출력

        LambdaPractice p= () -> System.out.println("홍길동 입니다");
        p.printName();

        //문제2. 람다식 for 문으로 리스트 출력
        List<String> nameList = new ArrayList<>();
        nameList.add("석진");
        nameList.add("냄준");
        nameList.add("홉");

        //람다식 forEach
        nameList.forEach((e)-> System.out.println(e));

        System.out.println("----매개변수를 가지는 람다식 🧐🧐----");

        //매개변수가 있는 람다식
        //매개변수목록 (매개변수) -> {실행문}

        //하나일 때는 자료형 생략 가능!
        //매개변수가 하나면 () 생략 가능
        LambdaPractice1 p1 = name -> System.out.println(name);
        p1.printName("태태");

        //매개변수 두 개일때
        //매개변수 타입 생략 불가능
        LambdaPractice2 p2 = (String name, int age) -> System.out.println("이름: "+name +  " 나이: " + age);
        p2.printMyInfo("쿡" ,20);

        //리턴값이 필요할때
        //리턴문을 가질경우 {} 생략 불가
        LambdaPractice3 p3 = () -> {return 10;};
        System.out.println(p3.getData());

        //리턴값에 매개변수가 있을때
        //연산 가능
        LambdaPractice4 p4 = (int a, int b ) -> {return a + b;};
        System.out.println(p4.getResult(5,10));

        LambdaPractice4 result = null;
        result = (a,b) -> a > b ? a-b : b;


        //람다식 연습
        System.out.println("----제네릭 문법을 적용한 람다식----");

        LambdaPractice5<Integer> p5 = (a,b) -> {return a + b;};
        System.out.println(p5.getResult(10,10));

        LambdaPractice5<String> p6 = (school,name) -> {return "학교 : " + school + ", 이름 : " + name;};
        String info = p6.getResult("방탄고","석진");
        System.out.println(info);


        LambdaPractice7<String,Integer > p7 = (str1,str2) -> str1.length() + str2.length();
        System.out.println(p7.getResult("안녕하세요","반가워요"));



    }
}
