import javax.sound.midi.Soundbank;
import java.util.Optional;

public class Optional_2 {
    public static void main(String[] args) {

        Optional<String> op = Optional.of("방탄");

        //ifPresent() : 데이터가 존재할 때 내용을 실행하고 데이터가 없으면 아무일도 일어나지 않음
        //매개변수 : Consumer<T> --> T타입의 자료형 매개변수를 받음 / 리턴타입 없음 / 데이터만 전달하는 기능을 가진다.
        op.ifPresent(str->{
            //op안에 데이터가(문자열) 있으면 출력해줘
            System.out.println(str);
            //출력 결과 : 방탄
        });



    }
}
