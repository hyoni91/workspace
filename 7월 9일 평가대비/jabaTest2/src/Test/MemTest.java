package test;

public class MemTest {
    public static void main(String[] args) {
        //객체생성 후 정보 등록
        Member member = new Member();
        member.setInfo("자바","java","abcd1234",20);

        //모든 정보 출력
        member.showInfo();

        //로그인 가능여부
        member.isLogin("java","abcd1234");
    }
}
