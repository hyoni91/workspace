package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.1. 문자열을 저장하는 리스트를 만들고 3개의 데이터를 넣어보자. 그 후 리스트에 저장된 3개의 데이터를 출력해보라.

        List<String> list = new ArrayList<>();

        list.add("ga");
        list.add("na");
        list.add("da");

        //2. 정수를 저장할 수 있는 리스트를 만들고 5개의 정수를 scanner를 통해 입력받아 리스트에 저장한다.
        // 리스트에 저장된 모든 데이터의 합을 출력하여라.

        List<Integer> num = new ArrayList<>();

        //리스트에 저장하는 코딩
//        for(int i = 0; i < 5; i++){  //길이에 size 하면 안됨 (0)임
//            System.out.print("정수 입력: ");
//            int n = sc.nextInt();
//            num.add(n);
//        }
//        int sum = 0;
//
//        //정수형데이터 num리스트
//        for(int e :num){
//            sum = sum +e ;
//        }
//        System.out.println(sum);

        System.out.println("--------------------------------");


        //3.이름을 저장하는 리스트를 만들고 리스트에 적당히 데이터를 저장한다.
        // 그 후 저장된 이름 중 ‘홍길동’이라는 이름이 있다면 ‘해당 이름이 존재합니다.’라는 문구를 출력하는 프로그램을 만들어라.


        List<String> name = new ArrayList<>();

        name.add("전정국");
        name.add("김태형");
        name.add("박지민");

        for(int i =0; i <name.size(); i++){
            if(name.get(i).equals("김태형")){
                System.out.println("해당 이름이 존재합니다.");
            }
        }
        System.out.println("--------------------------------");

        //4. 리스트에 1~100까지의 랜덤한 정수를 10개 넣어보자.
        // 그 후  저장된 데이터 중 짝수의 개수와 모든 짝수를 출력하는 프로그램을 만드세요.
        //(Math.random()이라는 메소드는 0 <= x < 1의 실수를 리턴)

         List<Integer> ram = new ArrayList<>();

         for(int i=0; i < 10 ; i++){
             ram.add( (int)(Math.random() * 100 + 1));
         }
         int cnt =0;

         List<Integer> a = new ArrayList<>();

         for(int i = 0; i < ram.size(); i++){
             if(ram.get(i)%2==0){
                 cnt++;
                 a.add(ram.get(i));
             }
         }
         System.out.println("짝수의 개수 : "+ cnt);
         System.out.println(a);


//        //쌤풀이
//         for(int e : ram){
//             if(e%2==0){
//                 cnt++;
//                 System.out.println(e);
//             }
//         }
//        System.out.println(cnt);
    }
}
