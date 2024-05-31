package 네번째_조건문;

import java.util.Scanner;

public class 예제_1 {
    public static void main(String[] args) {

//        키보드로 정수를 입력 받아 입력 받은 점수가 10보다 클때만 '10보다 큽니다'라는 문자 출력

        Scanner sc = new Scanner(System.in);

        System.out.print("정수입력:");
        int a = sc.nextInt();

        if (a >10){
            System.out.println("10보다 큽니다");
        }

    }
}
