package Inheritance_상속;

//문제 7번 , 상속을 쓰는 이유

public class A_T7 {
    private int n;

    public int getN(){
        return n;
    }

    public void setN(int i){
        n=i;
    }
}

 class B extends A_T7 {
    private String s;
    public int m;
    private char c;

    public void setC(char ch){
        c =ch;
    }

    public char getC(){
        return c;
    }
}


class C extends B{
    private double d;



    public int getSum(){
        return getN()+m; //private 값을 들고오기 위해 getter 활용
    }

}