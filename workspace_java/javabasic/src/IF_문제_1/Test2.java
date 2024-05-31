package IF_문제_1;

/*정수형 변수 하나를 선언하고 임의의 정수로 초기화하자. 그 후, 만약 변수의 값이 짝수이면 ‘짝수입니다.’, 홀수이면 ‘홀수입니다.’를 출력해보자.*/

public class Test2 {
    public static void main(String[] args) {

        int num = 50;

        if (num%2 == 0) {
            System.out.println("짝수입니다.");
        }else {
            System.out.println("홀수입니다.");
        }


    }
}
