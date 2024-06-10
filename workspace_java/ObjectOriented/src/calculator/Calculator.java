package calculator;

public class Calculator {


    private int num1;
    private int num2;
    private String st;

    public Calculator(){
        this.num1 = 0;
        this.num2 = 0;
        this.st = null;
    }
    //계산기 클래스는 더하기, 뺴기, 나눗셈, 곱셈 기능을 가지고 있습니다. 각각의 메소드를 통해 연산의 결과를 리턴하는 메소드를 기능별로 하나씩 만드세요.

    public void setNum1(int num1){
        this.num1 = num1;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }

    public void setSt(String st){
        this.st= st;
    }

    public int getSum ( int num1, int num2) {
        this.num1=num1;
        this.num2=num2;
        return num1+num2;

    }

    public int getSub (int num1, int num2){
        this.num1=num1;
        this.num2=num2;
        return num1-num2;
    }

    public int getMul  (int num1, int num2){
        this.num1=num1;
        this.num2=num2;
        return num1*num2;
    }

    public double getDiv  (int num1, int num2){
        this.num1=num1;
        this.num2=num2;
        return num1/ (double)num2;
    }

    public void setCalculator(int a, int b, String p){
        if(p.equals("+")){
            System.out.println( getSum(a,b));
        }else if(p.equals("-")){
            System.out.println( getSub(a,b));
        }else if(p.equals("*")){
            System.out.println(getMul(a,b));
        }else if(p.equals("/")){
            System.out.println(getDiv(a,b));
        }else {
            System.out.println("연산자를 잘못입력하셨습니다.");
        }
    }

}
