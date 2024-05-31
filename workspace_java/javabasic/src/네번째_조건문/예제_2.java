package 네번째_조건문;

import java.util.Scanner;

public class 예제_2 {

    public static void main(String[] args) {

//        키보드로 정수 하나를 입력 받아, 입력 받은 정수가 짝수이면 '1' 출력, 그렇지 않으면 '2'

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력 :");
        int num = sc.nextInt();


//        홀수는 나머지 '1'
        if(num % 2 ==0 ){
            System.out.println(1);
        } else{
            System.out.println(2);
        }

    }
}
