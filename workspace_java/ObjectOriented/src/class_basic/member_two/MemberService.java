package class_basic.member_two;

public class MemberService {

        String id;
        String pw;

    public boolean login(String id, String pw){
        this.id =id;
        this.pw = pw;

        if (id.equals("hong") && pw.equals("12345")){
             return true;
        }else {
            return false;
        }
    }

    public void logout(String id){
        this.id=id;

        if(id.equals("hong")){
            System.out.println("로그아웃 되셨습니다.");
        }

    }

}
