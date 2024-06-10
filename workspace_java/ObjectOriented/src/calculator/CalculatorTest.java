package calculator;

import java.util.Scanner;
import java.util.zip.Inflater;

public class CalculatorTest {

    //계산기 클래스를 사용하는 클래스를 만들어 계산기 프로그램을 실행하여 보세요.
    // main 메소드에서는 두 정수와 연산자를 scanner로 입력받습니다.
    // 입력받은 연산자에 따라 더하기, 뺴기, 곱셈, 나눗셈 중 하나를 실행합니다.
    // 실행 후 결과를 출력해보세요.
    // 실행 결과는 아래와 같아야 합니다.(굵은 기울임체는 입력받는 수입니다.)

    //-결과-
    //첫 번째 수 : 10
    //두 번째 수 : 20
    //연산자 : +
    //10 + 20 = 30

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();
        int n1,n2;
        String what;

        System.out.print("첫번째: " );
        n1 = sc.nextInt();
        System.out.print("첫번째: " );
        n2 = sc.nextInt();
        System.out.print("연산자: " );
        what = sc.next();

        System.out.print(n1 + " "+ what +" "+ n2 +" = " );
        cal.setCalculator(n1,n2,what);


    }
}
