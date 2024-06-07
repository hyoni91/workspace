package 일곱번째_메서드;

//정수형 배열을 매개변수로 받아 배열의 모든 요소를 출력하는 메소드를 만들고 호출하세요.


public class Test_3_5 {
    public static void main(String[] args) {
        int[] a = {1,3,5};
        test5(a);

    }
    public static void test5(int[] arr){
        for(int i =0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

//        for(int e : arr){
//            System.out.println(e);
//        }

    }
}
