package Inheritance_상속;

/*
강쥐, 냥이, 송아지 3종류의 동물관리
병원에는 총 10개의 케이지 존재
단 3종류의 동물 수는 항상 변한다.
*/

//각각의 클래스에 같은 부모의 데이터를 상속받으면서 연관성을 부여함
class Animal{
    public void bark(){
        System.out.println("crying");
    }
}

public class Dog extends Animal {

    public void bark(){  //오버라이딩으로 부모클래스의 메서드를 재정의!
        System.out.println("bow wow!");
    }

    //Animal_1 main용
    public void barkDog(){
        System.out.println("bow wow!");
    }
}

class Cat extends Animal{

    public void bark(){
        System.out.println("me---w");
    }

    //Animal_1 main용
    public void barkCat(){
        System.out.println("me---w");
    }

}

class Cow extends Animal{

    public void bark(){
        System.out.println("moo---");
    }

    //Animal_1 main용
    public void barkCow(){
        System.out.println("moo---");
    }

}
