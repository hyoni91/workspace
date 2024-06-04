package 다섯째_반복문.While;

//1 ~ 100까지 숫자 중 3의 배수인 수의 개수를 while문을 사용하여 구하여라.

public class Test6 {
    public static void main(String[] args) {

        int i = 1;      //1~100까지 반복할 변수
        int cnt = 0;   // 3의 배수의 개수를 저장할 변수


        //  i <=100
        while (i <101){
            if(i % 3 ==0){
                cnt++;   //3의 배수이면 1씩 증가
            }
            i++;
        }

        System.out.println(cnt);
    }
}
