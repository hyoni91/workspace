package class_basic.member_two;

public class MemberServiceTest {
    public static void main(String[] args) {
        MemberService member = new MemberService();

        boolean result = member.login("hong","12345");

        if (result){
            System.out.println("로그인 되셨습니다.");
            member.logout("hong");
        } else {
            System.out.println("id 또는 pw가 올바르지 않습니다.");
        }


    }
}
