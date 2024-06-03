package 네번째_조건문;


import java.util.Scanner;

public class Switch_예제_1 {
    public static void main(String[] args) {

//        키보드로 정수 하나를 입력 받은 후 그 값이 짝수이면 1 , 홀수면 2를 출력 , 그밖에는 0출력   (switch case break)

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("정수 입력:");
        num=sc.nextInt();

        switch (num % 2) {  // (안에는 값이 들어와야함!)
            case 0 :
                System.out.println(1);
                break;

            case 1 :
                System.out.println(2);
                break;

            default:
                System.out.println(0);

        }


        /*

        또다른 방법 !

         int num;
         int mod = num % 2

         switch (mod) {
            case 0 :
            case 1 :
            default :

         }

        * */


    }
}
