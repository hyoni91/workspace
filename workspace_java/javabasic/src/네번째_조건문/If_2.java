package 네번째_조건문;

/*

if(){}else{}

  if( 조건 ){
        참일 때 값
    }
    eles {
        그렇지 않으면 값
    }

-> 둘 중 하나의 값만 출력

*/



public class If_2 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");

        int x = 7;

//        x의 값이 7이면 '1'을 출력 , 그렇지 않으면 '2'를 출력

        if(x==7){
            System.out.println(1);
        }
        else {
            System.out.println(2);
        }

        System.out.println("프로그램 종료");
    }
}
