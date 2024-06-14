package i_interface.student;

//1.아래 요구에 맞는 추상 메서드를 정의
//2.완성한 인터페이스를 구현한 클래스를 생성(MyStudent)
//3.MyStudent 클래스에서 인터페이스의 메서드를 구현

public interface StudentUtil {


    String getGradeByStudentName(Student[] stu, String name);
    int[] getTotalScoresToArray(Student[] stu);
    Student getHighScoreStudent(Student stu1, Student stu2);

    /*첫번째 메서드
    메서드명 : getGradeByStudentName
    첫번째 매개변수로 받은 다수의 학생 중
    두번째 매개변수로 받은 이름을 가진 힉생의 점수 등급을 리턴
    단, 전달받은 이름을 가진 학생이 없다면 점수 등급은 "등급없음"이 된다.

    <점수등급 >
    90 <= 평균점수 <= 100: "A"
    80 <= 평균점수 <= 89 : "B"
    70 <= 평균점수 <= 79 : "C"
    70 > 평균점수 : "D"
    */

    /*두번째 메서드
    메서드명 : getTotalScoresToArray
    매개변수로 받은 다수의 학생들의 총점을 배열로 리턴
    */

    /*세번째 메서드
    메서드명 : getHighScoreStudent
    매개변수로 두 명의 학생이 전달된다.
    전달된 두 학생 중 총점이 높은 학생 객체를 리턴
    단, 전달된 두 학생의 총점이 같은 경우는 없다고 가정.
    */

    //내가푼거
//    String getGradeByStudentName(Student stu);

}
