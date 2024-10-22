import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//정의되어있는 함수형 인터페이스 연습용 클래스
//연습용이므로 static붙임
public class DefinedFunctional {

    //Function<T,R> -> R apply(T t) 연습메소드
    public static List<Integer> getIntListFromString(Function<String,Integer> f, List<String> strList ){
        List<Integer> result = new ArrayList<>();

        for(String e : strList){
            result.add(f.apply(e));
        }

        return result;

    }




    //Consumer<T> -> void accept(T t) 연습


    //Supplier<T> -> T get() 연습용 메소드
    //두번째 매개변수로 전달된 n개의 정수를 갖는 리스트를 생성 및 리턴
    public static List<Integer> makeIntList(Supplier<Integer> s, int n){
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n ; i++){
            list.add(s.get());
        }
        return list;
    }


    //Predicate<T> -> boolean test(T t) 연습용 메소드
    public static void printOfList(List<Integer> list, Predicate<Integer> p){
        for(int e: list){
            if(p.test(e)){
                System.out.print(e + " ");
            }
        }
    }




    //Predicate<T> 미사용 메소드
    //1.매개변수로 정수형 리스트가 들어오면 리스트의 요소 중 짝수만 출력
    public static void printEvenOfList(List<Integer> list1 ){
        for(int e : list1){
            if(e % 2 == 0 ){
                System.out.print( e + " ");
            }
        }
    }

    //2.매개변수로 정수형 리스트가 들어오면 리스트의 요소 중 홀수만 출력
    public static void printOddOfList(List<Integer> list1 ){
        for(int e : list1){
            if(e % 2 != 0 ){
                System.out.print( e + " ");
            }
        }
    }









}
