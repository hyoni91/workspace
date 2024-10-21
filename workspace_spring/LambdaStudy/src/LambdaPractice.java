
//추상메소드가 하나인 함수형 인터페이스
public interface LambdaPractice {
    void printName();
}


//연습용으로 인해 같은 패키지안에 다 만들어 줬다.
interface LambdaPractice1 {
    void printName(String name);
}



interface LambdaPractice2 {
    void printMyInfo(String name, int age);
}


interface LambdaPractice3 {
    int getData();
}



interface LambdaPractice4 {
    int getResult(int a, int b);
}