package s_static;

//클래스를 배우기 전에는 왜 메서드에 static 을 붙였는가?
public class Static_Test2 {
    public static void main(String[] args) {

        //static이 부터 있으면 main과 함께 해석됨
        aaa();
    }

    public static void aaa(){
        System.out.println("static 붙은 이유");
    }
}
