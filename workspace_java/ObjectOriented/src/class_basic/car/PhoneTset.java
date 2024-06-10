package class_basic.car;

public class PhoneTset {
    public static void main(String[] args) {
        Phone pho = new Phone();


        //메서드를 활용하여 값을 재지정해주기.
//        pho.price = 111;  접근제한자를 줌으로써 직접적으로 값을 못 주도록 막아둠
        pho.setPrice(123456789);
        pho.setPrice(-222);
        pho.setPrice(123);


    }
}
