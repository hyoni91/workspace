import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_1 {
    public static void main(String[] args) {

//        Map ? 많은 자료형을 저장 할 수 있는 자료형이다. (리스트와 흡사함)

        //리스트와 비교
        List<String> list = new ArrayList<>();

        //Key : value 로 한쌍
        //Integer : key 자료형
        //String : value 자료형
        Map<Integer,String> map = new HashMap<>();

        //추가 put ( key , value)  : 위에서 선언된 키와 밸류의 자료형으로 넣어야함
        map.put(1, "김");
        map.put(2, "이");
        map.put(3, "박");

        //읽기 get (key값 으로)
        System.out.println(map.get(1));



    }
}
