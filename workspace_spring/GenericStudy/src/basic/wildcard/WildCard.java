package basic.wildcard;

import basic.Box;
import basic.Phone;

public class WildCard {
    public static  <T> Box<T> makeBox (T data){
        Box<T> box = new Box<T>();
        box.setData(data);

        return box;
    }

    public static <T> void peekBox(Box<T> box){
        System.out.println(box.getData());
    }


    //제네릭 메소드일까? --> 정답 : NO!
    //와일드 카드 문법
    // ? : 어떤 자료형도 받을 수 있음
    public static void wildCardBox(Box<?> box){
        System.out.println(box.getData());
    }

    //상한제한 사용이유
    //아웃박스 에서는 매개변수로 전달된 장난감이 들어있는 박스에
    //장난감을 꺼내는 기능
    public static void outBox(Box<? extends Toy> box){
        Toy toy = box.getData();

        //이 코드는 문법적 오류는 없지만, 구현하고자 하는 기능에 부적합함
        //상한제한을 두면 오류가 남
        //box.setData(new Toy());
    }


    //하한제한 사용이유
    //매개변수로 박스와 박스에 담을 객체 전달
    //전달받은 박스에 전달받은 객체를 저장
    public static void inBox(Box<? super Toy> box, Toy toy){
        box.setData(toy);

        //이 코드는 문법적 오류는 없지만, 구현하고자하는 기능에 부적합
        //하한제한을 두면 오류가 남
        //Toy t = box.getData();

    }



    //상한, 하한제한 사용의 적절한 예시
    //매개변수로 to상자와 from상자가 전달된다
    //from상자의 기능을 to상자에 옮기는 기능
    public static void moveBox(Box<? super Toy> toBox, Box<? extends Toy> fromBox){
        //fromBox -> toBox
        toBox.setData(fromBox.getData());

        //from 박스는 기능을 전달만한다(수정되면 안됨)
        //to 박스는 from 박스의 기능만 받아온다.(from박스 기능을 읽기만 하면됨)


    }


    //와일드카드의 최초 목적 : 여러 자료형을 전달받기 위해서
    //코드의 안정성 향상을 위해 상한, 하한 제한 도입 : 최초 목적을 상실..(Toy만 가능해짐)
    //이 문제를 해결하기 위해 제네릭과 와일드 카드를 동시에 사용
    public <T> void finalOutBox(Box<? extends T> box){

    }




}
