public class CarTest {
    public static void main(String[] args) {
        Calculate cal = new Calculate();

        cal.setNumber(3,5);

        System.out.println("두 수의 합 : " + cal.getSum());
        System.out.println("큰 값 : " + cal.getMax());
        System.out.println("두 수의 평균 값: "+cal.getAvg());

    }
}
