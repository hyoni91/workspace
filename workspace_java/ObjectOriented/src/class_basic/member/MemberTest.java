package class_basic.member;

public class MemberTest {
    public static void main(String[] args) {

        Member stuMember = new Member();
        stuMember.name = "김태형";

        //이름 변경이 잘 됬는지 확인하기 위한 이름 출력 메소드를 만들어보세요.
        System.out.println(stuMember.name);

        System.out.println("------------------------------");
        // 9 ~ 13번으로 클래스를 잘 구성했는지 확인하기 위해 객체를 만들어 확인하세요.

        Member stuMember2 = new Member();

        stuMember2.setMember("김남준","RM","RRMM123",30);
        stuMember2.memberInt();

        //이름 변경이 잘 됬는지 확인하기 위한 이름 출력 메소드를 만들어보세요.
        stuMember2.setName("김태형");
        stuMember2.memberInt();


    }
}
