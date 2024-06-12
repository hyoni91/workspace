package Inheritance_상속;

//자바에서 다중상속은 가능한가? (부모클래스를 여러개 가질 수 있는가?)
//다중상속은 문법적으로는 불가능, 논리적으로 가능

public class Grand {
    int a;
}

class Parent1 extends Grand{
    int b;
}


// parent1 , grand 기능까지 상속받게 됨
class child1 extends Parent1 {
    int c;

    public void child1_test (){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

