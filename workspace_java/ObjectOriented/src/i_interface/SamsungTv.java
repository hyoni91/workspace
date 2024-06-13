package i_interface;

public class SamsungTv implements Tv {


    @Override
    public void turnOn() {
        System.out.println("samsung tv - turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("samsung tv - turn off");
    }

    @Override
    public void volumeDown() {
        System.out.println("samsung tv - volume down");
    }

    @Override
    public void volumeUp() {
        System.out.println("samsung tv - volume up");
    }
}
