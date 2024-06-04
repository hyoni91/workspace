package 다섯째_반복문.For;

//임의의 정수를 입력받아 1부터 입력받은 수까지 중 짝수의 개수를 구하여라

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num ;

        System.out.print("정수 입력 : ");
        num = sc.nextInt();

        int cnt = 0;
        for (int i =1; i < num+1; i++   ){
            if (i%2==0){
                cnt++;
            }
        }

        System.out.println("짝수의 개수 : "+cnt);
    }
}
