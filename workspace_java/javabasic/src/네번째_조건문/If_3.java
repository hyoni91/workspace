package 네번째_조건문;

import java.util.Scanner;

public class If_3 {

//    if문 필수 조건   ( 필요시 else / else if )


    public static void main(String[] args) {

//        키보드로 정수를 하나 입력 받아, 입력 받은 수가 양수이면 '1', 음수이면 '2' , 0이면 '0'   ---> if(){}else if(){} else{}
//        양수 일때 1 , 그렇지 않으면 else if(다른 조건){참 일때 } {두 조건 다 충족 못 할때}
//         if는 한번만 선언, else if는 무한대,,  그렇지 않고 --면 ,,,,,, 단 if와 else 사이에 올 수 있음

        Scanner sc = new Scanner(System.in);

        System.out.print("정수:");
        int num = sc.nextInt();

        if(num>0){ // 조건이 참을 때
            System.out.println(1);
        }else if (num<0){  //그렇지 않으면, 다른 조건
            System.out.println(2);
        }else {
            System.out.println(0); // 그렇지 않으면... (둘다 충족 못함)
        }

    }
}
