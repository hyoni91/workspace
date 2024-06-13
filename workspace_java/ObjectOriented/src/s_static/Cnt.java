package s_static;

//static : 멤버변수와 메서드에서 사용 가능
//=> 공용변수, 공용메서드를 의미

//https://kadosholy.tistory.com/95

public class Cnt {
    int num = 0;

    public Cnt(){
        num++;
        System.out.println(num);
    }
}

class Cnt2{
    static int num =0;  //공용변수 선언!

    public Cnt2(){
        num++;
        System.out.println(num);
    }
}
