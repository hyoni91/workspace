package 일곱번째_메서드;




public class Method_2 {

    public static void main(String[] args) {
        System.out.println("시작");
        tellYourName();
        tellYourAge();
        System.out.println("종료");

    }

    public static void tellYourName(){
        System.out.println("저는 김석진 입니다.");

    }

    public static void tellYourAge(){
        System.out.println("30세 입니다.");
        tellYourAddr(); //메인 메서드 외에서도 메서드 호출 가능 (실행은 메인에서)

    }

    public static void tellYourAddr(){
        System.out.println("서울에 살고 있습니다.");
    }

}
