package 다섯째_반복문.While;



public class While_3 {
    public static void main(String[] args) {

        //10부터 0까지 출력

//        int i = 10;
//
//        while (i  >= 0){
//            System.out.println(i);
//            i--;
//
//        }


        //1부터 20까지의 숫자 중에서 홀수만 출력

//        int i = 1;
//
//        while (i<=20){
//            System.out.println(i);
//            i = i+2; // 1+2=3 , 3+2=5 , 5+2=7 .....17+2=19
//        }
//
//


        //1부터 5까지의 숫자 중에서 짝수만 출력  (while문과 if문 함께 사용)

        int i = 1;

        while (i <= 5) {
            //짝수만 출력하기
            if (i % 2 == 0 ){
                System.out.println(i);
            }
            i++;
        }



    }
}
