
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


//람다식 연습
//함수형인터페이스의 추상메소드는 하나!
//혹시나 또 다른 메소드가 들어오는 등의 실수 방지를 위해서 @Override 적어두기!!!
@FunctionalInterface
interface LambdaPractice5<T> {
    T getResult(T a, T b);
}


@FunctionalInterface
interface LambdaPractice7<T,R> {
    R getResult(T a, T b);
}
