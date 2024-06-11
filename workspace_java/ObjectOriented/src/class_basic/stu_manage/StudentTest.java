package class_basic.stu_manage;

public class StudentTest {
    public static void main(String[] args) {
        //학생(student class)을 다섯명 저장할 수 있는 배열 생성


        Student[] students = new Student[5];

        //배열에 저장할 학생 객체 생성
        Student s1 = new Student("박지민",18,85);
        Student s2 = new Student("김태형",18,90);
        Student s3 = new Student("김남준",20,100);
        Student s4 = new Student("민윤기",20,70);
        Student s5 = new Student("전정국",18,100);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;



        //배열에 저장된 모든 학생의 이름,나이,점수 출력
   /*     s1.stuInfo(); // student[0].stuInfo();

        for(int i =0 ; i< students.length; i++){
            students[i].stuInfo();
            System.out.println();
        }
        System.out.println("-------------------");

        //1번 문제를 for each문
        for (Student e : students){
            e.stuInfo();
        }*/

        //이름이 "박지민"인 학생을 찾아 해당 학생의 나이를 10으로 변경 (for / for each )

        for(int i =0; i <students.length; i++){
            if (students[i].getName().equals("박지민")){
                students[i].setAge(10);
            }
        }

        for(Student e : students){
            if (e.getName().equals("박지민")){
                e.setAge(10);
                e.stuInfo();
            }
        }




//        System.out.println("-------------------");
//        2. 배열에 저장된 학생 중 점수가 80점 이상인 학생의 이름,나이,점수 출력

        /*for(int i =0; i < students.length; i++){
            if (students[i].getScore() >= 80){
                students[i].stuInfo();
            }
        }
    */
    }
}
