package class_basic;

//클래스의 구성 멤버(요소)  : 변수, 메서드의 정의, 생성자 (무조건 필요한건 아님)

/*  [변수 - 변수를 선언한 위치에 따라 변수의 종류가 달라진다.]
    지역변수(로컬) : method 안에서 선언된 변수 ★반드시 초기화 후 사용 가능
    매개변수(파라메이터): method 선언부의 소괄호 안에서 선언된 변수
    멤버변수(필드, 속성) : 클래스 안에서 선언된 변수
                        ★초기화 하지 않으면 기본 값으로 자동 초기화된다.
*/

//Monitor class : 실생활에 존재하는 모니터를 코드로 구현하기 위한 설계도 (클래스는 대문자)
public class Monitor {

    //변수 - 브랜드 , 가격 , 색상
    String brand;  //null(초기값)
    int price; // 0
    String color; //null

    //★메서드 호출안됨요

    public void monitor1(){
    }

}
