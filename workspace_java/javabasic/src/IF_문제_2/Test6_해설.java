package IF_문제_2;

import java.util.Scanner;

public class Test6_해설 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c ;
        int max, mid, min ;

        System.out.print("첫번째 수 : ");
        a = sc.nextInt();
        System.out.print("두번째 수 : ");
        b = sc.nextInt();
        System.out.print("세번째 수 : ");
        c = sc.nextInt();



        if(a>b && a>c ){ //a가 가장 큰 수라면...
            max=a;
            if(b>c){
                mid=b;
                min=c;
            }else{// c > b
                 mid=c;
                 min=b;
            }
        } else if(b>a && b>c ){   //b가 가장 큰 수라면...
            max=b;
            if(a>c){
                mid=a;
                min=c;
            }else{// c > a
                mid=c;
                min=a;
            }
        }else{// (나머지 )c가 가장 큰 수라면
            max = c;
            if(a>b){
                mid=a;
                min=b;

            }else {
                mid=b;
                min=a;
            }
        }

        System.out.println(max + " > " + mid + " > " + min );



    }
}
