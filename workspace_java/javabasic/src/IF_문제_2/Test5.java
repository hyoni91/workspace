package IF_문제_2;

/*

정수형 변수를 두 개 선언하고, scanner 로 값을 입력받는다. 입력받은 수의 크기를 비교하여 큰수부터 나열하여 출력하여라.(굵은 기울기체는 사용자가 입력하는 부분이다)
-출력예시-
첫번째 수 : 10
두번째 수 : 20
20 > 10

* */


import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int num1 , num2 ;
        int max; //큰 수 저장
        int min; // 작은 수 저장

        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 수 :" );
        num1 = sc.nextInt();
        System.out.print("두번째 수 :" );
        num2 = sc.nextInt();

//        if (num1 > num2){
//            System.out.println(num1 +" > "+ num2);
//        }else if(num2 > num1){
//            System.out.println(num2 + " > " + num1);
//        }

        //선생님 풀이

        if(num1 > num2){
            max = num1;
            min= num2;
        }else {
            max = num2;
            min = num1;
        }

        System.out.println(max + " > " + min);
    }
}
