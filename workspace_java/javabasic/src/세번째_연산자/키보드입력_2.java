package 세번째_연산자;

import java.util.Scanner;

public class 키보드입력_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        키보드로 문자열 하나를 받는다.
        String r1 = sc.next();
        System.out.println("입력받은 글 : " + r1);


//        키보드로 실수 하나를 입력 받는다.
        double r2 = sc.nextDouble();
        System.out.println("입력받은 실수 : " + r2);   //위에서부터 해석하기 때문에 문자열 (String) 값 주고, 실수 값



    }
}
