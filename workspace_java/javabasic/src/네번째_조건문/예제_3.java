package 네번째_조건문;

import java.util.Scanner;

public class 예제_3 {

    public static void main(String[] args) {

        //        키보드로 정수 하나를 입력 받아, 입력 받은 정수가 3의 배수이면서 5의 배수 일때만 '1' 출력


        Scanner sc = new Scanner(System.in);

        System.out.print("입력:");
        int n1 = sc.nextInt();

        if(n1 % 3 ==0 && n1 % 5 ==0 ){
            System.out.println(1);
        }


    }
}
