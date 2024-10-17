package basic;

//클래스가 제네릭이 아닌! 클래스 안의 특정 메소드만 제네릭화 시키기
public class GenericMethod {

    //매개변수로 데이터가 전달 되고, 그 데이터는 자료형이 정해지지 않음
    //이러한 매개변수를 전달받아 box에 저장하고
    //데이터가 저장된 box를 리턴하는 메소드
    public <T> Box<T> makeBox (T data){
        Box<T> box = new Box<T>();
        box.setData(data);

        return box;
    }

}
