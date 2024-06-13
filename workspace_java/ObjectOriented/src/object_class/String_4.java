package object_class;

//String 에서 자주 쓰는 메서드
public class String_4 {
    public static void main(String[] args) {
        String ga = "kimbab";
        String na = "sundae";

        // .concat : 두 문자열의 나열  -> "+"로 많이대체함
         ga.concat(na);
        System.out.println(ga.concat(" "+na)); //kimbab subdae

        String eng = "abcdefg";
        // .substring : 문자열의 일부를 추출
        // (beginindex -> n번째 문자부터 추출  ★0부터 시작)
        eng.substring(3);
        System.out.println(eng.substring(3)); //defg

        // (beginindex 부터 시작해서   ★ endIndex 전까지!)
        eng.substring(0,3);
        System.out.println(eng.substring(0,3)); //abc

        String cocoro = "먹곱";
        System.out.println(cocoro.length());  //2 (문자열 길이)

        // .split : 문자열을 배열로 (문자열 자르기)
        String food = "피자, 치킨 , 족발";
        String[] result = food.split(",");  // ','를 기준으로 자르기
        System.out.println(result[0] + cocoro); //피자먹곱
    }
}
