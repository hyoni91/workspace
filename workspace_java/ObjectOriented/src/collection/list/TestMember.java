package collection.list;

// TestMember클래스에 main메소드를 만들어
// 위에서 만든 Member클래스의 객체를 저장할 수 있는 리스트를 만들어라.
// 그리고 3개의 Member객체를 저장하고 저장된 객체의 정보를 모두 출력하는 프로그램을 만드세요.

import java.util.ArrayList;
import java.util.List;

public class TestMember {
    public static void main(String[] args) {

        List<Member> m1 = new ArrayList<>();

        //생성자에서 매개변수로 만들어 두면 쉬움! 생각은 했으나 문제에 안 적혀있어서 일단 패쓰
        Member member1 = new Member();
        Member member2 = new Member();
        Member member3 = new Member();

        member1.setName("김석진");
        member1.setAge(30);
        member1.setId("ssjj");
        member1.setPw("ssjj123");
        member2.setName("전정국");
        member2.setAge(20);
        member2.setId("jj");
        member2.setPw("jj1");
        member3.setName("남준");
        member3.setAge(20);
        member3.setId("knj");
        member3.setPw("123456789");

        m1.add(member1);
        m1.add(member2);
        m1.add(member3);

        for(Member m : m1){
            System.out.println(m);
        }


        // List에 저장된 모든 회원의 나이의 합을 출력하여라.

        int sum = 0;
//        for(int i =0 ; i < m1.size(); i++){
//            sum= sum + m1.get(i).getAge();
//        }
//        System.out.println(sum);

        for(Member m : m1){
           sum =sum + m.getAge();
        }
        System.out.println(sum);


        //List에 저장된 회원 중 id가 java인 회원을 지우는 코드를 작성하세요.

        for(int i =0 ; i < m1.size(); i++){
           if(m1.get(i).getName().equals("java")){
               m1.remove(i).getName();
            }
        }



    }
}
