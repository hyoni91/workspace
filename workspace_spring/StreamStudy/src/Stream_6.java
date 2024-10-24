import java.util.Arrays;
import java.util.List;

public class Stream_6 {
    public static void main(String[] args) {

        List<String> fruitList = Arrays.asList("Apple","Orange","Kiwi");


        //reduce() : 매개변수로 BinaryOperator<T> -> 매개변수로 두개가 옴!!!!
         String data = fruitList.stream()
                 //첫번째 매개변수 : 리스트의 0번째 요소 추가
                 //결과에 영향받지 않도록 주의하기!
                .reduce( "" , (a,b)-> a.length() > b.length() ? a : b);

        System.out.println(data);  //출력결과 : Orange

    }
}
