package Inheritance_상속;



public class SuperCls {

    public SuperCls(int a){
    }

    public SuperCls(String a, int b){

    }
}

class SubCls extends SuperCls{


    //슈퍼클래스 생성자가 디폴트일 경우, 서브클래스도 디폴트값
    //super(); 슈퍼클래스의 생성자호출
    public SubCls(){
        super("aaa",0);
        System.out.println(123);
    }
}
