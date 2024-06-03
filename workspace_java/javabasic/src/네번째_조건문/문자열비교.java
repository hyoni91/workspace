package 네번째_조건문;

public class 문자열비교 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println(x == 10);

        String s1 = "java";
        String s2 = "python";

//        문자열 비교할 때는 주의할 것!!!!!
        System.out.println( s1 == s2);  //문자열 비교가 아님!!!!!!
        System.out.println( "1" == "1"); //문자열 비교 아님!!!!!!

        System.out.println("-------------------------------------");

        String name = "kim";
        boolean result = name.equals("kim");  //문자열비교 (네임 변수 값이 "kim"과 같은가?)

        System.out.println(result);

        System.out.println( name.equals("lee"));

        System.out.println("-------------------------------------");

        String address = "울산" ;

        if (address.equals("서울")) {
            System.out.println("해당됩니다.");
        }else {
            System.out.println("해당되지 않습니다.");
        }


    }
}
