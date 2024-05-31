package IF_문제_2;

/*
세 정수를 선언하고 scanner로 값을 입력받는다. 그리고 세 수를 큰 순서대로 출력하여보라.(난이도 높음)
-출력예시-
첫번째 수 : 10
두번째 수 : 30
세 번째 수 : 20
30 > 20 > 10

* */


import java.util.Scanner;

public class Test6 {

    public static void main(String[] args) {

        int n1, n2 , n3 ;
        int max ;
        int min ;
        int middle ;


        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 수 :" );
        n1 = sc.nextInt();

        System.out.print("두번째 수 :" );
        n2 = sc.nextInt();

        System.out.print("세번째 수 :" );
        n3 = sc.nextInt();

        if(n1>n2 && n1>n3 || n2 > n3 ){
            max = n1 ;
            middle = n2;
            min = n3;
        }else if (n2 > n3 && n2 > n1 || n1 >n3){
            max = n2 ;
            middle = n1;
            min = n3 ;

        } else if(n3 > n1 && n3 > n2 || n2 > n1){
            max = n3;
            middle = n2;
            min = n3;
        }


    }
}
