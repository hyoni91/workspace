package basic;


//좋은 코딩은 오류가 많이 나는 코드다.(컴파일 오류)
//컴파일 예외 : 코드를 실행하기 전 발생하는 오류, 빨간색 표시 o , 발견이 쉬움
//런 타음 예외 : 코드를 실행하면 발생하는 오류, 빨간색 표시 x , 발견이 쉬지 않음


/*
제네릭을 사용하지 않았을 때 단점

1. 데이터를 리턴 받을 대 매번 형변환 작업이 필요하다.
2. 개발자의 실수로 발생하는 런타임 오류를 작성할 확률이 높다.
    --> 오류 잡기가 힘들다.
*/
public class BeforeBoxTest {
    public static void main(String[] args) {

        //BeforeBox 객체생성
        BeforeBox box1 = new BeforeBox();
        BeforeBox box2 = new BeforeBox();
        BeforeBox box3 = new BeforeBox();
        BeforeBox box4 = new BeforeBox();


        box1.setData("애플");
        box2.setData(1210);
        box3.setData(new Apple());
        box4.setData(new Orange());

        //저장된 데이터를 받아오기
        //형 변환
        String data1 = (String) box1.getData();
        String data11 = box1.getData().toString();
        int data2 = (int)box2.getData();
        Apple data3 = (Apple) box3.getData();
        Orange data4 = (Orange) box4.getData();

        System.out.println("==결과===");
        System.out.println(data1);
        System.out.println(data11);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println(data4);

    }
}
