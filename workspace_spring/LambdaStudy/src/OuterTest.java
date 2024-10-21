
public class OuterTest {
    public static void main(String[] args) {

        //Outer 클래스 객체 생성
        Outer outer = new Outer();
        //이너 클래스 객체 생성
        Outer.Board board = outer.new Board();



    }



}
