package basic;



public class Phone {
    public void call(){
        System.out.println("전화");
    }
}


class MobliePhone extends Phone{
    public void sendMsg(){
        System.out.println("메시지 전송");
    }

}

class SmartPhone extends MobliePhone{
    public void playApp(){
        System.out.println("앱 실행");
    }
}


