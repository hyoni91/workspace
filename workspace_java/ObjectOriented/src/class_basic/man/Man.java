package class_basic.man;

//1. Man 클래스는 이름, 나이, 주소를 멤버로 가지고 있다. 모든 멤버를 선언하세요.
//2. 멤버 모두의 값을 초기화 할 수 있는 생성자생성
//3. 멤버 각각의 값을 변경하는 메소드를 3개를 만드세요.
//4. 각 멤버의 값을 리턴하는 메소드를 3개 만드세요.
//5. 멤버의 모든 정보를 출력하는 메소드를 만드세요.
//6. Man 클래스로 객체를 만들어 위에서 만든 메소드가 잘 작동되는지 테스트하세요.


//setter : 멤버변수 각각의 값을 변경하는 메서드 & set변수명 반드시 지정!
//getter : 멤버변수 각각의 값을 return 받는 메서드 & get변수명 반드시 지정!

public class Man {

    private String name;
    private int age;
    private String addr;

    public Man(String name, int age, String addr){
        this.name=name;
        this.age=age;
        this.addr=addr;
    }


    //getter, setter 오른쪽 마우스 클릭, 제너레이터로 만들 수 있음
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void stuInt(){
        System.out.println("이름: "+ this.name);
        System.out.println("나이: "+ this.age);
        System.out.println("주소: "+ this.addr);

    }

}
