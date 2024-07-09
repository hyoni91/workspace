package Test;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력: ");
        int num = sc.nextInt();

        int first = num/100;  //100의자리
        int second = (num%100)/10;  //10의자리
        int third = num%10;  //1의자리
        int clapCnt = 0;


        if(first == 3 || first ==6 || first ==9){
            clapCnt++;
        }

        if(second == 3 || second ==6 || second ==9){
            clapCnt++;
        }

        if(third == 3 || third ==6 || third ==9){
            clapCnt++;
        }

//
//        if(clapCnt == 3){
//            System.out.println("박수 3번");
//        }else if(clapCnt == 2){
//            System.out.println("박수 2번");
//        }else if(clapCnt == 1){
//            System.out.println("박수 1번");
//        }else {
//            System.out.println("박수 0번");
//        }

        switch (clapCnt){
            case 0 : System.out.println("박수 0번");
                break;
            case 1 : System.out.println("박수 1번");
                break;
            case 2 : System.out.println("박수 2번");
                break;
            case 3 : System.out.println("박수 3번");
        }




    }
}
