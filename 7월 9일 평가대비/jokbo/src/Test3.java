import java.io.FileOutputStream;
import java.util.Arrays;
// 의 초기값을 갖는 배열 생성, 해당 배열에서 가장 큰 값과 작은 값을 출력 (Test 3)

public class Test3 {
    public static void main(String[] args) {

        int[] arr ={5,11,20,40,30};
        int max = arr[0];
        int min = arr[0];

        for(int i =0; i < arr.length; i++){
            if(max < arr[i]){
                max=arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println("max = "+ max + " min = "+ min);

        }



    }


