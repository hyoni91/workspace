
//이름, 아이디, 패스워드, 나이
public class Member {
    String name;
    String id;
    String pw;
    int age;

    //void getInfo(모든 필드 값을 매개변수로 받기)
    public void setInfo(String name, String id, String pw, int age){
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.age = age;
    }


    //void showInfo(모든 변수 값 출력)
    public void showInfo(){
        System.out.println("이름: "+ name);
        System.out.println("아이디: "+ id);
        System.out.println("비밀번호: "+ pw);
        System.out.println("나이 "+ age);

    }
    //boolean isLogin(id,pw): 로그인 가능 여부 결정하는 메서드 (로그인 가능하면 true리턴)
    public boolean isLogin(String id, String pw){

        if(this.id.equals(id) && this.pw.equals(pw)){
            System.out.println("로그인 가능");
            return  true;
        }else {
            System.out.println("로그인 불가");
        } return false;
    }

}
