package 다섯째_반복문.While;

//출력문을 한번만 사용하여 ‘2 4 6 8 10’을 출력하되, while문을 사용하여라.

public class Test3 {
    public static void main(String[] args) {

        //0은 출력하지 않기 때문에 2부터 출력

        int i = 2;

        while (i <=10){
            if(i % 2 ==0){
                System.out.print(i + " ");
            }
            i++;
        }


        System.out.println("↓↓↓↓ 다른 풀이 ↓↓↓↓ ");

        int n = 2;

        //n이 11보다 작을 동안 반복 함
        while (n < 11){
            System.out.print(n + " ");
            n = n+2;  // 2씩 증가 시키키
        }



    }
}
