package 여섯번째_배열;

//(난이도 상) 간단한 성적처리 시스템을 만들어보자.
// 국어, 영어, 수학점수를 입력받아 각 과목에 대한 점수 및 총점, 평균을 출력하는 프로그램을 만들어보자.
// 반드시 배열을 사용하도록 한다.

import java.util.Scanner;

public class Test_1_12_시험문제 {
    public static void main(String[] args) {
        //변수선언
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[6];

        //과목명 저장할 공간
        String[] subjects = {"국어","영어","수학","사회","과학"};

        //총점
        double avg;



        //점수입력 0~100점사이만 받기, 그 외는 입력오류
        for (int i =0; i <scores.length -1 ; i++){      //마지막은 총점이기 때문에 -1
            while (true) {     //벗어나려면 조건!!!!!!
                System.out.print(subjects[i]+"점수: ");    // 과목명도 배열로
                scores[i] = sc.nextInt();

                if (scores[i] >= 0 && scores[i] <= 100)
                    break;
            }
        }

        //총점 및 평균 구하기
        for (int i = 0; i <scores.length -1; i++){  // 마지막은 총점이니까 총점빼고 돌아야함
             scores[scores.length -1 ] = scores[scores.length -1] + scores[i];    // 요소[0]부터 시작이기 때문에 마지막 요소는 -1을 해줘야함!!!!!!
        }

        avg = (double) scores[scores.length-1]/ (scores.length-1);   //-1이 있기때문에, 괄호해서 먼저 계산하도록 유도


        //점수 및 총점 평균 출력

        System.out.println();
        System.out.println("---결과입니다.---");

        for (int i =0; i < subjects.length; i++){
            System.out.println(subjects[i] + "점수: " + scores[i]);

        }
        System.out.println("총점 : " + scores[scores.length-1]);
        System.out.println("평균 : " + avg);

  }

}


    /*
            System.out.print("국어점수: ");
                scores[0] = sc.nextInt();   scores[0]번째에 scanner로 받은 수 입력;

                오류 방지를 위해 while(true){ 무한루프
                  if(무한루프 빠져나오는 조건)
                  break;
                }


    */
