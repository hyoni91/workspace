package 다섯째_반복문.For;

// while 필수 조건 : 반복 초기점 (ex. int i = 1; , 반복 조건 (ex. i <10) , 반복 조거의 파기 장치 (ex. i++;)

/*
    for 문 : 코드가 길어질 수록 코드를 읽기 힘들어지기 때문에 for문으로

    [문법]
    for( 초기값 ; 조건; 파기할 조건) {

    }

*/

public class For_1 {
    public static void main(String[] args) {

        //while   1-10출력
//
//        int i = 1 ;
//
//        while (i <11){
//            System.out.println(i);
//            i++;
//        }


        //for 1-10출력   ()안에  변수,조건,파기할 조건 한번에 적기
        // ★★()안의 해석 순서 중요!!!!!★★
//        for (int i = 1; i < 11; i++ ){
//            System.out.println(i);
//        }


        //for 1-10까지 합

        int sum = 0;
        for(int i =1 ; i <11 ; i++){
            sum = sum + i ;
        }

        System.out.println(sum);
    }
}
