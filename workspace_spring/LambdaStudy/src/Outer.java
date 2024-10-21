
//선수 학습

//Inner Class : 클래스 안에 선언된 클래스
public class Outer {
    private int num;

    public Outer(){
        this.num = 0;
    }

    //멤버 이너 클래스
    class Board{
        public void printNum(){
            System.out.println("num : " + num);
        }
    }


    //메소드
    public void aaa(){
        int age = 0;  //지역변수

        //로컬 이너 클래스
        class Item{
            public void printAge(){
                System.out.println("age : " + age);
            }
        }
    }
}
