package collection.list;

//        아이디와 비밀번호, 이름, 나이를 정보로 가지는 Member 클래스를 만들자.
//        해당 클래스에서 각 필드에 대한 setter와 getter를 만들고,
//        아이디, 비밀번호, 이름, 나이 정보를 출력할 수 있게
//        toString() 메소드를 오버라이딩하여 구현하여라.

public class Member {

    String id;
    String pw;
    String name;
    int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

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

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
