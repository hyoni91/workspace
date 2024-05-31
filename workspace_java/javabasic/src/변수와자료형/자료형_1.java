package 변수와자료형;


//자바는 기본 자료형과 참조 자료형으로 데이터 타입을 구분
//자료형이 다르면 데이터 저장 불가능함!!!!!!!!!!!

//기본 자료형 [8타입]  ★소문자로 시작!!★
//참조 자료형 [무한대] ★대문자로 시작!!★


/* 기본 자료형  -외워요!-
   바이트가 클 수록 표현할 수 있는 정수 많은 (용량도 그만큼 커짐)

   정수 타입 : byte, short, int, long(금융권에서 자주 씀)
   실수 타입 : float, double
   논리 타입 : boolean (불리언 또는 불린이라 불림)  true ,false
   문자 타입 : char

   *크기도 알면 좋다 (바이트)*
   int,long,double,boolean 을 자주 씀
*/


// 문자열 타입 : String   ★기본 자료형 아님★

public class 자료형_1 {
    public static void main(String[] args) {

        byte n1 = 100;
//        byte n2 = 1000;  (범위초과 표현 불가능)

        int n3 = 5000;

        double n4 = 0.253;

//        주의사항 : 불린은 "" 없음
        boolean b1 = true;
        boolean b2 = false;

        //문자열!(0개 글자 이상 + "" 쌍따옴표로 감싸기)
        String name = "참조 자료형은 대문자로 시작해요";
        String s1 = "false 는 문자, 불린 아님";
//        String s2 = false;  자료형(데이터타입)이 다르므로 표현 불가능

        System.out.println(name);
        System.out.println(s1);

        //문자(한 글자 + 홀따옴표로 감싸야 함)
            char c1 ='A';
            char c3 = 65;
//        char c2 = "java";
        System.out.println(c1);

        System.out.println("c1 = "+ c1);
        System.out.println("c3 = "+ c3);

        char c4 = 'A';
        int c5 = c4;

        System.out.println("----------------------------");

        System.out.println("c4 = " + c4);
        System.out.println(c5);

    }
}
