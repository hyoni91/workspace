package 여섯번째_배열;




public class Array_4 {
    public static void main(String[] args) {

        int[] arr1 = new int[5]; // 각각 0으로 초기화

        //배열의 값을 저장할 때도 출력과 마찬가지로 각 요소에 데이터를 저장
        arr1[1] = 10;
        arr1[3] = 5;

        for (int i=0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }

    }
}
