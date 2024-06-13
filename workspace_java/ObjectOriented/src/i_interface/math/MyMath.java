package i_interface.math;

import javax.xml.transform.Result;
import java.text.Format;

public class MyMath implements MathUtil {
    @Override
    public int getMin(int a, int b) {
//        if (a < b) {
//            return a;
//        } else
//            return b;
        return a < b ? a : b ;

    }


    @Override
    public double getCircleArea(int radius) {
//        if(radius < 0){
//            return 0;
//        } else {
//            return 2*3.14*radius;  // return 2*Math.PI *radius;
//        }
//
        return radius <0 ? 0 : 2*Math.PI*radius;

    }

    @Override
    public int getMultiple(int num1, int n) {
//        int result = num1;
//        for (int i=1; i < n; i++) {
//        result*= num1;
//        }
//        return result;
//    }
//
        int r1 = 1;
        for(int i =0; i < n ; i++){
            r1 = r1 * num1;  // i=0 일때 1*num1 = num1 이 된다.
    } return r1;

    }
}
