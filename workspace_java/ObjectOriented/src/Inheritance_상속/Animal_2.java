package Inheritance_상속;

//Animal_1 클래스와 같은 기능을 상속을을 통해 구사
public class Animal_2 {

    public static void main(String[] args) {
        Animal[] animalHouse = new Animal[10];
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        Cow cow1 = new Cow();

        //자료형은 다르지만 부모는 자식을 품을 수 있다. (다형성 : but 자식 메서드는 못 씀  ex. (barkDog()등등)
        animalHouse[0] = dog1;
        animalHouse[1] = cat1;
        animalHouse[2] = cow1;

        //부모클래스의 메서드와 자식 메서드에 같은 이름으로 메서드 정의함 (오버라이딩)
        animalHouse[0].bark();  // 오버라이딩으로 bark()메서드가 재정의 됐음

        System.out.println("-------------------");

        // @override 로 메서드 사용
        for(int i = 0; i <3 ; i++){
            animalHouse[i].bark();
        }

    }

}
