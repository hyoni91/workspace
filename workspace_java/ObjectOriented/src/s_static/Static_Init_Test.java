package s_static;

public class Static_Init_Test {

    public static void main(String[] args) {

        //스태틱을 생성자에서 초기화한 경우
//        Static_Init i1 = new Static_Init(); //스태틱 메모리생성(num 0) -> i1 객체 만듦 ->a생성 -> a->10  num-> 5 ++ -> 출력  10 , 6
//        Static_Init i2 = new Static_Init(); //공용변수 num 6 -> i2객체 만듦 - > a생성 ->  a=10   num 생성자에서 다시 5로 리셋 ++ -> 출력 10, 6
//        Static_Init i3 = new Static_Init(); //

        //스태틱 변수 초기화를 잘 시킨 경우
        Static_Init i1 = new Static_Init(); //static 변수 초기화 해석 스태틱 메모리 (num 5) 생성 -> i1객체 생성 -> 생성자 실행 (이때 num ++로 = 6으로 증가) 출력  n 10 , num6
         Static_Init i2 = new Static_Init(); // 스태틱 초기화 했기때문에 num 6 -> i2 객체생성 -> 6 ++; =7  -> 출력 n10 num7
        Static_Init i3 = new Static_Init(); // 위와 동일

        System.out.println("--------------");

        System.out.println("i1 멤버 변수 : "+ i1.n); // 멤버변수 읽고 사용할때  객체명.변수명

        //그렇다면, static 변수를 읽고 사용하는 방법 (일반 변수 처럼 불러오는 것은 추천하지 않는 방법)
        System.out.println("i1 스태틱 변수 : " + i1.num); //8
        System.out.println("i2 스태틱 변수 : " + i2.num); //8 (공용변수 이기때문에 마지막값으로 다 동일)
        System.out.println("i3 스태틱 변수 : " + i3.num); //8

        System.out.println();
        System.out.println("---스태틱 변수 선언 추천방법---");

        //클래스명.변수명
        //객체를 만들지 않아도 사용가능함!!!  (스태틱은 객체 생성보다 먼저 만들어지기 때문이다)
        System.out.println("Static_Init.num : " + Static_Init.num);  //본 클래스에서 선언된 스태틱 변수 명!

        //////////////////////////////////////////////////////////////////////////

        //클래스명.메서드명 (즉, 스태틱 메서드)
        Math.random();

        //프린트 해석 : 클래스명.스태틱 변수(참조자료형).오버로딩메서드;
        System.out.println();



    }
}
