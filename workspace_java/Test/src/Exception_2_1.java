import java.util.InputMismatchException;
import java.util.Scanner;

// catch(예외를 전달받음)
// catch 문은 여러개 작성 가능

public class Exception_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {System.out.print("첫번째: ");
            int num1 = sc.nextInt();
            System.out.print("두번째: ");
            int num2 = sc.nextInt();

            System.out.println(num1/num2);
        }catch (ArithmeticException e1){
            System.out.println("수학적 오류 발생");
        }catch (InputMismatchException e2){
            System.out.println("입력 자료형 불일치");
        }


        System.out.println("프로그램 종료");
    }
}

