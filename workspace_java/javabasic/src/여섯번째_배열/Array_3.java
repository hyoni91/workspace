package 여섯번째_배열;


//프로그래밍은 '0'부터 시작
//반복문과 함께 쓰는것이 많아용

import java.io.FileOutputStream;

public class Array_3 {
    public static void main(String[] args) {

        //정수 5개 저장할 수 있는 배열 arr1 생성
        int[] arr = new int[5];  // [0 0 0 0 0]   [0번째요소 첫번째 요소 .....네섯번째 요소]

        //arr[0], arr[1]....arr[4]

        System.out.println(arr); // 이상한 값 나옴!

        //배열에 저장된 값을 출력할 때는 배열의 요소로 접근
        System.out.println(arr[0]);
//        System.out.println(arr[5]); 오류! 5번째 요소 없음


        //arr1의 0~4번째 요소까지의 모든 값을 출력 (for사용)
        for (int i = 0; i < 5; i++){
            System.out.println(arr[i]);
        }

        System.out.println("-----------------------------");

        //배열의 크기(공간)

        int[] arr2 = new int[3];
        int[] arr3 = new int[6];
        int[] arr4 = new int[10];

        //배열명.length -> 배열의 크기를 알 수 있다.
        System.out.println(arr2.length);
        System.out.println(arr4.length);

        System.out.println("---------------------------------");

        //.length 활용
        for(int i=0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }



    }
}
