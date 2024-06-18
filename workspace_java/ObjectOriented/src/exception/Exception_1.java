package exception;

//예외처리 : 프로그래밍에서 예외(exception)란 실행 중인 프로그램에서 예기치 못한 상황이 발생하여 더 이상 진행할 수 없는 상황을 말한다.
//예외처리를 할 경우, 프로그램 정상 실행 되는 것이 특징
//https://m.blog.naver.com/smhrd_official/223252841550

/* 예외처리 발생 시 문법
        try{
           예외가 발생할 수도 있는 코드 작성
        }catch(Exception e){ //예외에 대한 정보가 들어있는 클래스
            예외 발생 시 실행할 코드 (발생 즉시 실행됨)
        } finally {
            예외가 발생하던 하지 않던 무조건 실행할 코드
            (finally 는 생략 가능)
        }

        Exception 클래스 자주 쓰는 메세드
        e.getMessage() : 에러의 원인을 간단하게 출력 (왜 에러가 발생했는지 간단하게)
        e.toString() : 에러의 Exception 내용과 원인을 출력 (에러 발생 위치는 x)
        e.printStackTrace() : 에러의 발생근원지를 찾아서 단계별로 에러를 출력
 */

//unhandle Exception이  뜨면 예외처리하면 좋음

import java.util.Scanner;

public class Exception_1 {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);

        try {System.out.print("첫번째: ");
            int num1 = sc.nextInt();
            System.out.print("두번째: ");
            int num2 = sc.nextInt();

            System.out.println(num1/num2);
        } catch (Exception e){
            System.out.println("오류발생");
            System.out.println(e.getMessage());
        }
        System.out.println("프로그램 종료");
    }*/
}
}
