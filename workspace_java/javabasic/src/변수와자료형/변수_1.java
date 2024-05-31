package 변수와자료형;

public class 변수_1 {
    //main
    public static void main(String[] args) {
//        Variable(변수) 값을 저장할 수 있는 공간
//        Variable 를 사용하기 위해서는 먼저 변수를 선언해야 한다.

//        변수 선언 문법 : 자료형(data Type) 변수명 ;
        int num; //정수를 저장할 공간 num (변수명) 을 선언
        num = 5 ;  //넣는 법   ★ '=' (대입연산자) 우측의 값을 왼쪽에 저장한다! (대입, 할당)
//        num = 1.5; //정수가 아니라서 오류

        System.out.println("num");
        //변수 값 실행
        System.out.println(num);

        System.out.println("num="+num);

//       하나의 변수에는 하나의 값만 저장할 수 있다. 여러번 저장한 경우, 가장 마지막에 넣은 값만 저장한다.
        num = 19;
        System.out.println("num =" + num);
    }
}
