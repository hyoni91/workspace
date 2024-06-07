package 변수와자료형;


public class 기본자료형_형변환 {
    public static void main(String[] args) {

//      <자동 형변환> ->자동으로 실수형으로 변환 ----> 자동으로 형(dataType)변환(promotion) ----------> 데이터 손실 없음
        int num1 = 5;
        double num2 = num1;
        System.out.println("num2 = " + num2);

        double num3 = 5.5 ;
//        int num4 = num3 ; 오류!  실수는 정수형에 저장 불가

//       <강제 형변환>(Casting)  실수 데이터 num3를 강제로 int로 형 변환 -------->실수 데이터 손실
        int num4 = (int)num3;

        System.out.println(num4);

    }
}
