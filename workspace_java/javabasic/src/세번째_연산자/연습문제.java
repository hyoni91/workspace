package 세번째_연산자;


/*
키보드로 이름, 국어점수, 영어점수, 수학점수를 입력받는다. (단, 점수는 정수만 입력할 것)
모든 정보를 입력 받은 후, 입력 받은 이름, 국어점수, 영어점수, 수학점수와  총점 및 평균을 출력하기

변수 먼저 선언하기!

*/

import java.util.Scanner;

public class 연습문제 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력하세요.");
        System.out.println("이름 :");
        String name = sc.next();

        System.out.println("국어점수를 입력하세요.");
        System.out.println("국어점수 :");
        int ko = sc.nextInt();

        System.out.println("영어점수를 입력하세요.");
        System.out.println("영어점수 :");
        int en = sc.nextInt();

        System.out.println("수학점수를 입력하세요.");
        System.out.println("수학점수 :");
        int mat = sc.nextInt();

        double i = ko+en+mat;
        System.out.println("당신의 총 점수는 : " + i + "입니다." );

        double e = i / 3 ;
        System.out.println("당신의 평균 점수는 : " + e + "입니다." );



    }
}

