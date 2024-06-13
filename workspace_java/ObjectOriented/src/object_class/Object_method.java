package object_class;
//오브젝트 클래스 기능
import class_basic.Monitor;

public class Object_method {
    public static void main(String[] args) {
        Object obj=new Object();
        Person p1 =new Person();
        Person p2 =new Person();

        p1.name = "sj";
        p1.age = 20;
        p2.name = "sj";
        p2.age = 20;

        /*  .equals()
        매개변수로 들어온 데이터와 현재 데이터가 같은지 판단 $ 등가 비교 연산(==)과 동일한 역할로 스택에 저장된 메모리 값을 비교 (리턴타입:boolean)*/
        p1.equals(p2); // 데이터가 같니?  판단근거는?

        //데이터마다 같다는 기중이 다르기 때문에 개발자가 기준을 재정의해서 사용(equals 메서드를 재사용해서 써라)
        System.out.println(p1.equals(p2)); // 이름나이같으면 true

        /*  .toString()
        객체의 정보를 문자열로 출력. (반환타입:String)
        출력문에 객체명만 넣으면 자동으로 문자열로 반환 (자동 toString()메서드 호출)*/

        //문자열?  다시 재정의해서 써라
        System.out.println(p1.toString());
        System.out.println(p1); // 문자열로 출력

    }
}
