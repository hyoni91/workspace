package collection.list;

//Student는 학생에 대한 정보가 들어있는 클래스이다.
// 해당 클래스는 학생이름, 국어점수, 영어점수, 총점 데이터를 가지고 있다.
// 각 필드를 선언하고 setter와 getter를 만들어보자.
// 추가적으로 모든 정보를 출력하는 기능을 toString()메소드를 오버라이딩하여 작성한다.

public class Student {
    private String name;
    private int korSco;
    private int engSco;
    private int mathSco;
    private int totalScore ;  //-> 생성자 만들때 생성하지마세요

////    public Student(int mathSco, int engSco, int korSco, String name) {
////        this.mathSco = mathSco;
////        this.engSco = engSco;
////        this.korSco = korSco;
////        this.name = name;

//            //총점은 매개변수 NO  메서드로 토달점수 getter만드는걸 추천
////    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKorSco() {
        return korSco;
    }

    public void setKorSco(int korSco) {
        this.korSco = korSco;
    }

    public int getEngSco() {
        return engSco;
    }

    public void setEngSco(int engSco) {
        this.engSco = engSco;
    }

    public int getMathSco() {
        return mathSco;
    }

    public void setMathSco(int mathSco) {
        this.mathSco = mathSco;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", korSco=" + korSco +
                ", engSco=" + engSco +
                ", mathSco=" + mathSco +
                '}';
    }


    public int getTotalSco(){
        return this.totalScore = getEngSco()+getKorSco()+getMathSco();
    }


}
