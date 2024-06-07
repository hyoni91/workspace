package 일곱번째_메서드;

//overLoading (확장): 같은 이름의 메서드 여러 개를 가지면서, 매개변수의 유형(자료형)과 개수가 다르도록 사용하는 것
//메서드명은 원래 중복 불가! 하지만 매개변수의 정보가 다르면 중복을 허용한다.
//https://wildeveloperetrain.tistory.com/m/110

public class 메서드_오버로딩 {
    public static void main(String[] args) {

        //메서드 오버로딩의 대표적인 예
        System.out.println();

        /*
        만약 오버로딩이 없다면 int형 인자를 받는 메서드는 printlnInt()로
        String형 인자를 받는 메서드는 printlnString()으로
        boolean형 인자를 받는 메서드는 printlnBoolean()처럼 각
        각의 메서드 이름을 따로 만들어줘야 합니다
        */

    }

    public static void println(){
    }

    public static void println(int a){

    }

    public static void println(int a, int b){

    }

    public static void println(String n){

    }

    public static void println(String n , int b){

    }


}
