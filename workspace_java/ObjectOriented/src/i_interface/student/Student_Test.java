package i_interface.student;

import java.util.Arrays;

public class Student_Test {
    public static void main(String[] args) {

        //리턴타입에 주의할 것!!!!!!!!!!!!!

        MyStudent stu = new MyStudent();
        Student[] students = new Student[5];

        Student student1 = new Student("kkk",60,70,80);
        Student student2 = new Student("lll",100,60,80);
        Student student3 = new Student("jjj",30,70,50);
        Student student4 = new Student("ppp",75,65,100);
        Student student5 = new Student("ooo",90,20,80);

        students[0] =student1;
        students[1] =student2;
        students[2] =student3;
        students[3] =student4;
        students[4] =student5;

        System.out.println(stu.getGradeByStudentName(students,"lll"));

        int[] result = stu.getTotalScoresToArray(students);   // ->정수형 배열로 받아서 출력!!!!
        System.out.println(Arrays.toString(result));

        Student who = stu.getHighScoreStudent(student1,student2);

        System.out.println(who.getName());  // who 중 어떤 값을 받을래 ? 이름으로 확인!



//        Student st = new Student("kk",60,50,80);
//       StudentUtil st1 = new MyStudent();
//       System.out.println(st1.getGradeByStudentName(st)); 내가 푼것


    }
}
