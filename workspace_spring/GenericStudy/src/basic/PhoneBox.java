package basic;

public class PhoneBox<T extends Phone> {
    private T data;


    //Phone, MobilePhone, SmartPhone => call 메소드 기능 사용가능
    //MobilePhone => call, sendMsg 메소드 사용가능
    //SmartPhone => call, sendMag, playApp 메소드 사용가능
    //즉 extends Phone은 Phone기능만 사용가능
    public void phoneTest(T data){
        this.data = data;
        data.call();

    }


}
