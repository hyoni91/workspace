package IF_문제_3;

/*
심화문제 2번
*/

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int xPos,yPos ;

        System.out.print("점(x,y)의 좌표를 입력하시오>>");
        xPos = sc.nextInt();
        yPos = sc.nextInt();


        if(xPos >=50 && xPos <=100 && yPos >=50 && yPos <=100){
            System.out.println("입력하신 좌표는 사각형 안에 있습니다.");
        }else {
            System.out.println("입력하신 좌표는 사각형 밖에 있습니다.");
        }

    }
}
