package test;

public class MathUtillTest {
    public static void main(String[] args) {
        MathUtilImpl math = new MathUtilImpl();

        int[] arr = {1,2,3,4,5};
        System.out.println( math.getArraySum(arr));
        System.out.println(math.getSumFromOne(2));
        System.out.println(math.isEven(4,2,4));


    }
}
