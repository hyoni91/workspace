package test;

public class MathUtilImpl implements MathUtil{


    @Override
    public boolean isEven(int a, int b, int c) {
        int sum = a+b+c;
//        if(sum%2==0 && sum%5==0){
//            return true;
//        }
//        //매개변수로 받은 세 수의 합이 짝수이면서
//        //동시에 5의 배수일 경우에만 리턴 true
//        return false;

        // 참 또는 거짓 뿐이기 때문에 코드를 가장 짧게 적으면 밑에 처럼도 가능
        return  sum%2==0 && sum%5==0 ;
    }

    @Override
    public int getSumFromOne(int num) {
        int sum= 0;
        for(int i=1; i < num+1; i++){
            sum = sum+i;
        }

        //1부터 매개변수로 받은 수까지의 합을 리턴
        return sum;
    }

    @Override
    public int getArraySum(int[] arr) {
        int sum=0;
        for(int i=0; i < arr.length; i++){
            sum= sum+arr[i];
        }
        return sum;
    }

}
