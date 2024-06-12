package Inheritance_상속;

//상속을 하면,,,

public class WomanTest {
    public static void main(String[] args) {
        BusinessWoman bw = new BusinessWoman();

        System.out.println(bw.company);
        bw.tellCompany();
        System.out.println(bw.name);  //부모클래스도 호출가능
        bw.tellName(); //부모클래스도 호출가능


    }
}
