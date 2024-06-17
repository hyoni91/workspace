package collection.list_2;

import java.util.ArrayList;
import java.util.List;

public class School_Test {
    public static void main(String[] args) {

        //하늘반에 소속 될 학생 3명 생성
        Student s1 = new Student("Kim",20,80);
        Student s2 = new Student("lee",19,100);
        Student s3 = new Student("min",20,75);

        //하늘반에 저장할 학생 리스트
        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(s1);
        studentList1.add(s2);
        studentList1.add(s3);


        //하늘반 (교실,쌤,학생들)
        StudyClass hanelClass = new StudyClass("하늘반","김선생",studentList1);

        //나무반 3명 생성
        Student s4 = new Student("jung",18,75);
        Student s5 = new Student("jeon",19,85);
        Student s6 = new Student("park",20,95);

        //나무반 리스트에 저장
        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(s4);
        studentList2.add(s5);
        studentList2.add(s6);

        //나무반 클래스 넣기
        StudyClass treeClass = new StudyClass("나무반","이선생",studentList2);

        //바다반 3명 생성
        Student s7 = new Student("ung",19,100);
        Student s8 = new Student("miyu",19,45);
        Student s9 = new Student("haha",20,50);

        //바다반 리스트에 저장
        List<Student> studentList3 = new ArrayList<>();
        studentList3.add(s7);
        studentList3.add(s8);
        studentList3.add(s9);

        //바다반 클래스 넣기
        StudyClass badaClass = new StudyClass("바다반","윤선생",studentList3);


        //교실을 여러개 저장할 수 있는 list생성
        List<StudyClass> classList1 = new ArrayList<>();
        classList1.add(hanelClass);
        classList1.add(treeClass);
        classList1.add(badaClass);

        School school = new School(classList1);

        //학교안의 모든 학생의 정보 출력
//        for(int i =0; i < school.getClassList().size(); i++){
//            for(int s = 0 ; s < school.getClassList().get(i).getStudentList().size(); s++){
//                  // 학교.학교리스트(하늘,나무,바다,).그 중 하나(하늘반).하늘반 학생 리스트(kim,lee,min).크기(3명) 만큼 반복
//            }
//            System.out.println(school.getClassList().get(i).getStudentList().get(i));
//        }

        for (StudyClass studyClass : school.getClassList()) {
            System.out.println("반 이름: " + studyClass.getClassName());
            for (Student student : studyClass.getStudentList()) {
                System.out.println(student);
            }
            System.out.println(); // 반 간 구분을 위해 한 줄 띄기
        }




    }
}
