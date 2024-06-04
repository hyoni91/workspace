package 다섯째_반복문.For;

//출력문을 한번만 사용하여 ‘2 4 6 8 10’을 출력

public class Test3 {
    public static void main(String[] args) {

        for (int i =2; i < 11; i = i+2){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("--------------------------------");

        for(int i =2; i <11; i++){
            if (i%2==0){
                System.out.print(i + " ");
            }
        }

    }
}
