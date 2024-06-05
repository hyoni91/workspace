package 일곱번째_메서드;

public class Test_1_14 {
    public static void main(String[] args) {

//        test14(5);
//        test15(2,2);
//        test16(6);
        test17(1, 5);
    }

    //14. 한 정수를 매개변수로 받아, 그 정수가 짝수이면 ‘짝수입니다’, 홀수이면 ‘홀수입니다’를 출력하는 메소드를 선언하고 호출해보세요.

    public static void test14(int num) {

        if (num % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
    }

    //15. 두 정수를 매개변수로 받아,
    // 두 정수가 모두 짝수이면 ‘두 수는 짝수입니다.’를 출력하고,
    // 한 정수만 짝수일 경우 ‘한 수만 짝수입니다.’를,
    // 두 수 모두 홀수일 때는 ‘두 수는 홀수입니다.’를
    // 출력하는 메소드를 선언하고 호출해보세요.

    public static void test15(int n1, int n2) {

        if (n1 % 2 == 0 && n2 % 2 == 0) {
            System.out.println("두 수는 짝수입니다.");
        } else if (n1 % 2 == 0 || n2 % 2 == 0) {
            System.out.println("한 수만 짝수입니다.");

        } else {
            System.out.println("두 수는 홀수입니다.");
        }
    }

    //16. 한 정수를 매개변수로 받아, 0부터 입력받은 숫자까지 출력하는 메소드를 선언하고 호출해보세요.

    public static void test16(int number) {

        for (int i = 0; i < number + 1; i++) {
            System.out.println(i);
        }
    }

    //17. 두 정수를 매개변수로 받아, 두 정수 사이의 모든 숫자를 출력하는 메소드를 선언하고 호출해보세요.

    public static void test17(int a1, int b1) {
//        int max= 0;
//        int min= 0;
//
//        if(max < a1 && max > b1){
//            max =a1;
//            min =b1;
//        }else {
//            max = b1;
//            min = a1;
//        }
//
//        for (int i = min; i < max; i++) {
//            System.out.println(i);
//
//        }

    }
}




