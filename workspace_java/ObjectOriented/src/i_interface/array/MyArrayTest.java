package i_interface.array;

public class MyArrayTest {
    public static void main(String[] args) {
        MyArrayUtil ar = new MyArray();

        int[] arr = {1,2,3};
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,2};

        System.out.println(ar.getTwoArrayAvg(arr,arr1));
        System.out.println(ar.isEvenArray(arr2));

    }
}
