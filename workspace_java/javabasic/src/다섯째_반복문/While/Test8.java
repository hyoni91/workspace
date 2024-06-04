package 다섯째_반복문.While;


//임의의 정수를 입력받아 1부터 입력받은 수까지 중 짝수의 개수를 구하여라. while문 사용

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int a ;
        int cnt = 0;

        System.out.print("숫자 입력 : ");
        a = sc.nextInt();

        // i < a +1
        while (i <= a){
            if(i %2 ==0){
                cnt++;
            }
            i++;
        }

        System.out.print("짝수의 개수 : " + cnt);

    }
}
