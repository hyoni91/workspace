package s_static;

//static 키워드가 붙은 멤버변수의 초기화 방법
//static 은 생성자에서 초기화 하면 안된다(리셋됨)
//static 의 초기화 구문 따로 존재
//static 은 밖으로 나와있음! 객체 만들어지기 전에 해석

public class Static_Init {
    int n;
    static int num;   //공용변수

    public Static_Init(){
        n = 10;
//        num = 5;  static은 이렇게 초기화 하면 안됨
        num++;
        System.out.println("n : "+ n);
        System.out.println("num: " +num);
    }


    //static 변수의 초기화
    static{
        num =5;
    }

}
