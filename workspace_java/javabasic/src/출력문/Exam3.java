package 출력문;

public class Exam3 {
    public static void main(String[] args){
        //문자열은 반드시 " " 안에 작성
        System.out.println("안녕?");

        //숫자는 "" 로 감싸지 않는다. *연산가능
        System.out.println(2110058);
        System.out.println(21+34);

        // " "안의 숫자는 문자로 인식한다. *연산불가
        System.out.println("211-0058");
        System.out.println("21+34");

        //sout
        System.out.println("--------------");

        System.out.println(10+10);
        //문자끼리의 합은 문자를 연결시켜준다.
        System.out.println("java"+"hello");
        //숫자와 문자의 합도 연결시켜준다. (숫자를 문자로 간주하고 나열함) 연산의 결과 : 문자
        System.out.println(10+"java");

        //숫자 + 숫자 + 문자  >>> 앞에서 부터 계산   연산 결과 : 문자
        System.out.println(10 + 20 + "java");
        System.out.println(10+"java"+20);

        //문자는 + 만 가능! (나열)
        System.out.println(5+"java"+ 5 * 10);

        System.out.println("-----------------------------------");
        //연산기호 https://phantom.tistory.com/19
        //연산 (참 거짓)
        System.out.println(10 > 5);
        System.out.println(10 < 5);

        // ==  (같다) != (같지 않다)
        System.out.println(10 == 2);
        System.out.println(10 != 10);
        System.out.println(10 != 2);
    }
}
