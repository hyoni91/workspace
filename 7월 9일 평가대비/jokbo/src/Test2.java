import java.util.Arrays;

// 정수 6개 저장하는 배열 만들고, 배열 요소에 1-46 사이의 난수를 저장 (중복값 허용/ 46 미포함)
//배열에 난수를 저장하고 출력하기  (Test2)
public class Test2 {

    public static void main(String[] args) {

        int[] arr = new int[6];

        for(int i =0; i < arr.length; i++){
            int ramdom = (int) (Math.random()*46);
            arr[i] = ramdom;
        }


        // 오름차순
        for(int i =0; i < arr.length-1; i++){
            for(int j=1+i; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

//        for(int ram : arr){
//            System.out.println(ram);
//        }



    }

}
