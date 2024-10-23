import java.util.Optional;

public class Optional_5 {
    public static void main(String[] args) {

        //MemberVO객체 생성
        MemberVO member = new MemberVO("알제이",3);
        //Optional 객체 생성
        Optional<MemberVO> op1 = Optional.of(member);


        //회원 정보가 null이 아니면, 회원의 이름을 출력
        //IF 사용하면?
        if(member != null){
            System.out.println(member.getName());
        }
        //Optional 사용하면?
        //변수명 중복되면 안됨! 변수 'm'은 옵셔널 op1 안의 데이터를 말함
        op1.ifPresent((m)->{
            System.out.println(m.getName());
        });


        //ifPresentOrElse(): 데이터 있을때와 없을때의 작업 모두 작성
        //첫번째 매개변수 : Consumer<T> -> void x(T t)  데이터가 존재할 때
        //두번째 매개변수 : Runnable<T> -> void run()  데이터가 null일 때 (if else 대체)
        op1.ifPresentOrElse(
                //데이터 있을때
                m->{
                    System.out.println(m.getName());
                },
                //Null일 때
                ()->{
                    System.out.println("회원의 이름 정보 없음");
                }
        );

    }
}
