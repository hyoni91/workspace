package 다섯째_반복문.While;

//1 ~ 100까지의 숫자 중 5의 배수인 수를 모두 출력하고, 5의 배수인 수의 개수도 출력하되, while 문을 사용하여라.

public class Test7 {
    public static void main(String[] args) {

        int i= 1;
        int cnt= 0;

        //i <= 100
        while (i < 101) {
            if (i % 5 ==0){
                cnt++;   //c 안에 5의 배수가 추가 될때마다 1씩 증가 시키기
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        System.out.print("5의 배수의 개수 : " + cnt);





    }
}
