package 다섯째_반복문.For;

/*
    [무한 루프 문법 - 대부분 while 로함 ]
    while(true){

    }

    for(;;){

    }

    무한루프를 벗어나려면 break!
*/


import java.util.Scanner;

public class 무한루프 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("점수입력: ");
            int sco = sc.nextInt();
            //sco 가 0과 같거나 크고 100과 같거나 클때 무한루프를 벗어난다.
            if(sco >= 0 && sco <=100){
                break;
            }
        }

        System.out.println("무한루프에서 벗어났습니다.");


    }
}
