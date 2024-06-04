package 다섯째_반복문.For;


//반복문(while,for)에서의 [ break ] 역할
//break 문을 만나면 가장 가까이에 있는 반복문을 벗어난다.

public class Break_Continue {
    public static void main(String[] args) {

        for (int i=1 ; i <11 ; i++){
            if(i == 5){
                break;
            }
            System.out.print(i + " ");   // 1-4 까지만 출력  ('5'일때 프린트를 만나기 전에 브레이크 = 반복문에서 벗어난다.)
        }

        System.out.println();
        System.out.println("--------------------------");


        // 반복문(while,for)에서의 continue 역할
        //continue 를 만나는 순간 스킵 후 다시 반복문의 끝으로 이동한다.

        for (int i=1 ; i <11 ; i++){
            if(i == 3){
                continue;  // 스킵하고 다음 실행 (for 문은 계속됨)
            }
            System.out.print(i+ " ");
        }
    }

}
