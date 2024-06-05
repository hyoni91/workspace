package 일곱번째_메서드;



public class Method_4 {

    public static void main(String[] args) {
        introduce("jin", 30,"서울"); //매개 변수의 정보(String,int,String) 와 갯수(name,age,addr 3개)가 일치해야함 !
        System.out.println();
        introduce("tata", 20,"울산");

        String a = "정유미";
        int b = 40;
        String c = "서울";

        System.out.println();
        System.out.println("introduce 메서드의 또다른 실행결과 (매개변수정보일치!)");

        introduce(a,b,c);
    }



    public static void introduce(String name, int age, String addr){
        //(매개변수 여러개 선언 가능 ',')
        System.out.print("이름: "+ name + " ");
        System.out.print("나이: "+ age + " ");
        System.out.print("주소: "+ addr + " ");



    }
}
