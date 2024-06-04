package 여섯번째_배열;

/*
배열을 생성하는 방법으로 틀린 것은? 2
 1) int[] array = {1, 2, 3};
 2) int[] array; array = {1, 2, 3};
 3) int[] array = new int[3];
 4) int[][] array = new int[3][2];


 다음 소스에서 잘못된 부분은?
int[10] arr;   int [] arr ;
arr = new int[10];
arr[0] = 3;   arr = new int [3]
arr[1] = arr[0] + 1;


다음 소스에서 잘못된 부분은?
int[] arr = {1, 2, 3, 4, 5};
arr[arr.length] = 0;   -> arr.length = [5]


 */

public class Test2 {

    public static void main(String[] args) {

        //정수를 5개 저장할 수 있는 배열을 생성하고 배열의 2번째, 4번째 요소의 값을 출력해보아라.

        int[] num = new int[5];

        System.out.println(num[1]);
        System.out.println(num[3]);


    }
}
