import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_4 {
    public static void main(String[] args) {

        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student("타타행성의 주인",20));
        stuList.add(new Student("알제이",30));
        stuList.add(new Student("치미침침",40));
        stuList.add(new Student("쿡",50));
        stuList.add(new Student("코야야야",60));


        //최종 연산을 여러개 하고싶을때
        //중간 연산의 결과를 리스트로 저장해주는 최종 연산자를 쓰면 된다.
        //toList();
        List<Student> students = stuList.stream()
                .filter(stu -> stu.getScore() > 30)
                .toList();

       students.forEach(stu -> System.out.println("students = " + stu));

        List<Student> students2 = stuList.stream()
                .filter(stu -> stu.getScore() > 30)
                .collect(Collectors.toList());

        students2.forEach(stu -> System.out.println("students2 = "+ stu));


        //연습 1. 스트림을 사용해서 이름이 4글자 이상인 학생의 점수의 합을 출력
        int result = stuList.stream()
                .filter(stu -> stu.getName().length() >= 4)
                .mapToInt(stu -> stu.getScore())
                .sum();

        System.out.println(result);




    }
}
