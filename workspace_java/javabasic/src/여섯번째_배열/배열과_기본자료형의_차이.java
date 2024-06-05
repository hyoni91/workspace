package 여섯번째_배열;


//https://curryyou.tistory.com/276

public class 배열과_기본자료형의_차이 {
    public static void main(String[] args) {

        //기본자료형
        int a =10;
        int b = a;  //값 복사
        a=20;


        System.out.println("a ="+ a); //20
        System.out.println("b ="+ b); //10

        int c = 10;
        c=20;
        int d = c;

        System.out.println("c ="+ c); //20
        System.out.println("d ="+ d); //20


        System.out.println("----------------------------");

        //자료형이 같으면 배열도 같은 자료형의 데이터 저장 가능 (변경하면 동일하게 적용됨)
        int[] arr = {1,3,5};
        int[] arr1 = arr;   //주소를 복사?

        for (int e : arr){
            System.out.println("arr ="+ e);
        }

        for (int e : arr1){
            System.out.println("arr1 = "+ e);
        }

        System.out.println("----------------------");

        arr[0] = 10;  // ★★ 주의 !!★★
        arr1[1] = 22; // ★★ 주의 !!★★

        for (int e : arr){
            System.out.println("arr ="+ e);
        }

        for (int e : arr1){
            System.out.println("arr1 = "+ e);
        }


        //배열의 복사
        int[] arr4 = {1,2,3};
        int[] arr5 = arr4.clone();
        arr4[1] = 5;

        for (int e : arr4){
            System.out.println("arr ="+ e);
        }

        for (int e : arr5){
            System.out.println("arr1 = "+ e);
        }

    }
}
