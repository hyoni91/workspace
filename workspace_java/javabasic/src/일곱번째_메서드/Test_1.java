package 일곱번째_메서드;

import java.util.Arrays;
import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {


//        test1();
//        test2_1();
//        test2_2();
//        test3(5);
//        test4("jung");
//        test5(5,5);
//        test6(2,1,1);
//        test7(10,2);
//        test8("김","석진");
//        test10("김남준",29,"서울");

        Scanner sc = new Scanner(System.in);
//        System.out.print("첫번째 정수: ");
//        int a = sc.nextInt();
//        System.out.print("두번째 정수: ");
//        int b = sc.nextInt();
//        test13(a,b);

//         System.out.print("이름: ");
//         String a = sc.next();
//        System.out.print("나이: ");
//         int b = sc.nextInt();
//        System.out.print("주소: ");
//         String c = sc.next();
//         test12(a,b,c);





    }


    //1.안녕하세요’ 라는 문자열를 출력하는 기능을 가진 메소드를 선언하고, 호출
    public static void test1(){
        System.out.println("안녕하세요");
    }

    //'반갑습니다’ 라는 문자열을 출력하는 기능을 가진 메소드와 ‘오서오세요’라는 문자열을 출력하는 메소드를 각각 선언하고,
    // 실행 결과 ‘반갑습니다 어서오세요’라는 문자열이 출력되게 호출하여 보자.
    public static void test2_1(){
        System.out.print("반갑습니다");
    }

    public static void test2_2(){
        System.out.print("어서오세요");
    }

    // 정수 하나를 매개변수로 받아, 그 값을 출력하는 메소드를 선언하고 호출하여 보세요.
    public static void test3(int num){
        System.out.println("num =" + num);
    }

    //문자열 하나를 매개변수로 받아, 그 문자열을 출력하는 메소드를 선언하고 호출해보세요.
    public static void test4(String name){
        System.out.println("name : "+ name);
    }

    //정수 두 개를 매개변수로 받아, 두 수의 합을 출력하는 메소드를 선언하고 호출해 보세요.
    public static void test5(int n1, int n2){
        System.out.println("두 수의 합 : " + (n1+n2));
    }

    //정수 세 개를 매개변수로 받아, 세 수의 곱을 출력하는 메소드를 선언하고 호출해 보세요.
    public static void test6(int num1,int num2, int num3){
        System.out.println("세 수의 곱"+ (num1*num2*num3));
    }

    //두 정수를 매개변수로 받아, 두 정수의 나눗셈 몫과 나머지를 출력하는 메소드를 선언하고 호출해보세요.  ????
    public static void test7(int a, int b){

        double d1 = a/b;
        System.out.println("두 정수의 나눗셈 몫 :"+ d1 );
        System.out.println("두 정수의 나머지 :"+ (int)d1%2 );
    }

    //두 문자열을 매개변수로 받아, 두 문자열의 나열결과를 출력하는 메소드를 선언하고 호출해보세요.
    public static void test8(String s1, String s2){
        System.out.println(s1 + s2);
    }

    //름을 매개변수로 받아 이름을 출력하는 메소드, 나이를 매개변수로 받아 나이를 출력하는 메소드, 주소를 매개변수로 받아 주소를 출력하는 메소드를 각각 만들고 출력결과가 아래와 같게 프로그래밍하세요.
    //- 출력결과 예시-
    //이름은 김형진입니다.
    //나이는 33살입니다.
    //주소는 울산입니다.

    //위의 문제를 하나의 메소드를 사용하여 출력결과가 같게 프로그래밍 해보세요.
    public static void test10(String name, int age, String addr){
        System.out.println("이름은 "+ name + "입니다");
        System.out.println("나이는 "+ age + "입니다");
        System.out.println("주소는 "+ addr + "입니다");
    }

    //입력받은 정수를 매수변수로 받아, 해당 정수를 출력하는 메소드를 선언하고 호출해보세요.
    public static void  test11(int scan){

    }

    //10번 문제를 풀었다면, 10번 문제에서 매개변수로 받는 이름, 나이, 주소를 scanner를 통한 입력으로 바꾸어 풀어보세요.
    public static void test12(String name1, int age1, String addr1){
        System.out.println("이름은 "+ name1 + "입니다");
        System.out.println("나이는 "+ age1 + "입니다");
        System.out.println("주소는 "+ addr1 + "입니다");

    }

    //13scanner로 정수 두 개를 입력받아, 입력받은 두 수를 매개변수로 사용하여 두 수의 합을 출력하는 메소드를 선언하고, 호출해보세요.
    public static void test13(int scan1, int scan2){
        System.out.println( scan1 + scan2 );
    }

}
