package class_basic.rect;

public class Rect_Test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();// 0,0,0,0
        Rectangle s = new Rectangle(1,1,2,3);

        System.out.println("생성자 값 출력 정보");
        System.out.println("----------------------");
        r.show();
        s.show();
        System.out.println("s 넓이:" + s.square());

        System.out.println("----------------------");
        System.out.println("r 변수 변경 후 다시 출력");
        System.out.println("----------------------");
        r.set(-2,2,-1,4);  // 인자란? 예) set 이라는 메서드의 매개변수 x1의 인자값은 -2
        r.show();
        System.out.println("r 넓이: "+ r.square());

        if(r.equals(s)){
            System.out.println("두 사각형은 넓이는 같습니다.");
        }
    }
}
