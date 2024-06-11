package class_basic;
//Student 클래스 (설계도)
public class Student {
    String name;
    int age;
    int score;
    // 밑에 선언해도 오류나지 않음! 하지만, 통상적으로 변수 먼저 선언함


    //데이터관리, 재사용성, 안전성을 위해 메서드로 값 입력 받기.
    //매개변수로 전달된 문자열을 name 값을 변경
    public void setName(String reName){
        name = reName;
    }

    //나이를 변경하는 메서드
    public void setAge(int reAge){
        age = reAge;
        //0~200까지 제한 등등을 걸 수 있음
    }

    public void stuIntro(){
        System.out.println("이름: "+ name);
        System.out.println("나이: "+ age);
        System.out.println("점수: "+ score);
    }

}
