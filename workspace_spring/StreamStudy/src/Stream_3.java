import java.util.Arrays;
import java.util.List;

public class Stream_3 {
    public static void main(String[] args) {
        //중간 연산 map() : map은 리턴 있음!
        //map()매개변수 : function<T,R> T를 R로 리턴
        //다른형태로 바꿔주는 기능이있다.


        //Arrays.asList(T... a) : 배열을 리스트로 전환
        //... : 매개변수 a가 몇개 들어올 지 모름
        List<String> strList = Arrays.asList("blue","red","black");

        //제네릭 타입은 기본자료형을 받지 못함 , str.length는 integer로 리턴 받음
        strList.stream()
                .map(str -> str.length())
                .forEach(s -> System.out.println(s));


        //mapToInt로 리턴값을 int로 바꿔준다!
        int sumResult = strList.stream()
                .mapToInt(str -> str.length())
                .sum();

        System.out.println(sumResult);
    }










    //가정으로 매개변수로 문자열이 1개, 2개, 3개... 몇개 들어올 지 모름
    //String[] 이외의 방법
    // 자료형...   : 배열과 똑같이 취급함
    //static : 연습용으로 바로 쓰려고 붙인거임! 의미두지않기
    public static void printAll(String ...str){
        for(String e : str ){
            System.out.println("for : " + e);
        }

        Arrays.stream(str).forEach(s -> System.out.println("스트림 foreach : " + s));
    }
}
