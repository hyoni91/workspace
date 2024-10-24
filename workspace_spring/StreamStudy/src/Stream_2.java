import java.util.ArrayList;
import java.util.List;

public class Stream_2 {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("석지니",100));
        list.add(new Student("호비",70));
        list.add(new Student("지미니",80));

        //중간연산 filter()
        //스트림을 사용해서 점수가 80점 이상인 학생만 출력
        //리스트는 리스트 객체명.stream()
        list.stream()
                .filter(s -> s.getScore()>=80)  //s는 스트림의 타입 Student를 s라고 칭하겠다는 뜻
                .forEach(s -> {
                    System.out.println(s);
                });

    }
}
