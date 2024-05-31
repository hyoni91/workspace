package 네번째_조건문;

// if 문과  else if 문의 차이점 !!!!!!!!!!!!!!!!!!!!

public class If_4 {
    public static void main(String[] args) {

        int x1 = 5;

//        첫번째 예시  (각각의 if 문은 조건이 참일 경우 모든 값을 출력 함)

//        if(x1 > 3){
//            System.out.println(1);
//        }
//
//        if(x1 == 5){
//            System.out.println(2);
//        }
//
//        if(x1 < 10){
//            System.out.println(3);
//        }

//        두번째 예시   ★★(else if 를 쓰면 if 문이 참일 경우 다음 else if는 실행하지 않음 )★★

        if(x1 > 3){
            System.out.println(1);
        }

        else if(x1 == 5){
            System.out.println(2);
        }

        else if(x1 < 10){
            System.out.println(3);
        }

    }
}
