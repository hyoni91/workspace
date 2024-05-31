package 세번째_연산자;



public class 연산자_2 {

    public static void main(String[] args) {

//        부정 연산자 : 참 또는 거짓의 결과를 반대로 만듦  -->  [ ! ]
        boolean b1 = true;

        System.out.println(b1);
        System.out.println(!b1);  // b1 의 값은 달라지지 않았음

        b1 = !b1 ;  //  해석 --> b1 = false

        System.out.println(b1); // b1 값이 바뀜


//        대입 연산자 :

        int num = 5;
//        num 변수의 값을 1 증가
        num = num + 1 ;  // 값 : 6
        num += 1; //값 : 7

        System.out.println(num);    // num값 두번 바뀜

        num -= 10;  // 값 -3    (7 - 10)
        System.out.println(num);

        num *= 3;  //값 -9 (-3 * 3)
        System.out.println(num);




    }
}
