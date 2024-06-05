package 여섯번째_배열;

/*
1. scanner 로 정수 하나를 입력받아, 입력받은 정수만큼의 길이를 갖는 배열을 생성하고
배열에 각 요소에 1 ~ 입력 받은 정수로 값을 저장한다.
예를 들어 5를 입력했으면 길이가 5인 배열을 만들고
각 요소에 1,2,3,4,5가 들어가야 한다.
그 후 배열에 들어간 수의 평균을 출력해보자.
*/


import java.util.Scanner;

public class Test_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기 : ");
        int length = sc.nextInt();

        int[] num = new int[length];

        int sum=0;

        for (int i =0; i < num.length; i++){
            num[i]= i+1;
            sum = sum+num[i];
            }

        //합을 구하는 공식 for each 로
//        for(int e : num){
//            sum = sum + e;
//        }
//

        double avg = sum /(double)num.length ;

        System.out.println(avg);

        }

    }

