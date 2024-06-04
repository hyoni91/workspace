package 다섯째_반복문.While;

// while문을 사용하여 1 ~ 10까지의 합을 구하여라.

public class Test5 {
    public static void main(String[] args) {

        int i = 1;  //1 ~ 10
        int sum = 0; // 합을 저장하는 변수

        // i <= 10 과 같지만, 포함관계는 잘 쓰지 않음
        while (i < 11){
            sum = sum+i;  // sum += i ;
            i++;
        }

        System.out.println(sum);

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