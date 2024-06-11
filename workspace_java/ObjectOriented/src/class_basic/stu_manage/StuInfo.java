package class_basic.stu_manage;

//학생 클래스는 이름, 나이, 학점(A,B,C..), 연락처 정보를 가지고 있다.

public class StuInfo {
    private String name;
    private int age;
    private String grade;
    private String tel;



    //매개변수로 받은 정보로 생성자 생성
    public StuInfo(String name, int age, String grade, String tel) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.tel = tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    //학생의 모든 정보를 출력하는 기능
    public void showInfo(){
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("학점: " + grade);
        System.out.println("연락처: " + tel);
    }
}
