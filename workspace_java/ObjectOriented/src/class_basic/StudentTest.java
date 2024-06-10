package class_basic;

//클래스의 필드에 직접 접근하는 것보다는 메서드를 통해 값을 입력하는 것이 좋은 프로그래밍 관행.

import class_basic.car.Phone;
import class_basic.car.PhoneTset;

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

        //stu1 값 넣고 출력 *비추! 프로그램의 유지보수성과 재사용성을 높일 수 있다.
        stu1.name = "김석진";
        stu1.age = 30;
        stu1.score = 100;
        stu1.stuIntro();

        System.out.println("---------------------");
        //객체명.메서드명 호출로 값 변경
        stu1.setName("타타");
        stu1.stuIntro();  // name 변경

        System.out.println("---------------------");
        stu1.setAge(26); // age 변경
        stu1.stuIntro();



        Phone p = new Phone();
        p.modelName="public 접근자로 같은 프로젝트에서 사용가능!";

    }
}
