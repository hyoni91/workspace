package 일곱번째_메서드;



public class Method_5 {
    public static void main(String[] args) {
//      getSum(2,8);  //출력코드를 안 적었기 때문에 이것만 적으면 실행값 안나옴. (실행은 됨)

        int sum = getSum(5,5);  //리턴값을 받았으면 어디에 저장할지 설정
        System.out.println(sum);
        System.out.println(getSum(5,2));

        System.out.println(getSum2(5,5));

    }

    //매개변수로 전달 된 두 정수의 합을 리턴
    public static int getSum(int n1 , int n2){
        return n1+n2;
    }

    //매개변수로 전달된 두 정수의 합을 실수 형태로 리턴하는 메서드
//    public static int getSum2(int a, int b){
//        return a+ (double)b; 리턴되는 자료형 타입과 일치 시켜야함.!!! (리턴타입을 바꿔야함)
//    }


    public static double getSum2(int a, int b){
        // return 키워드는 항상 메서드의 마지막에 딱 한번만 실행가능!
        return a + b;
//        return a ;  이것도 안됨!
//        System.out.println();    프린트도 안됨!

    }

}
