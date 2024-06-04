package 다섯째_반복문.For;

//키보드로 두 정수를 입력받아 입력받은 두 정수 사이의 모든 정수의 합을 출력하여라.

import java.util.Scanner;

public class Test_2_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("정수 입력 :");
        int num1= sc.nextInt(); //1
        System.out.print("정수 입력 :");
        int num2= sc.nextInt(); // 5

        //2+3+4=9

        //먼저 큰수와 작은수를 정해준다!
        int sum =0;
        int max , min ;

        if (num1 > num2){
            max=num1;
            min=num2;
        }else {
            max=num2;
            min=num1;
        }

        //사이의 합을 구한다.
        for (int i = min+1; i < max ; i++ ) {
            sum=sum+i;
        }
        System.out.println(sum);


    }

}

