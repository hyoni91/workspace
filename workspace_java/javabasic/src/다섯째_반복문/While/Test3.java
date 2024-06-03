package 다섯째_반복문.While;

//출력문을 한번만 사용하여 ‘2 4 6 8 10’을 출력하되, while문을 사용하여라.

public class Test3 {
    public static void main(String[] args) {

        int i = 2;

        while (i <=10){
            if(i % 2 ==0){
                System.out.println(i);
            }
            i++;
        }

    }
}
