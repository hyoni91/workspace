package collection.list;

 /*
    TestStudent 라는 클래스를 만들어,
    위에서 만든 Student클래스의 객체가 저장되는 리스트를 만들어 3명의 학생 정보를 추가한 다음,
    아래 문제를 풀어보세요.*/

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.setName("jjk");
        s1.setEngSco(50);
        s1.setKorSco(50);
        s1.setMathSco(50);
        s2.setName("jhs");
        s2.setEngSco(50);
        s2.setKorSco(100);
        s2.setMathSco(50);
        s3.setName("kth");
        s3.setEngSco(50);
        s3.setKorSco(50);
        s3.setMathSco(50);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        //1) 리스트에 저장된 모든 정보를 출력해보세요.
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        System.out.println("-----------------------------");

        //2) 총점이 150점 이상인 학생의 모든 정보를 출력하세요.
        int sum = 0;
        for (Student s : students) {
            sum = s.getEngSco() + s.getMathSco() + s.getKorSco();
            if (sum >= 150) {
                System.out.println(s);
            }
        }

        System.out.println("-----------------------------");

        //3) 모든 학생에 대한 평균 점수를 출력하세요.

        for (Student s : students) {
            sum = s.getEngSco() + s.getMathSco() + s.getKorSco();
        }
        double avg = (double) sum / students.size();
        System.out.println(avg);

        System.out.println("-----------------------------");

        //4) 총점이 1등인 학생의 모든 정보를 출력해보세요.

        int max = 0;
        for (Student s : students) {
            sum = s.getEngSco() + s.getMathSco() + s.getKorSco();
            if ( sum > max){
                max = sum;
            } else  {
                max = max;
            }
            }

        for (Student highStu : students){
            if (highStu.getMathSco()+highStu.getKorSco()+highStu.getEngSco() == max){
                System.out.println(highStu);
            }
        }



        }


    }



