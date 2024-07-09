package test;

public class CalTest {
    public static void main(String[] args) {

        //calculate 객체생성
        Calculate cal = new Calculate();


        //setNumber 호출
        cal.setNumber(3,5);

        //합, 큰 값, 평균 리턴
        System.out.println("두 수의 합 : " + cal.getSum());
        System.out.println("큰 값 : " + cal.getMax());
        System.out.println("두 수의 평균 값: "+cal.getAvg());

    }
}
