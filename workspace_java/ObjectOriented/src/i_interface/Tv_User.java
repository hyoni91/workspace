package i_interface;

public class Tv_User {
    public static void main(String[] args) {

        //인터페이스는 객체 생성 불가능/ But, 인터페이스를 구현한 클래스의 생성자로 인터페이스 객체 생성 가능)
        //Tv 인터페이스 명 = 생성자는 필요에따라 LgTv , SamsungTv
        Tv tv = new LgTv();
        tv.turnOn();  //메서드명이 같으니 쓸 수 있음
        tv.turnOff();
        tv.volumeUp();
        tv.volumeDown();
        // 삼성에서 엘지로 바꾸려면? 모든 기능을 바꿔야함
        //인터페이스로 만든 경우, 메서드명 그대로 같은 기능구현 가능


        //인터페이스를 쓰면..?  인터페이스명 객체명 = new 클래스명 을 추천합니당
        SamsungTv tv1 = new SamsungTv();
        LgTv tv2 = new LgTv();
        Tv tv3 = new SamsungTv();
        Tv tv4 = new LgTv();
    }
}
