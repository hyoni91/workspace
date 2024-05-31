package IF_문제_2;

/*

4. 국어, 영어, 수학 점수를 Scanner를 사용하여 입력받는다.
(단, 국,영,수 점수는 0 ~ 100점 사이라고 가정하고, 소수점 점수는 없다.)
아래의 결과와 동일한 결과가 나오도록 프로그램을 작성하시오. (굵은 기울기체는 사용자가 입력하는 부분이다)
국어점수 : 80
영어점수 : 90
수학점수 : 75
총점 : 245
평균 : 81.666666666667
 */

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int korSco, engSco, matSco;
        int allSco;
        double avg;

        System.out.print("국어점수:");
        korSco = sc.nextInt();

        System.out.print("국어점수:");
        engSco = sc.nextInt();

        System.out.print("국어점수:");
        matSco = sc.nextInt();

        allSco = korSco+engSco+matSco;
        System.out.println("총점 :"+ allSco);

        avg = allSco / 3.0;
        System.out.println("평균 :" + avg);

    }
}
