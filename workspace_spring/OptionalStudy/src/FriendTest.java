import jdk.jfr.Frequency;

import java.util.Map;
import java.util.Optional;

public class FriendTest {
    public static void main(String[] args) {

        Friend friend = new Friend("타타",
                        new Company("bt21",
                        new ContactInfo("010-1111-1111",null)));

        //옵셔널 객체 생성
        //옵셔널 출력
        System.out.println("-------옵셔널방식-------");
        Optional<Friend> opFriend = Optional.ofNullable(friend); //friend가 null인지 판단
        optionalPrint(opFriend);

        //기존방식 출력
        System.out.println("-------기존방식-------");
        originPrint(friend);  // 출력 결과 : 타타행성



    }




    //친구의 주소를 출력
    //static : 연습용으로 인해 쓴거임 의미없음

    //옵셔널 사용 코드
    public static void optionalPrint(Optional<Friend> opFrien){

      String result = opFrien.map(friend->{ return friend.getCompany().getContactInfo().getAddr();}).orElse("주소정보가 없습니다.");

        //map()은 리턴값을 다시 옵셔널에 넣어주기 때문에 몇번이고 다시 map을 돌릴 수 있다.
       String addr = opFrien.map(friend->friend.getCompany()) //Company객체로 반환
                .map(company -> company.getContactInfo()) //Contact객체로 반환
                .map(contactInfo -> contactInfo.getAddr()) //String객체로 반환
                .orElse("주소정보가 없습니다.");

        System.out.println("result : "+ result);
        System.out.println("addr : " + addr);

    }



    //기존 방식 코드
    public static void originPrint(Friend friend){
        String addr = null;

        if(friend != null){
            Company company = friend.getCompany();
            if(company != null){
                ContactInfo contactInfo = company.getContactInfo();
                if(contactInfo != null){
                    addr = contactInfo.getAddr();
                }
            }
        }

        //최종적으로 친구 주소 출력 및 null 일때 처리
        if(addr != null){
            System.out.println(addr);
        }else {
            System.out.println("주소정보가 없습니다.");
        }

    }



}
