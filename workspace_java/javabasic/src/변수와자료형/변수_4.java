package 변수와자료형;

public class 변수_4 {
    public static void main(String[] args) {
//        변수는 선언 후 반드시 최초 값을 한 번은 할당해야함
        int num;
        num=5;  //이 코드가 사라지면 오류발생!

        System.out.println(num);

//        변수의 선언 및 값 할당은 동시에 가능
        int num1 = 6;
        System.out.println(num1);

//        자료형이 같은 변수는 한 번에 여러개 선언 가능 (자주 쓰이지는 않는다.) 값은 따로 저장
        int a1, a2, a3 ;
        a1 = 1;
        a2 = 2;
        a3 = 3;


    }
}
