import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DefinedFunctionalTest {
    public static void main(String[] args) {

        System.out.println("----Function<T,R> 연습---- ");
        List<String> strList = new ArrayList<>();
        strList.add("안녕하세요");
        strList.add("반가워요");
        strList.add("또만나");

        List<Integer> result2 = DefinedFunctional.getIntListFromString(str->{return str.length();} , strList);
        System.out.println(result2);




        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("----Consumer<T> 연습---- ");

        //Consumer<T> -> void accept(T t) 연습
        list.forEach(num-> System.out.println(num) );



        System.out.println("----Supplier<T> 연습---- ");

        List<Integer> result = DefinedFunctional.makeIntList(
                ()-> {Random rand = new Random();
                    return rand.nextInt(50);
                },8);

        result.forEach(num -> System.out.println(num));




        System.out.println("----Predicate<T>사용----");

        DefinedFunctional.printOfList(list,(num) -> {return num % 2 == 0;});
        System.out.println();
        DefinedFunctional.printOfList(list,(num) -> {return num % 2 != 0;});
        System.out.println();
        DefinedFunctional.printOfList(list,(num) -> {return num > 3;});


        System.out.println();
        System.out.println("----Predicate<T> 미사용----");

        DefinedFunctional.printEvenOfList(list);
        System.out.println();
        DefinedFunctional.printOddOfList(list);
        System.out.println();




        //리스트에서 짝수만 삭제하는 기능
//        for(int i =0 ; i < list.size() ; i++){
//            if(list.get(i) % 2 == 0){
//                list.remove(i);
//            }
//        }

        //리스트에스 짝수만 삭제하는 기능을 함수형 인터페이스를 사용
        list.removeIf(num->num%2==0);

        System.out.println("----삭제 후 리스트---- ");
        list.forEach(num-> System.out.print(num + " "));  //람다식
        System.out.println(list.toString());




    }
}
