package 변수와자료형;

public class 숫자연산 {
    public static void main(String[] args) {

        System.out.println(10+10);

//        정수끼리의 연산 결과는 무조건 정수로 나옴
        System.out.println(10 / 4); //2.5
//        실수끼리의 연산 결과는 무조건 실수로 나옴
        System.out.println(10.0 / 4.0); //2.5
        System.out.println(10.0 / 2.0); //5.0

//        정수와 실수끼리의 연산 결과는 무조건 실수
        System.out.println(10.0/2); //5.0
        System.out.println(10.0/4); //2.5

//         유의해야할 점
        System.out.println(10 / 3 * 1.5);  //결과값: 10/3 > 3.5가 아닌 3 * 1.5 -> 4.5
        System.out.println(10.0/3.0 * 1.5);
    }
}
