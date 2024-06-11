package class_basic.calculator;
//클래스 기초 생성자 문제 4번 계산기 만들기
public class Mul {
    private int a;
    private int b;

    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int calculator(){
        return a * b;
    }
}
