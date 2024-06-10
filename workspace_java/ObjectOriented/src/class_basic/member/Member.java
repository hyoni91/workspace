package class_basic.member;

//회원정보로는 이름, 아이디, 비밀번호, 나이를 관리할 것이다. 이 데이터를 가지는 클래스를 만들어 보세요.

public class Member {

    String name;
    String id;
    String passWord;
    int age;

    //회원 등록을 위한 메소드를 만들어보세요. (7번 문제와 동일하다고 생각하고 푸시면 돼요)

    public void setMember(String stuName, String stuId, String stuPass, int stuAge ){
        name = stuName;
        id = stuId;
        passWord = stuPass;
        age = stuAge;
    }

    //회원의 이름을 변경하기 위한 메소드를 만들어보세요.

    public void setName(String stuName){
        name = stuName;
    }

   //11. 등록한 회원의 정보를 확인(출력)하기 위한 메소드를 만들어 보세요.

    public void memberInt(){
        System.out.println("학생이름: " + name);
        System.out.println("ID: " + id);
        System.out.println("PASSWORD: " + passWord);
        System.out.println("학생나이: " + age);
    }
}
