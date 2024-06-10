package class_basic.car;


//7,8번에서 만든 메소드가 잘 동작되는지 확인하세요.
public class CarTest {
    public static void main(String[] args) {

        Car carTest = new Car();

        //클래스 하나하나 출력
        System.out.println(carTest.price);  //객체명.변수명 (현재는 기본값)
        System.out.println(carTest.brand);


        //값 변경
        carTest.brand = "hyundae";  // 객체명.변수명 = ""  < 오른쪽을 왼쪽값에 저장
        carTest.price = 200000000;

        System.out.println(carTest.brand);
        System.out.println(carTest.price);



        System.out.println("---------------------------------");

        //메서드를 이용한 출력!
        Car carTest2 = new Car();

        carTest2.carInto(); // 객체명.메서드명으로 호출 처음에는 기본값

        System.out.println("---------------------------------");

        //메서드를 이용한 값 변경
        carTest2.setOwner("김석진");
        carTest2.setCarNumber("7777");
        carTest2.setPrice(30000000);
        carTest2.setModelName("kona");
        carTest2.setBrand("hyundae");
        carTest2.carInto();

    }
}
