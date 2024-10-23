

//Optional :모든 자료형의 null여부를 체크하는 기능을 제공한다.

import java.util.Optional;

public class Optional_1 {
    public static void main(String[] args) {
        String str = null;

        //Optional 객체 생성
        //Optional.of() : ()안에 null 값을 체크하고 싶은 객체를 넣어준다.
        //특징 : null을 허용하지 않는 객체 -> null이 들어가면 오류가 발생한다.
        //Optional.ofNullable() : ()안에 null 값을 체크하고 싶은 객체를 넣어준다.
        //특징 : null을 허용하는 객체
        //Optional<String> op1 = Optional.of(str);
        Optional<String> op2 = Optional.ofNullable(str);


        //Optional 사용
        //객체 생성 후, 사용할 수 있는 메소드가 많다
        //함수형인터페이스가 대부분 , 즉! 람다식 사용하세요

        //isPresent(): 옵셔널 안에 데이터가 존재하는지 확인한다.
        if(op2.isPresent()){
            System.out.println(op2.get()); //옵셔널 안의 값 읽기
            //실행결과 : 아무것도 안뜸
        }




    }
}
