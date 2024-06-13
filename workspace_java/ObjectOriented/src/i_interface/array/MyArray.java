package i_interface.array;

import javax.xml.transform.Result;

public class MyArray implements MyArrayUtil {
    @Override
    public double getTwoArrayAvg(int[] arr1, int[] arr2) {
        int sum = 0;

        for (int i = 0; i < arr1.length; i++) {
            sum = sum + arr1[i];
        }

        int sum2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum2 = sum2 + arr2[i];
        }

        int sum3 = sum + sum2;
        double avg = (double) sum3 / (arr1.length+arr2.length);
        return avg;


    }

    @Override
    public boolean isEvenArray(int[] array) {
//        return true;
        boolean result;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2!= 0) {
                return false;
            }

        }return true;


    }
}












