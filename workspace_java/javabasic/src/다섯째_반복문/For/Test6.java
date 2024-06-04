package 다섯째_반복문.For;

// 1 ~ 100까지 숫자 중 3의 배수인 수의 개수

public class Test6 {
    public static void main(String[] args) {

        int cnt = 0;
        for(int i = 1; i <101; i++){
            if(i % 3 ==0){
                cnt++;
            }
        }

        System.out.println("3의 배수의 개수 : " + cnt);

    }
}
