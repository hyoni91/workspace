package 여섯번째_배열;

//

public class Test_3_1 {
    public static void main(String[] args) {
        int max = 0;
        int[] array = {1,5,3,8,2};

        // max 의 값과 각 요소의 값을 비교하여  max 에 큰 수를 저장하기   요소값이 맥스보다 작으면 패쓰(if)

        for (int i=0; i < array.length; i++){
            if (max < array[i]){
                max = array[i];
            }
        }

        System.out.println("max : " + max);

        }


    }

