package 여섯번째_배열;


//1, 2, 3, 4, 5, 6 ,7 ,8 로 초기화된 배열을 만들고, 배열의 요소 중 짝수의 개수를 구하는 프로그램을 만들어라.

public class Test8 {

    public static void main(String[] args) {

        int[] arr = new int[8];

        for (int i =0; i < arr.length; i++){
            arr[i] = i +1;
        }

        int cnt=0;

        //for 문
//        for (int i =0 ; i <arr.length; i++){
//            if (arr[i]%2==0){
//                cnt++;
//            }
//
//            }

        //for each 문
        for(int e : arr){
            if(e%2==0){
                cnt++;
            }
        }

        System.out.println("짝수 개수 : "+ cnt);
        }



    }

