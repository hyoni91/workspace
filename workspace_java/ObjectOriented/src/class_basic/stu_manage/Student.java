package class_basic.stu_manage;

public class Student {
    private String name;
    private int age;
    private int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    public int getScore() {

        return score;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void setScore(int score) {

        this.score = score;
    }

    //프린트용 getter 아니야~
    public void stuInfo(){
        System.out.println("이름: " +name);
        System.out.println("나이: " + age);
        System.out.println("점수: "+ score);
    }
}

