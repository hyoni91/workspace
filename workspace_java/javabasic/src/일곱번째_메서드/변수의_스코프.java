package 일곱번째_메서드;

//스코프(scope) : 영역
//변수의 스포크 : 선언한 변수를 사용할 수 있는 범위
//사용 범위 : 해당 변수를 선언한 중괄호 안에서만 사용 가능!   * for문 안에서 선언한 i를 밖에서 출력하지 못한 이유.

public class 변수의_스코프 {
    public static void main(String[] args) {
        int n;

    }

    //리턴타입이 없는 메서드
    public static void method1(){
        int n;

//        if(true){
//            int b = 10;
//        }
//
//        System.out.println(b);  b는 { }안에서만 사용가능

    }
    public static void method2(){
        int n;

    }
}
