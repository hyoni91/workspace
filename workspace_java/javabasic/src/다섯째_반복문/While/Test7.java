package 다섯째_반복문.While;

//1 ~ 100까지의 숫자 중 5의 배수인 수를 모두 출력하고, 5의 배수인 수의 개수도 출력하되, while 문을 사용하여라.

public class Test7 {
    public static void main(String[] args) {

        int i= 1;

        while (i <= 100) {
            if (i % 5 ==0){
                System.out.println(i);
            }
            i++;
        }

        //갯수 출력????


    }
}
