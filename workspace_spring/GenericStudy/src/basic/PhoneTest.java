package basic;

public class PhoneTest {
    public static void main(String[] args) {
        //PhoneBox 객체 생성 주의점!
        //PhoneBox의 타입 인자는 Phone, MobilePhone, SmartPhone만 들어올 수 있다.
        //PhoneBox<String> phone = new PhoneBox<>(); -> 타입 인자가 다르므로 오류발생!

        //PhoneBox 객체 생성
        PhoneBox<Phone> phone1 = new PhoneBox<>();
        PhoneBox<MobliePhone> phone2 = new PhoneBox<>();
        PhoneBox<SmartPhone> phone3 = new PhoneBox<>();

        phone1.phoneTest(new Phone());
    }
}
