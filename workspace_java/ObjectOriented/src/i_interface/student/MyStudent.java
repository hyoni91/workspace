package i_interface.student;

import com.sun.source.tree.WhileLoopTree;

import java.util.Arrays;

public class MyStudent implements StudentUtil{
    @Override
    public String getGradeByStudentName(Student[] stu, String name) {
        String grade = "등급없음";

        for(Student e : stu){
            if(e.getName().equals(name)){
                int sum = e.getKorScore() + e.getEngScore() + e.getMathScore();
                double avg = (double)sum / 3.0;
               grade = getGradeByAvg(avg);
            }
        }
        return grade;
    }

    //코딩을 좀더 깔끔하게 하기 위해서 메서드 추가 (등급메서드) - 프라이빗
    private String getGradeByAvg (double avg){
        String grade = "";

        if(avg >= 90 && avg <=100){
            grade = "A";
        } else if (avg >= 80){
            grade = "B";
        }else if (avg >=70){
            grade = "C";
        } else if(avg <70) {
            grade= "D";
        }else {
            grade = "등급없음";
        }
        return grade;
    }

    @Override
    public int[] getTotalScoresToArray(Student[] stu) {

        int[] totalScores = new int[stu.length];  //-> 길이는 학생 수 만큼!
//        int a = 0;
//        for(Student s : stu){
//            int sumSco = s.getMathScore()+s.getEngScore()+s.getKorScore();
//            totalScores[a]=sumSco;
//            a++;
//        }

        for(int i =0; i < stu.length; i++){
            totalScores[i] = stu[i].getMathScore()+stu[i].getEngScore()+stu[i].getKorScore();
        }
        return totalScores;

    }

    @Override
    public Student getHighScoreStudent(Student stu1, Student stu2) {

        Student stu;
        int sum1 = stu1.getEngScore()+ stu1.getKorScore()+stu1.getMathScore();
        int sum2 = stu2.getEngScore()+ stu2.getKorScore()+stu2.getMathScore();

        stu = sum1 > sum1 ?  stu1 : stu2 ;


        return stu;
    }


    //내가 푼 것
//    @Override
//    public String getGradeByStudentName(Student stu) {
//       String  name;
//       name = stu.getName();
//        String r ="";
//
//            if (stu.getName().equals(name)) {
//                if (stu.getAvg() >= 90 && stu.getAvg() <= 100) {
//                    r= "A";
//                } else if (stu.getAvg() >= 80) {
//                    r= "B";
//                } else if(stu.getAvg()>=70){
//                   r= "C";
//                }else if(stu.getAvg()<70) {
//                    r= "D";
//                }else {
//                    r="등급없음";
//                }
//            }
//
//        return r;
//    }


}
