package 세번째_연산자;

import java.util.Scanner;


//변수선언 먼저하는 것을 추천!!!

public class 연습문제_해설 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int korSco , engSco , matSco ;
        int totalSco;
        double avg;




        System.out.print("이름 입력: ");
        name = sc.next();
        System.out.print("국어 점수 : ");
        korSco = sc.nextInt();
        System.out.print("영어 점수 : ");
        engSco = sc.nextInt();
        System.out.print("수학 점수 : ");
        matSco = sc.nextInt();

        totalSco = korSco+engSco+matSco;
        System.out.println("총점 : "+ totalSco);
        avg = totalSco / 3.0; // 실수값 입력하기~~~!!
        System.out.println("평균"+ avg);


        System.out.println();
        System.out.println("이름 : "+ name);  // 개행 안 하는 출력
        System.out.println("국어: "+ korSco);
        System.out.println("영어: "+ engSco);
        System.out.println("수학: "+ matSco);
        System.out.println("-----------입력 결과 ------------");
        System.out.println("총점"+ totalSco );
        System.out.println("평균 "+ avg);



    }
}
