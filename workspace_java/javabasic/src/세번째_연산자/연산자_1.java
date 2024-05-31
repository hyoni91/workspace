package 세번째_연산자;

public class 연산자_1 {

    public static void main(String[] args) {

//        산술 연산자 -->  + , -,  *,  / ,  %
        System.out.println(10 / 4 );
//        나머지 구하기 --->   [ % ] mod 연산자 (모듈러)
        System.out.println(10 % 4);
        System.out.println(10 % 3);

//        음수 , 양수
        System.out.println(+10);
        System.out.println(-10);

//        비교 연산자 -->  == ,  !=  ,  >  , >=  ,  <  , <=
        System.out.println(5 >= 3);
        System.out.println(10 != 5);


//        논리 연산자(참 거짓) --> && (and),  ||(or 이거나,)
//          x가 5보다 크고 10이하다.  x >5  x <= 10
        int x = 7 ;
        boolean r1 = x > 5 && x <= 10;
        System.out.println(r1);


       /*
       *   1. a >= b
       *   2. a < b &&  a > c
       *   3. (a+3) != 10
       *   4. a > 10 || a == b        까먹지마~ (==)!!!!!!!
       *
       * */




    }
}
