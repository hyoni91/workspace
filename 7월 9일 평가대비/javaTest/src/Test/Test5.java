package Test;


import java.util.Arrays;
import java.util.Scanner;

//요구사항
//1) 먼저 크기가 3인 정수형 배열을 생성하고 배열의 각 요소에 1 ~ 9사이의 랜덤한 정수를 저장한다.
// 중복 불허.
// 2) 3스트라이크가 될 때까지 프로그램을 지속되어야 하며 실행 결과 3스트라이크를 맞춘 도전 횟수를 출력
//3) Scanner를 통해 입력한 세 수와 요구사항 1)에서 생성한 랜덤한 세 수를 비교하여 스트라이크와 볼을 결정한다.
// 4) 키보드로 입력한 수가 1)에서 만든 배열의 수와 일치하며 위치도 같다면 스트라이크,
// 수는 일치하지만 위치가 다르면 볼이다.
public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] baseball = new int[3];


        // 숫자 생성 (1 ~ 9 까지!!!!!)
        for (int i = 0; i < baseball.length; i++) {
            int ramdom = (int) (Math.random() * 9 + 1);  // *10  하면 0나온다구~~
            baseball[i] = ramdom;
            //중복검사
            for (int j = 0; j < i; j++) {  // i만큼 도는 이유는 배열이 늘어날 수록 중복할 배열도 늘어나기 때문에
                if (baseball[i] == baseball[j]) {
                    i = -1;
                    break; // 넣어주면 깔끔쓰
                }
            }
        }

//        //만들어진 숫자 확인용
        System.out.print("만들어진 숫자 : ");
        System.out.println(Arrays.toString(baseball));


        int cnt = 0;
        boolean result = true;

        System.out.println("숫자를 정했습니다. 게임을 시작합니다.");

//        while (result) {
//            int ball =0;
//            int str = 0;
//            cnt ++;
//            int a,b,c;
////            System.out.println("한자리 숫자를 연속 3회 입력하세요.");
////            System.out.print(cnt + ">>");  쌤풀이
//            a = sc.nextInt();
//            b = sc.nextInt();
//            c = sc.nextInt();
//
//
//            if (baseball[0] == a) {
//                str++;
//            } else if (baseball[1] == a || baseball[2] == a) {
//                ball++;
//            }
//            if (baseball[1] == b) {
//                str++;
//            } else if (baseball[0] == b || baseball[2] == b) {
//                ball++;
//            }
//            if (baseball[2] == c) {
//                str++;
//            } else if (baseball[0] == c || baseball[1] == c) {
//                ball++;
//            }
//
//            System.out.println(cnt + " >> "+ a + " " + b + " " + c + " ");
//            System.out.println(str + "스트라이크 " + ball + "볼");
//
//             if(str ==3 ){
//                 System.out.println(cnt +"회만에 정답을 맞췄습니다.");
//                 result = false;
//             }
//
//        }


        //쌤풀이
        int[] answer = new int[3];  //쌤풀이  배열 활용하기
        boolean result2 = true;

        while (result2) {
            int ball = 0;
            int str = 0;
            cnt++;

            System.out.print(cnt + ">>");
            answer[0] = sc.nextInt();
            answer[1] = sc.nextInt();
            answer[2] = sc.nextInt();

            for (int i = 0; i < baseball.length; i++) {
                for (int j = 0; j < answer.length; j++) {
                    if (baseball[i] == answer[j]) {
                        if (i == j) {  // 두 수가 같을 때 요소의 순번이 같으면 스트라이크
                            str++;
                        } else ball++;  // 두 수가 같을 때 요소의 순번이 다르면 ball
                    }
                }
            }
            System.out.println(str + "스트라이크 " + ball + "볼");
               if (str == 3) {
                System.out.println(cnt + "회만에 정답을 맞췄습니다.");
            }  result2 = false;
        }
    }
}
