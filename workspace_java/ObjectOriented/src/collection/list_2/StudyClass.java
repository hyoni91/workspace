package collection.list_2;

import java.util.ArrayList;
import java.util.List;

//교실 클래스
// - 맴버 변수 : 학생 다수(List를 사용할 것), 반이름, 담담교사명
// - 메소드
//  2) 해당 반의 평균 성적을 리턴하는 기능
//  3) 해당 반에서 최고 성적을 지닌 학생을 리턴하는 기능
public class StudyClass{

    private List<Student> studentList;
    private String className;
    private String techerName;

    public StudyClass(String className, String techerName, List<Student> students){
        this.studentList = students;
        this.className = className;
        this.techerName = techerName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public String getClassName() {
        return className;
    }

    public String getTecherName() {
        return techerName;
    }



}






    //1) 해당 반의 모든 학생의 모든 정보를 출력하는 기능
    //학생 리스트 선언만 해도 괜찮아유~~ 리스트선언을 했기때문에 여러명 있다는 가정이 되어있음.
//    public void AllStuInfo(){
//
//        }
//
//
//
//    //  2) 해당 반의 평균 성적을 리턴하는 기능
//    public double AllAvg(String className) {
//        int sum = 0;
//        int cnt = 0;
//
//        for (Student stu : StudentList) {
//            if (className.equals(this.className)) {
//                sum = sum + stu.getScore();
//                cnt++;
//            }
//        }
//        double avg = sum / (int) cnt;
//
//        return avg;
//    }
//
//    //  3) 해당 반에서 최고 성적을 지닌 학생을 리턴하는 기능
//
//    public Student higtScoStu(String className) {
//        int max = 0;
//        int index = 0;
//        for (int i = 0; i < studentList.size(); i++) {
//            if (studentList.get(i).getScore() > max) {
//                max = studentList.get(i).getScore();
//                index = i;
//            }
//        }
//        return studentList.get(index);
//    }





