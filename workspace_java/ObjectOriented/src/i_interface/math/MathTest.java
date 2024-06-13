package i_interface.math;

public class MathTest {
    public static void main(String[] args) {
        MathUtil m = new MyMath();
        System.out.println(m.getMin(2,3));
        System.out.println(m.getCircleArea(2));
        System.out.println(m.getMultiple(2,3));
    }
}
