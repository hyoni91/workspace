package collection.list_2;

//학교 클래스는 다수의 교실을 가지고 있으며, 각 교실에는 다수의 학생 데이터를 가진다.
//학교 클래스에 3개의 교실을 생성하고, 각 교실에 3명씩 학생을 생성한다.
// 한 명의 담당교사가 여러 교실을 담당할 수도 있다.
// 아래는 각 클래스마다 필요한 매개변수 및 메소드들이다.
// 필요시 아래에서 제시된 메소드 외의 메소드는 추가해도 된다.

//필요 클래스 : Student(학생), StudyClass(교실), School(학교)


// 맴버변수 : 교실 다수(List를 사용할 것)


import java.util.ArrayList;
import java.util.List;

public class School {
    List<StudyClass> classList;


    public School(List<StudyClass> classList){
        this.classList = classList;
    }

    public List<StudyClass> getClassList(){
        return classList;
    }


    //  1) 매개변수로 담당교사명을 받아, 해당 담당교사가 맡고 있는 모든 반의 학생 정보를 출력
    //  2) 각 반별로 반별 평균 점수 및 전체 학급에 대한 평균 점수를 출력
    //  3) 모든 반에서 최고 성적을 가진 학생의 이름과 점수를 출력
    //  4) 매개변수로 반 이름을 받아, 해당 반의 평균을 리턴하는 기능

    }


