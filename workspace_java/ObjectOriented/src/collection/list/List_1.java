package collection.list;

import java.util.ArrayList;
import java.util.List;

public class List_1 {
    public static void main(String[] args) {


        //ArrayList 객체생성 추천방법!  (많은 데이터를 저장할 통)
        // 인터페이스 이름 (List<저장할 자료형> 객체명 = List 인터페이스를 구현한 클래스명
        List<String> list6 = new ArrayList<>();
        list6.add("리스트 추가");
        list6.add("두번째예용");
        list6.add("크기제한도 없어요");
        list6.add("리스트 추가");
        list6.add("위에서아래로 추가추가");

        // 요소 3번째 리스트 출력
        System.out.println(list6.get(3));
        //여러가지 출력기능
        System.out.println(list6.remove(3)); //3번째 요소 삭제
        System.out.println(list6);

        //또 다른 방법
        String result = list6.get(3);
        System.out.println(result);

        //리스트에 저장된 데이터 수
        System.out.println(list6.size());


        System.out.println("for 문으로 데이터 빼기 : ");
        for(int i = 0; i < list6.size(); i++){
            System.out.println(list6.get(i));
        }


        System.out.println("--------------------------------");
        //ArrayList 객체 생성 또다른 방법
        // ArrayList<자료형> 객체명 =  new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();

        //정수데이터를 다수 저장하기 위한 리스트 통
//        ArrayList<int> list2 = new ArrayList<>();  <오류> 기본자료형은 저장 불가하다.
        ArrayList<Integer> list3 = new ArrayList<>();
//        ArrayList<double> list4 =new ArrayList(); <오류> 기본자료형
        ArrayList<Double> list5 =new ArrayList<>();

        //list1에 데이터 넣기  .add();
        list1.add("jin");
        list1.add("jin");
        list1.add("namjoon");

        //모든 list 출력
        System.out.println(list1);






    }
}
