public class GetterableTest {


    public static void main(String[] args) {

        //------------이너 클래스----------------
        class Test implements Getterable{
            public void getNum() {
                System.out.println(1);
            }
        }

        Test test = new Test();
        test.getNum();



        //------------익명 이너클래스----------------
        Getterable test1 = new Getterable() {
            public void getNum() {
                System.out.println(1);
            }
        };
       test1.getNum();



        //------------람다식----------------
        Getterable test2 = () -> {System.out.println(1);};
        test2.getNum();

        //람다로 구현한 메소드의 내용 부분이 한 줄이라면 {}생략 가능
        Getterable test3 = () -> System.out.println(10);
        test3.getNum();



    }


}


