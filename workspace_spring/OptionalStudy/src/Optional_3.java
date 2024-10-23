import java.util.Optional;

public class Optional_3 {
    public static void main(String[] args) {

        Optional<String> op = Optional.of("RUN~~~~~~~HANI");

        //map() : 실행결과를 다시 Optional 변수에 담아서 리턴한다.
        //매개변수 : Function<T,R> -> 매개변수 T를 R로 리턴
        Optional<String> result = op.map(str->{return str.toLowerCase();});
        System.out.println(result.get());  //실행결과 : run~~~~~~~hani

        //위에랑 같음
       String result2 = op.map(str->str.toLowerCase() ).get();

       System.out.println("-------------------------------------------------------");

        Optional<String> op1 = Optional.of("Run Hani");

        //RUNHANI 로 출력하고 싶다면?

        String r4 = op1.map(str->str.toUpperCase())  // 대문자로 변환
                 .map(str->str.replace(" ",""))  //공백을 없애줌
                 .get(); //읽기

        System.out.println(r4);
        //실행결과 : RUNHANI

    }
}
