import java.util.HashMap;
import java.util.Map;

public class Map_2 {
    public static void main(String[] args) {

        Student student1 = new Student(1,"진진진");
        Student student2 = new Student(2,"준준준");
        Student student3 = new Student(3,"민민민");

        Map<Integer,Student> stuMap = new HashMap<>();

        stuMap.put(student1.getStuNum(),student1);
        stuMap.put(student2.getStuNum(),student2);
        stuMap.put(student3.getStuNum(),student3);

        // key = 2 인 학생 이름 출력하기
        System.out.println(stuMap.get(2).getStuName());



    }
}
