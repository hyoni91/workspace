import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

/*
중간연산 : filter() , map(), mapToInt()
최종연산 : sum(), forEach(), collect(), toList()
그밖에 최종 연산 : count(), [average(), min(), max()] → 리턴타입 주의하기, reduce()
 */
public class Stream_5 {
    public static void main(String[] args) {

        //최종연산 리턴타입 주의

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        int result = list.stream()
                .mapToInt(e -> e)
                .sum();

        System.out.println("sum()결과 : " + result);


        long result1 = list.stream()
                .mapToInt(e -> e)
                .count();

        System.out.println("count()결과 : " + result1);


        //옵셔널 : null 처리하는 상자
        //[average(), min(), max()]은 옵셔널상자에 담겨서 리턴됨
        //리스트에 자료가 없을 수도 있어서,,?
        //옵셔널에서 자료를 빼기 위해서는 get을 써야한다!
        OptionalDouble result2 = list.stream()
                .mapToInt(e -> e)
                .average();

        System.out.println("average()결과 : " + result2.getAsDouble());



        OptionalInt result3 = list.stream()
                .mapToInt(e -> e)
                .min();

        System.out.println("min()결과 : "+ result3.getAsInt());



        //사실 get을 바로 쓰면 좋지않음.. null체크해야해
        OptionalInt result4 = list.stream()
                .mapToInt(e -> e)
                .max();

        //권장!!!!
        result4.ifPresent((n -> System.out.println("max()결과 : " + n)));

    }
}
