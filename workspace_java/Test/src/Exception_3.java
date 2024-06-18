
//예외전가  throws Exception

public class Exception_3 {
    public static void main(String[] args) {
        try {
            bbb();
        } catch (Exception e){
            System.out.println("오류");
        }

    }

    public static void aaa() throws Exception { //던진다, 예외! (throws Exception 예외전가)
        System.out.println(5 / 0);
    }

    public static void bbb() throws Exception { //여기도 예외전가 가능! -> bbb 를 호출하는 main 에게
            aaa();
    }


}
