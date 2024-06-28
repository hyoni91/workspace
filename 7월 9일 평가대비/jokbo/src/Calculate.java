
//정수 두개의 데이터
public class Calculate {
    int num1;
    int num2;


    // void setNumber(int num1, int num2) : 클래스가 가진 두 정수 데이터를 매개변수로 전달된 값으로 변경하는 기능
    public void setNumber(int num1, int num2){
        this.num1 =num1;
        this.num2 =num2;
    }

    //int getSum() : 두 정수의 합 리턴
    public int getSum(){
        int sum = this.num1 + this.num2;
        return sum;
    }

    //int getMax() : 두 정수 중 큰 값 리턴
    public int getMax(){
        int max = num1 > num2 ? num1:num2;

        return max;

    }
    //double getAvg() : 두 정수의 평균값을 리턴
    public double getAvg(){
        double avg = num1 + num2 / 2.0;
        return avg;
    }

    //실행순서
    //calculate 객체생성
    //setNumber 호출
    //합, 큰 값, 평균 리턴
}
