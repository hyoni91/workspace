import java.util.Arrays;

public class Stream_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        //정수가 저장된 배열에서 짝수의 합을 출력
        //기존방식
        int sum = 0;
        for(int e : arr){
            if(e % 2 == 0){
                sum+=e;
            }
        }
        System.out.println("기존방식 짝수의 합 : " + sum);

        //스트림사용
        int sum2 = Arrays.stream(arr) //stream안에 arr 넣어주기 (파이프안에 arr를 넣어주는 느낌)
                        .filter(n -> n%2==0) //intPredicate -> boolean x(T))
                        .sum();

        System.out.println("스트림 짝수의 합 : " + sum2);

        //연습
        int[] arr2 = {2,6,10,1,7,3};

        //스트림을 사용하여 arr2에서 짝수이면서 5보다 큰 데이터의 합을 출력
        int result = Arrays.stream(arr2)
                .filter(n -> n%2==0)
                .filter(n -> n>5)
                .sum();

        System.out.println(result);


    }
}
