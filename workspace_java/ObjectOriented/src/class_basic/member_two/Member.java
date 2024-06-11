package class_basic.member_two;

public class Member {
   private String name;
   private String id;
   private String pw;
   private int age;

   public Member(){

   }

    public Member(String name, String id){
        this.name =name;
        this.id = id;
    }

    public void setId(String id){
        this.id = id;
    }
    public void setPw(String pw){
        this.pw = pw;
    }

}
