package basic;


//Generic 문법이 적용된 무엇이든 저장하고 리턴할 수 있는 박스
//Box<T> : T가 자료형이 아니라 자료형이 정해지지 않은 제네릭 문법임을 컴파일러에게 인지
//자료형이 정해지지 않았기 때문에 제네릭이 적용된 클래스에서는 메서드 구현이 아주 제한적이다.
//제네릭 클래스에서는 원하는 기능을 못 만든다.
//이러한 문제를 해결하기 위해 타입인자(T)를 제한하는 문법을 사용한다.
public class Box<T> {
    private T doraemon;

    //어떤 데이터든 저장할 수 있는 메서드
    public void setData(T doraemon) {
        this.doraemon = doraemon;
    }

    //어떤 데이터든 리턴할 수 있는 메서드
    public T getData() {
        return doraemon;
    }

}

class MemberVO{
    private String id;
    private String pw;


    public String setId(String id){
        return this.id = id;
    }


    public String setPw(String pw){
        return  this.pw = pw;
    }

}
