package Test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a,b,c;
        int max = 0;
        int mid = 0;
        int min = 0;

        System.out.print("첫번째 입력 : ");
        a = sc.nextInt();
        System.out.print("두번째 입력 : ");
        b = sc.nextInt();
        System.out.print("세번째 입력 : ");
        c = sc.nextInt();

        //a,b,c 각각의 큰 경우
        if (a < b && a > c){
            max = a;
            if (b > c){
                mid = b;
                min =c ;
            }else {
                mid =c;
                min =b;
            }
        }else if (b > a && b > c){
            max = b;
            if(c > a){
                mid =c;
                min =a;
            }else {
                mid =a;
                min =c;
            }
        }else if(c > a && c > b){
            max = c;
            if(b > a){
                mid=b;
                min=a;
            }else {
                mid=a;
                min=b;
            }
        }

        System.out.println(max +" > "+ mid + " > "+ min );
    }

}
