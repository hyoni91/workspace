package class_basic;

public class StudentTest {
    public static void main(String[] args) {
        //Student객체 stu1생성
        Student stu1 = new Student();

        //stu1 이라는 학생의 이름 출력
        System.out.println(stu1.name);
        System.out.println("---------------------");

        //stu1 학생의 모든 정보 출력
        stu1.stuIntro(); //객체명.메서드명

        System.out.println("---------------------");

        //stu1 값 넣고 출력
        stu1.name = "김석진";
        stu1.age = 30;
        stu1.score = 100;
        stu1.stuIntro();

        System.out.println("---------------------");

        stu1.setName("타타");
        stu1.stuIntro();  // name 변경


    }
}
