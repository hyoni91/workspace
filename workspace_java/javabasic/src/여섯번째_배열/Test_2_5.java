package 여섯번째_배열;

//초기값을 5,4,3,2,1로 갖는 배열 arr 을 만들자.
// 그리고 길이가 5인 새로운 정수형 배열 newArr 을 만든 후
// arr 이 가진 값을 newArr 로 복사하여 보자. 복사 결과는 출력을 통해 확인한다.

public class Test_2_5 {
    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};
        int[] newArr = new int[5];
        newArr = arr.clone();
//        newArr = arr;

            //for 문으로 복사하기
//        for (int i = 0; i <arr.length; i++){
//            newArr[i] = arr[i];
//        }

        for (int e : newArr){
            System.out.println(e);
        }

    }
}
