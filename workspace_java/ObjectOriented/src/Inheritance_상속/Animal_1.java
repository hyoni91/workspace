package Inheritance_상속;


public class Animal_1 {
    public static void main(String[] args) {

        //멍멍,냐옹,음매 다섯마리 저장될 공간
        Dog[] dogHouse = new Dog[5];
        Cat[] catHouse = new Cat[5];
        Cow[] cowHouse = new Cow[5];

        //동물 객체 생성하고 요소에 저장
        Dog d1 = new Dog();
        dogHouse[0] = d1;
        Dog d2 = new Dog();
        dogHouse[1] = d2;
        Dog d3 = new Dog();
        dogHouse[2] = d3;

        Cat c1 = new Cat();
        catHouse[0] = c1;
        Cat c2 = new Cat();
        catHouse[1] = c2;

        Cow co1 = new Cow();
        cowHouse[0] = co1;

        //각각의 메서드를 불러와서 기능 출력
        for (int i =0; i < 3; i++){
            dogHouse[i].barkDog();
        }

        for (int i =0; i < 2; i++){
            catHouse[i].barkCat();
        }

        for (int i =0; i < 1; i++){
            cowHouse[i].barkCow();
        }

    }
}
