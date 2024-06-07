package 일곱번째_메서드;


import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Test_3 {
    public static void main(String[] args) {
//        test2(7);
//        test3(20);

//        System.out.println(test4());

//        System.out.println(test5(7));
//
//        int[] a = {10,20,11};
//        System.out.println(test6(a));

//        String[] n = {"aa","bb","cc"};
//        System.out.println(test7(n));

        int[] reNe = {1,2,3,4,5,6,7,8,9,10};
        int[] result = test9(reNe);
        System.out.println(Arrays.toString(result)); //모든 요소 출력!!!!!!!!!! 잊지마~~~~

    }

       //9.정수형 배열 하나를 매개변수로 받아 배열의 요소 중 홀수를 제거한 새로운 배열을 리턴하는 메소드를 만들어보세요.

    public static int[] test9(int[] number){

        //매개변수로 넘어온 배열 요소 중 짝수의 개수를 알아야한다.
        int cnt=0;
        for(int e : number){
            if(e%2==0)
                cnt++;
        }
        //짝수만 저장할 배열을 생성함
        int[] result = new int[cnt];

        //짝수면 result의 각 요소에 넣기
        int index = 0;
        for (int i =0; i< number.length; i++){   //넘버스 중에 짝수만 골라내기!
            if(number[i]%2==0){
                result[index++] = number[i];  //result에 [i]넣으면 안됨! 요소 0~ 짝수만큼
                 // index++;   -> 이렇게해도 1씩 증가
            }

        }
        return result;

    }

       //8.정수형 배열 두 개를 매개변수로 받아 두 배열의 모든 요소를 갖는 새로운 배열을 리턴하는 메소드를 만들고 호출해보세요.
//    public static int[] test8(int[] a, int[]b){
//
//    }


    //7.문자열 배열을 매개변수로 받아 배열에 저장된 모든 문자열을 나열하여 리턴하는 메소드를 만들고 호출해보세요.
    public static String test7(String[] s){
        String result="";

        for (int i=0; i < s.length; i++){
           result = result + s[i];

        }return result;

    }

    //6. 정수형 배열을 매개변수로 받아 배열의 모든 요소 중 최대값을 리턴하는 메소드를 만들고 호출해보세요.
    public static int test6(int[] arr){

        int max =0;
        for(int i =0; i < arr.length; i++){
          if(max <arr[i]){
              max = arr[i];
          }
        }return max ;
    }


    //정수 하나를 매개변수로 받아, 매개변수가 짝수면 true, 홀수면 false를 리턴하는 메소드를 만들고 활용해보자.
    public static boolean test5(int a){
        return  a%2==0 ? true:false;
//        return a%2 == 0 ;   //- > 연산결과 참인가 거짓인가
    }


    //4.Math.random() 메소드를 활용하여 1~ 50의 수 중 랜덤한 정수를 리턴하는 메소드를 만들고 호출해보자.
    public static int test4(){
        return  (int) (Math.random() * 50 +1);    // 매개변수 주어라고 하지 않았음!!! 랜덤을 리턴!!!!

    }


    //3.정수 하나를 매개변수로 받아, 1 ~ 100까지의 수 중에서 매개변수로 받은 수의 배수를 출력하는 메소드를 만들고 호출해보세요.
    public static void test3(int num){

    }

    //2.정수 하나를 매개변수로 받아 해당 정수의 구구단을 출력하는 메소드를 만들고 호출해보세요.

    public static void test2(int num){
        for (int i = 1; i < 10; i++){
            System.out.println(num + " * " + i + " = "+ (num*i));
        }
    }
}
