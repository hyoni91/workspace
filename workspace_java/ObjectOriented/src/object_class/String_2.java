package object_class;

//리터럴풀
//https://m.blog.naver.com/smhrd_official/223233585009
public class String_2 {
    public static void main(String[] args) {
        //String 객체 생성 방법에 따른 차이점

        String name1 = "kim";
        String name2 = "kim"; //중복의 경우 같은 객체에 묶어버림
        String name3 = new String("kim");  //new 새로운 객체를 만들어주세요
        String name4 = new String("kim");

         /* '=='
            숫자(정수,실수)일 경우, 두 숫자가 같은 숫자인가?
            숫자를 제외한 나머지 자료형에 대해서는 두 객체가 같은 객체인가? (두 객체가 같은 데이터를 바라보는가?)  */

        if(name1 == name2){
            System.out.println(1);
        }

        //서로 다른 객체
        if (name3 == name4){
            System.out.println(2);
        }

    }
}
