package s_static;

public class Cnt_Test {
    public static void main(String[] args) {
        //각각의 개체
        Cnt c1 = new Cnt();
        Cnt c2 = new Cnt();
        Cnt c3 = new Cnt();

        System.out.println("----------------");

        //static(공용 변수 선언 후)
        //객체생성시 static 이 있는 경우 static 부터 실행  (static 메모리 영역에 생성)
        Cnt2 c4 = new Cnt2(); //먼저 스태틱 메모리에 num 공간 만들어버림
        Cnt2 c5 = new Cnt2();//이미 num 공간 있기때문에 출력 ++
        Cnt2 c6 = new Cnt2();//++된 num 공간에 또 ++ 출력
    }
}
