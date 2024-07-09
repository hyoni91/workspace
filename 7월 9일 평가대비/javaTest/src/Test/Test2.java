package Test;

import java.util.Arrays;

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

    }

}
