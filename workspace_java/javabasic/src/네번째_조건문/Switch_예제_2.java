package 네번째_조건문;


/*
    주민등록번호의 7번째 자리는 성별을 나타낸다.
    7번째 자리의 수가 1 또는 3 = 남성
    7번째 자리의 수가 2 또는 4 = 남성
    키보드로 주민등록번호 7번째자리를 입력 받아, 남자일 경우 남성, 여자일 경우 여성으로 출력
    나머지 잘못된 숫자를 입력하면 오류 출력
*/


import java.util.Scanner;

public class Switch_예제_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num ;

        System.out.print("주민번호 7번째 자리 입력:");
        num = sc.nextInt();


        switch (num){
            case 1,3 :
                System.out.println("남성");
                break;

            case 2,4:
                System.out.println("여성");
                break;

            default:
                System.out.println("오류");
        }

    }
}
