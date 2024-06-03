package IF_문제_3;

/*
    369게임
*/

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("1~99사이의 정수를 입력하시오.>>");
        num = sc.nextInt();

        int first = num / 10;  //10의 자리를 구하는 식
        int second = num % 10;  //1의 자리를 구하는 식 (10으로 나눈 나머지 수)
        int clapCnt = 0; //박수의 횟수


        // 십의 자리가 3,6,9면 clapCnt를 1증가     if( first % 3 ==0 $$ first !=0 ) 도 됨
        if(first==3 || first==6 || first==9) {
            clapCnt++;
        }

         // 일의 자리가 3,6,9면 clapCnt를 1증가
            if (second==3 || second ==6 || second==9){
                clapCnt++;
            }   //esle if는 안됨!!!


        //clapCnt의 값에 따라 출력하기 (값이 정해져 있을땐 스위치문)
        switch (clapCnt){
            case 1 :
                System.out.println("박수 짝");
                break;
            case 2 :
                System.out.println("박수 짝짝");

        }






//        if (first == 3 || first == 6 || first == 9 || second == 3 || second == 6 || second == 9) {
//                System.out.println("박수 짝");
//            }
//
//            if (first == 3 || first == 6 || first == 9 && second == 3 || second == 6 || second == 9) {
//                System.out.println("박수 짝짝");
//            }

    }
}




