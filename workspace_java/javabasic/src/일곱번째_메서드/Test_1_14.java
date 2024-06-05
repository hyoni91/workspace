package 일곱번째_메서드;

public class Test_1_14 {
    public static void main(String[] args) {

//        test14(2);
//        test15(2,2);
//        test16(6);
//        test17(5, 1);
//        test18(1,10);
        test19("방탄",19);

    }

    //14. 한 정수를 매개변수로 받아, 그 정수가 짝수이면 ‘짝수입니다’, 홀수이면 ‘홀수입니다’를 출력하는 메소드를 선언하고 호출해보세요.
    public static void test14(int num) {

        //삼항연산자
        int a = 10 > 5 ? 1 : 2 ;   //  참 또는 거짓 조건 ? 참일때 실행 : 거짓일때 실행    ----> 참이기 때문에 int a = 1 이 된다

        //if문으로 풀이
        if (num % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }

        //삼항연산자로 풀이
        System.out.println(num % 2 ==0 ? "짝수" : "홀수");  // ★★프린트는 연산이 가능하면 결과를 출력함★★

    }
    //15. 두 정수를 매개변수로 받아,
    // 두 정수가 모두 짝수이면 ‘두 수는 짝수입니다.’를 출력하고, 한 정수만 짝수일 경우 ‘한 수만 짝수입니다.’를,
    // 두 수 모두 홀수일 때는 ‘두 수는 홀수입니다.’를 출력하는 메소드를 선언하고 호출해보세요.

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

        //삼항연산자로 큰 수를 구할 수 있다. (비교대상자가 두개일 경우)
        int max = a1 > b1 ? a1 : b1;
        int min = a1 < b1 ? a1 : b1;

        for (int i = min; i < max; i++){
            System.out.println(i);
        }

    }

    //두 정수를 매개변수로 받아, 두 정수 사이의 5의 배수의 개수를 출력하는 메소드를 선언하고 호출해보세요.
    public static void test18(int num1, int num2){
        int max = num1 > num2 ? num1 : num2;
        int min = num1 < num2 ? num1 : num2;

        int cnt = 0;
        for (int i = min; i < max; i++){
            if(i%5==0){
                cnt++;
            }
        }
        System.out.println("5의 배수 개수 : " + cnt);
    }

    //한 문자열과 정수를 매개변수로 받아, 매개변수로 받은 문자열을 매개변수로 받은 숫자만큼 반복 출력하는 메소드를 선언하고 호출해보세요.

    public static void test19(String st, int num){
        for (int i =0; i < num; i++){
            System.out.println(st);
        }

        System.out.println("--------------선생님풀이 ------------");
        //선생님풀이

        String result = " ";
        for (int i = 0; i <num; i++){
            result = result + st;
        }

        System.out.println(result);

        // st ="home" num = 2    매개변수로 받았다는 예시
        //i = 0, result = " " + st ("home")   ->   result =" home"
        //i= 1 , result = " home " + st ("home")  ->   result =" home home "
        //i= 2 , result = " home home" + st ("home")  ->   result =" home home home"
    }

}




