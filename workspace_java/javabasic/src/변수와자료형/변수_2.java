package 변수와자료형;/*
    변수는 데이터를 저장하기 위한 공간이다.
    변수 사용을 위해서는 반드시 변수 선언을 해야한다.
    <변수 선언 >   [자료형 변수명;
    변수는 원하는 만큼 개수 제한없이 선언 가능 (단 중복명 안됨 / 대소문자로 구분)
    하나의 변수에는 하나의 값만 저장
    ------------------------------------------------------------------------
    ※변수명의 명명법  https://devnew.tistory.com/5
    소문자로 선언하는 것이 관례이다.
    예약어, 지정어를 사용할 수 없다. (문법으로 이미 쓰고 있는 단어 ex) int, String
    한글로도 선언이 가능하지만 영어로 쓰는 것을 권유!!!!
    이름은 직관적인 것이 좋다. (ex.  나이를 저장할 변수 -> int age; )
    복합어(합성어)의 변수는 camelCase 기법으로 선언 (단어별로 대문자) ex. 학생번호   int studentNumber;  or  int stu_Num;  ※ [-] 는 빼기로 인식하기 때문에 _로 구분
*/


public class 변수_2 {

    public static void main(String[] args) {
//        변수명은 중복되지 않도록 할 것 !
        int num1;
        int num2;

        num1 = 10;
        num2 = 20;

        int num3;

        num3 = num1 + num2 ;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);

    }
}
