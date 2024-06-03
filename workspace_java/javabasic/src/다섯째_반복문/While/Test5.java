package 다섯째_반복문.While;

//while문을 사용하여 1 ~ 10까지의 합을 구하여라.

public class Test5 {
    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        while (i <= 10){
            sum = sum+i;
            System.out.println(sum);
            i++;
        }


    }
}


//0+1 =1
//2
//1+2 =3
//3
//3+3 = 6
//4
//6+4 =10
//5
//10+5 = 15
//6
//16+6 = 21
//7
//22+7 = 28
//8
//29+8 = 36
//9
//37+9 = 45
//10
//46+10 =55