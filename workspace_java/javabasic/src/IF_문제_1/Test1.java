package IF_문제_1;

public class Test1 {
/*
1. 정수를 담을 수 있는 변수 두 개를 선언하고, 각각의 변수에 임의의 정수를 초기화하여라.
그리고 두 수의 합이 50보다 클 경우에는 ‘두 수의 합이 50보다 큽니다.’를 출력하고,
두 수의 합이 50 이하일 경우에는 ‘두 수의 합이 50이하 입니다.’를 출력해보세요.
 */

    public static void main(String[] args) {

        int num1 = 15 ;
        int num2 = 10 ;

        if(num1+num2 > 50){
            System.out.println("두 수의 합이 50보다 큽니다");
        } else {
            System.out.println("두 수의 합이 50이하입니다.");
        }

    }
}

