package class_basic;

import class_basic.car.Phone;
import class_basic.car.PhoneTset;

public class AccountTest {
    public static void main(String[] args) {

        Account acc = new Account(); // 클래스명 객체명 = new 생성자 호출();
        acc.printAccount();   //생성자가 실행되는지 출력

        System.out.println("------------------");
        Account acc1 = new Account(123);  // 매개변수를 주고, 생성자2 불러옴
        acc1.printAccount();

//        acc.setAccount();


    }
}
