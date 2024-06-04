package 다섯째_반복문.For;

//1부터 누적해서 합을 구하다 300이 최초로 넘었을 때 for문 을 멈추고 그때까지의 합과 마지막으로 더해진 값을 각각 출력하여라
//변수는 변수를 선언한 {} 안에서만 사용가능
//for문 밖에서 i를 실행시키기 위해서 i를 메인 {} 안에서 선언함 !

public class Test_2_3 {
    public static void main(String[] args) {

        int sum = 0;
        int i = 0;
        for ( i = 1; i< 100; i++){
            sum=sum+i;

            if(sum > 300 ){
                break;
            }
        }

        System.out.println(sum);
        System.out.println(i);

    }
}







