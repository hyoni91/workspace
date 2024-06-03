package 네번째_조건문;

/*
    switch case break = case 문

    [쓰는 법]
    switch(변수){
        case 값1 :   (break;)
        case 값2 :   (break;)
        case 값3 :   (break;)  --- 디폴트를 준 경우는 마지막에 break; 꼭 넣어줘야함
        default:  //그 밖에는,,
    }

    ★조건이 만족되면 만족된 순간부터 아래로 차례대로 실행
    ★break (만족 값만 출력하고 싶다면 모든 케이스 마지막 부분에 넣어주기 break;)  위에서 아래로 순차적이니 출력값 밑에!

*/


public class Case_1 {

    public static void main(String[] args) {

        System.out.println("프로그램 시작");

        int num = 10;

        switch(num){
            case 1 :  // 스위치 안의 변수 값이 ~일때,
                System.out.println(1);
                break; // break 문을 만나면 switch 문 종료
            case 3 :
                System.out.println(3);
                break;
            case 5 :
                System.out.println(5);
                System.out.println("입니다.");
                break;//출력은 여러개 가능
            case 7 :
                System.out.println(7);
//                break; 마지막 케이스 문에는 브레이크문 생략 but  default 값을 넣으면 브레이크 넣어야함!!


            default: //그 밖에는,,
                System.out.println("해당없음");
        }

        System.out.println("프로그램 종료");

    }
}
