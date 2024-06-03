package 네번째_조건문;

/*

    점수를 키보드로 입력받기(정수)
    키보드로 입력받은 점수가
     90 <= x  <= 100 "A"
     80 <= x  <= 89 "B"
     70 <= x  <= 79 "B"
      x <70         "D"

     나누기 활용

*/

import java.util.Scanner;

public class Switch_예제_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sco ;


        System.out.print("점수 입력:");
        sco = sc.nextInt();

        switch (sco / 10){
            case 10 , 9 :
                System.out.println("A");
                break;
            case 8 :
                System.out.println("B");
                break;
            case 7 :
                System.out.println("c");
                break;
            default:
                System.out.println("d");

        }



    }
}
