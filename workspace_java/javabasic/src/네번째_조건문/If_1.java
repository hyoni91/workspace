package 네번째_조건문;

/*
    조건문 : 조건이 맞을 때만 코드를 실행한다.    ( if , case)
    -----------------------------------------
    [if문 기본 문법 ]

     if (참&거짓을 판별할 수 있는 조건) {
        실행코드 ;
        실행코드 ;
        여러 줄 가능 ;
     }
    -----------------------------------------
 */

public class If_1 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");

        int x = 5;

//        조건이 참일 때만 값을 출력함
//        소괄호 안에는 필요한 만큼 코드 작성 가능
//        중괄호{}는 실행코드가 한 줄 일때는 생략 가능 (안 씀)
        if(x < 3) {
            System.out.println(1);
        }



        System.out.println("프로그램 종료");

    }
}
