package 세번째_연산자;

// 534자루의 연필을 30명의 학생들에게 똑같이 나누어 주었을 때,  학생당 몇 개씩 가질 수 있고, 최종적으로 몇개가 남을까요? 빈칸에 코드를 작성하시오.

public class 초등산수문제 {
    public static void main(String[] args) {

        int pencils = 534;
        int students = 30;

        int pencilsPerStudent = pencils / students;
        int pencilsLeft = pencils % students;

        System.out.println(pencilsPerStudent );
        System.out.println(pencilsLeft);

    }
}
