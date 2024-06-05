package 일곱번째_메서드;

/*
    (매개변수 parameter : (일정하게 정한) 한도) -> 메서드 정의 부분 소괄호 안에서 정의된 변수
    매개변수 정보 : 매개변수 자료형, 매개변수 갯수
 */


public class Method_3 {
    public static void main(String[] args) {
        tellYourName("jin");   //매개변수 정보 : 매개변수 자료형, 매개변수 갯수
//        tellYourName("tata");


    }


    public static void tellYourName(String name){
        System.out.println("my name is " + name);
        tellYourAge(30);
    }

    public static void tellYourAge(int age){
        System.out.println("제 나이는 " + age + "입니다.");
    }

}
