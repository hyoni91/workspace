package IF_문제_1;

/*
정수형 변수 하나를 선언하고 0 ~ 100까지의(0,100 포함) 숫자 중 임의의 값으로 초기화하자.
그 후 변수의 값이 90보다 크고 100보다 작거나 같으면 ‘학점은 A입니다.’를 출력하고,
80보다 크고 90보다 작거나 같으면 ‘학점은 B입니다.’를 출력하고,
80점 이하라면 ‘학점은 C입니다.’를 출력해보자.

 */

public class Test5 {

    public static void main(String[] args) {

        int sco = 80 ;

        String grade = " ";

//        if(sco >90 && sco <= 100){
//            System.out.println("학점은 A 입니다");
//        } else if (sco >80 && sco <=90) {
//            System.out.println("학점은 B 입니다.");    // " && sco <=90 "은 자동으로 걸러지기 때문에 따로 적지 않아도 된다.
//        }else {
//            System.out.println("학점은 C 입니다.");
//        }
//

        //선생님 풀이


        if(sco > 90 && sco <= 100){
            grade= "A";
        }else if(sco > 80){
            grade= "B";
        }else {
            grade= "C";
        }
        System.out.println("학점은 " + grade +" 입니다.");
    }
}
