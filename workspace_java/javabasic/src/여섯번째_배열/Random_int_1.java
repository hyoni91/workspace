package 여섯번째_배열;

public class Random_int_1 {

    public static void main(String[] args) {

        //1~10의 랜덤한 정수


        //0.0 <= x <1.0 실수
        //double ran = Math.random();

        //0.0*10 <= x <1.0*10 실수
        // 0.0 <= x < 10.0
        // 1.0 <= x < 11.0   >>> *10에서  1을 더한 경우
        int random1 = (int)(Math.random() * 10 + 1);    //강제형변환
        System.out.println(random1);
    }


}
