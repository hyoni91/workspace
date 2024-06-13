package object_class;

//https://ittrue.tistory.com/127
/*
클래스가 상속을 받고 있지 않다면 자동으로 object 클래스로부터 확장된다. (extends Object)
결론, 우리가 쓰는 모든 클래스는 object 클래스를 상속 받는다. -단군할비~~
*/

import class_basic.Monitor;

public class Televisiton {
    String modelName;

    public void powerOn(){
        System.out.println("전원 on");
        aaa(5); //int 자료형

        Monitor mo = new Monitor(); //모니터 객체를 만들어서 넣어주기
        bbb(mo);

        ccc(1); //object 객체가 없어도 오류없음
        ccc("12"); //숫자 문자 클래스객체 모드 오류없음
        ccc(mo); //오브젝트는 모든 클래스의 부모이기때문에 가능
    }

    public void ccc(Object ob){
    }
    public void bbb(Monitor m){
    }
    public void aaa(int a){
    }
}

class LgTv extends Televisiton{  // object 도 물론 상속받음

}
