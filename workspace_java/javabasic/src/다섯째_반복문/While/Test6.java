package 다섯째_반복문.While;

//1 ~ 100까지 숫자 중 3의 배수인 수의 개수를 while문을 사용하여 구하여라.

public class Test6 {
    public static void main(String[] args) {

        int i = 1;

        while (i <=100){

            if(i % 3 ==0){
                System.out.println(i);
            }
            i++;
        }

    }
}
