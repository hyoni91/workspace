package i_interface;

//무엇이든(자료형) 넣고 뺄 수 있는 만능상자
//Object 는 <모든 클래스 자료형>을 받을 수 있다.   -> 원칙상, int 등은 못들어옴

//기본자료형을 클래스형태로 만들어 놓은 클래스가 있다 : Wrapper class (박싱) 즉 , 오브젝트 클래스에 들어 올 수 있음

//https://iyk2h.tistory.com/283

public class Box {
    Object str;

    public void setBox(Object str){
        this.str = str;
    }

    public Object getBox(){
        return getBox();
    }
}
