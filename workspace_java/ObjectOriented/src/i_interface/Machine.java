package i_interface;

//인터페이스는 메서드의 이름만 선언 가능
//멤버변수와 생성자를 가지지 않는다.
//객체생성 안된다. (But, 인터페이스를 구현한 클래스의 생성자로 인터페이스 객체 생성 가능)
//인터페이스는 클래스애 얹혀 살아야한다.
//interface 는 class 가 아닌 interface 로 만들기! 인터페이스도 첫 글자 대문자 사용


//인터페이스 (약속)
//클래스에 인터페이스를 적용하는 문법(클래스 선언시 -> CoffeeMachine 클래스 보세용)
//인터페이스 안의 추상메서드는 퍼블릭을 생략하면 자동으로 퍼블릭이 붙음
public interface Machine {

    public void takeCoffee(); //추상메서드
    public void takeYulmu();
    public void takeCocoa();

    /* [Interface]
        사용목적 :하나의 약속(규제?)를 위해
              하나의 상품을 여러개발자가 개발할 경우, 명령문이나 기능등이 다를 수 있다. / 이를규제? 하는것
              예) 머신개발 : 개발자가 여럿일 경우 , 커피 제조 명령어가 pickCoffee , takeCoffee 등 가지각색
                           이를 규제하기 위해, 제조 명령어를 takeCoffee 를하자고 약속!
                           takeCoffee 아닌 pickCoffee 로 만들경우 오류! 반드시 takeCoffee 로 하도록 되어있음.

     */

}
