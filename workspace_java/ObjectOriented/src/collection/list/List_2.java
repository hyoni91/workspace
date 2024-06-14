package collection.list;

import java.util.ArrayList;
import java.util.List;

public class List_2 {
    public static void main(String[] args) {
        //정수를 다수 저장할 수 있는 리스트 생성
        List<Integer> li1 = new ArrayList<>();

        li1.add(123);
        li1.add(456);
        li1.add(789);
        int n = li1.get(1);
        System.out.println(n);


    }
}
