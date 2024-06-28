
// 정수 6개 저장하는 배열 만들고, 배열 요소에 1-46 사이의 난수를 저장 (중복값 허용/ 46 미포함)
//배열에 난수를 저장하고 출력하기  (Test2)
public class Test2 {

    public static void main(String[] args) {

        int[] arr = new int[6];

        for(int i =0; i < arr.length; i++){
            int ramdom = (int) (Math.random()*46);
            arr[i] = ramdom;
        }

        for(int ram : arr){
            System.out.println(ram);
        }
    }

}
