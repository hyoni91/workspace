package 세번째_연산자;

public class 연산자_3 {
    public static void main(String[] args) {

//        증감 연산자 : +1 또는 -1
        int a = 5;

//        1증가
        ++a;  //단독사용
        System.out.println(a);
//        1증가 (앞 또는 뒤에 ++ )
        a++;  // 6+ 1   단독사용
        System.out.println(a);

//        1감소 (앞 또는 뒤에 -- )
        --a;  //단독사용
        System.out.println(a);
        a--;  //단독사용
        System.out.println(a);

        System.out.println("---------------------------------");

//        증감연산자는 단독사용과 다른 코드와 함께 사용하는지에 따라서 결과 값이 다르다.
//        다른 코드와 함께 쓰는 경우  1. (++a) --> 1증가 후, 다른 코드 실행    2. (a++)   --> 다른 코드 전부 시행 후, 마지막에 1 증가  [감소도 동일]
        int b = 5;
        System.out.println(++b); //6

        int c = 5;
        System.out.println(c++);//5
        System.out.println(c); //6
        System.out.println(c); //6


//        증감연산자를 다른 코드와 함께 실행했을 경우의 값
        int num1 = 10;
        int result = 10 + num1 ++;

        System.out.println(result); //20  --> 1 증가 전 코드 시행
        System.out.println(num1); //11  --> 위에 증감 코드 실행 후 실행됐기 때문에 11


        int a1 = 10;
        int b2 = 20;
        int z = ++a1 + b2--;

        System.out.println(a1); //11
        System.out.println(b2); //19
        System.out.println(z); //31



    }
}


