package IF_문제_2;

/*
* 1. Scanner를 이용하여 정수를 3개 입력받고 이 세 개의 수로 삼각형을 만들 수 있는지를 판별하라. 삼각형이 가능하려면 두 변의 합이 다른 한 변의 합보다 반드시 커야 한다.*/

import java.util.Scanner;

public class Test7_심화심심풀이 {

    public static void main(String[] args) {
        int a, b, c ;

        Scanner sc = new Scanner(System.in);

        System.out.print("정수:");
        a = sc.nextInt();
        System.out.print("정수:");
        b = sc.nextInt();
        System.out.print("정수:");
        c = sc.nextInt();

        boolean tr = a+b > c;

        if(a+b >c && a+c > b && b+c > a){
            System.out.println("된다");

        }




    }
}
