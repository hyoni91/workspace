package 일곱번째_메서드;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test_2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
//        System.out.print("첫번째 수 : ");
//        int a = sc.nextInt();
//        System.out.print("두번째 수 : ");
//        int b = sc.nextInt();
//
//        int test_2 = test1(a,b);
//        System.out.println(test_1);
//
//        int max = test3(1,5);
//        System.out.println(max);
//
//        String name = test4("김석진","정호석");
//        System.out.println(name);
//
//        System.out.println(test5(100));
//
//        System.out.println(test6(5));
//        System.out.println(test7(10));
//        System.out.println(test8(5,5,5));
//        System.out.println(test9(20));



        }

//    9. 한 정수를 매개변수로 받아, 1부터 매개변수로 받은 수까지 중 홀수의 합을 리턴하는 메소드를 선언하고 사용해보세요.
        public static int test9 ( int num){

            int sum = 0;
            for (int i=1; i < num+1 ;i++) {
                if (i%2==1) {
                    sum = sum +i;
                }
            }
            return sum;
        }

        //8.세 정수를 매개변수로 받아, 세 정수의 평균을 리턴하는 메소드를 선언하고 사용해보세요.

        public static double test8 ( int a, int b, int c){
            int[] arr = {a,b,c};
                int sum =0;
               for(int i =0; i <arr.length; i++){
                   sum=sum+arr[i];
               }

            double avg = sum/ (double) arr.length;
            return avg;
        }

        //7.실수를 매개변수로 받아, 그 수의 제곱 값을 리턴하는 메소드를 만들고 사용해보세요.
        public static double test7 ( double num){
            return num*num;
        }


        //6.매개변수로 정수를 입력받아, 입력받은 정수를 문자열로 리턴하는 메소드를 선언하고 사용해보세요.
        public static String test6 ( int n){

            //★다른방법★
            //정수 -> 문자열
           String bb= String.valueOf(10); // "10"
            //문자열 -> 정수
            Integer.parseInt("10"); // 자동완성에 값은 String값 , 리턴은 int

            return "" + n;


        }

        //5. 임의의 정수를 매개변수로 받아, 만약 매개변수로 받은 정수가 90 이상이면 ‘A’, 70 이상이면 ‘B’, 그 외의 수가 들어오면 ‘C’를 리턴하는 메소드를 선언하고 사용해보세요.
        public static String test5 ( int score){
            if (score >= 90) {
                return "A";
            } else if (score >= 70) {
                return "B";
            } else {
                return "c";
            }
        }

        //4. 두 문자열을 매개변수로 받아, 두 문자열의 나열결과를 리턴하는 메소드를 선언하고 사용해보세요.
        public static String test4 (String name1, String name2){
            return name1 + name2;
        }

        //3. 두 정수를 매개변수로 받아, 두 정수 중 큰 숫자를 리턴하는 메소드를 선언하고 사용해보세요.
        public static int test3 ( int a, int b){
//        return a>b ? a:b;   젤 간단!

            int max = (a > b ? a : b);
            int min = (a < b ? a : b); // 이거는 필요없음!!!!!!!!!!!!
            return max;

//        if(a > b){
//            return a;
//        }else {
//            return b;
//        }   리턴값을 여러번 작성 가능, 대신 딱 한번만 실행 가능함! (둘 중 하나만 실행)  else if를 쓴다면 둘 다 실행이 안될 경우가 있기때문에 else 가 아니라 else if로 끝나기만 하면 안된다.

        }


        //2. scanner로 입력받은 두 정수를 매개변수로 받아, 두 정수의 곱을 리턴하는 메소드를 선언하고 호출하여 결과를 호학인해보세요.
        public static int test2 ( int n1, int n2){
            return n1 * n2;
        }


    }