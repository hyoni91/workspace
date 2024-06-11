package class_basic.member;
//다음 문제를 풀면서 Member 클래스를 완성하여라.
//1. Member 클래스는 필드로 이름, 아이디, 비밀번호를 갖는다. 모든 필드를 선언하고, 각 필드에 대한
// setter (변경)와  getter(리턴)를 만들어라.
//2. 모든 필드의 값을 출력하는 displayInfo() 메소드를 만들어라.
//3. 실행 클래스를 만들어 이름을 ‘자바’, 아이디는  ‘java’, 비밀번호는  ‘123’으로 변경하고 출력메소드를 사용하여 결과를 확인하여라.


public class Member_2 {

    private String name;
    private String id;
    private String pw;

    public Member_2(){
        this.name = "";
        this.id="";
        this.pw="";
    }

    public void setName(String name){
        this.name=name;
    }
    public void setId(String id){
        this.id=id;
    }
    public void setPw(String pw){
        this.pw=pw;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

    public String getPw(){
        return pw;
    }

    public void displayInfo(){
        System.out.println("이름: "+ name);
        System.out.println("ID: "+ id);
        System.out.println("PASSWORD: "+ pw);
    }
}
