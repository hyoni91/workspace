package 여섯번째_배열;

//정수를 10개 저장할 수 있는 배열을 생성하고 모든 요소에 3을 넣어라. 그리고 3이 잘 들어갔는지 출력하여 확인해보아라.

import 다섯째_반복문.For.For_1;

public class Test4 {
    public static void main(String[] args) {


        int[] n1 =new int[10];


        for (int i=0; i<n1.length; i++){
            n1[i]=3;
        }


        for (int i=0; i < n1.length; i++){
            System.out.println(n1[i]);
        }






    }
}
