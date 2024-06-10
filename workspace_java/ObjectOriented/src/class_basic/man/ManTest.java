package class_basic.man;



public class ManTest {

    public static void main(String[] args) {
        Man info = new Man("윤기",32,"대구");

        info.stuInt();

        //setter로 이름변경
//        info.name = "private 로 접근금지"
        info.setName("김남준");

        //getter로 값 리터받고 출력
//        System.out.println(info.name);//프라이빗으로 접근금지
        System.out.println(info.getName());

        System.out.println("----------------------------------------");
        info.stuInt();

    }


}
