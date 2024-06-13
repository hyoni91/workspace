package object_class;


// Immutable(이하 불변) 클래스는 객체를 한 번 만들게 되면 상태(필드의 값)를 변경할 수 없는 클래스이다.
//https://limkydev.tistory.com/68
public class String_3 {
    public static void main(String[] args) {

        //String 객체의 특이점
        //스트링 객체는 Immutable (값이 변하지 않는) 객체이다.
        String addr1 = "울산";
        String addr2 = addr1;
        addr1 = "서울";
        System.out.println(addr1); //서울
        System.out.println(addr2); //울산

        /* immutable ? */
        String a ="kim";
        a = "lee"; //새로운 공간을 만들어버림!
        System.out.println(a);
    }
}
