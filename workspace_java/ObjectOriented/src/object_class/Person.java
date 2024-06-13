package object_class;

public class Person {
    String name;
    int age;

    //.equals 오버라이딩
    //generate 오버라이드 메서드로 자동완성 :메서드명 일치, 매개변수 정보 일치, 리턴타입도 일치 (boolean)
    @Override
    public boolean equals(Object obj) {
     // return super.equals(obj);  //기본값 (부모클래스의 equals 메서드를 실행할게요)

        //재정의 (Person 의 name 과 age 가 동일하면 같은 사람)
        if(name.equals( ((Person)obj).name ) && age==( (Person)obj).age ){
            return true;
        }
        else {
            return false;
        }
    }


    //generate - toString() 으로 자동완성
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
        //문자열로!!!
    }
}

