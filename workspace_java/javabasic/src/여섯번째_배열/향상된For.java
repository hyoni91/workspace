package 여섯번째_배열;


public class 향상된For {
    public static void main(String[] args) {

        //for-each 문 : 배열에서 값을 읽을 때 사용

        int[] arr1 = {3,7,10,5,1};

        //for 문
        for (int i=0; i <arr1.length; i++){
            System.out.println(arr1[i]);
        }

        System.out.println("-------------------------");

        //for each문 ( 데이터를 하나씩 빼서 어디 담을래?(자료형 같아야함)  : 반복은 무엇으로?->가지고 있는 데이터 수 만큼 (해석1) )
        for (int e : arr1){         //int e =3 , int e= 7 ....int e=1 : arr1{3,7,10,5,1}
            System.out.println(e);  //데이터 하나씩 뺀 e를 출력
        }

        System.out.println("-----------------------");

        String[] name = {"김석진", "정호석"};
        for (String e : name){         // 배열에서 데이터를 하나씩 뺀 후 저장할 변수 : 반복할 배열
            System.out.println(e);
        }


        System.out.println("-----------------------------");

        double[] arr2 = {1.0,1.2,2.5};

        for (double a : arr2){
            System.out.println(a);
        }

        System.out.println("-----------------------");

        String[] arr3 = {"드라마","영화","만화"};
        for (String e : arr3){
            System.out.println(e);
        }


    }
}
