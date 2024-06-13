package s_static;

//예금 이율 : 7%
public class Account {
    String accNum; //계좌
    int money; //예금
    static double iyul; //이율 (공용, 모두 같은 값을 가질거야)

    public Account(String accNum, int money){
        this.accNum = accNum;
        this.money = money;
    }

    static {
       iyul = 7.0;
    }

    //어카운트 클래스의 정보를 출력하기 위한 메서드
    @Override
    public String toString() {
        return "Account{" +
                "accNum='" + accNum + '\'' +
                ", money=" + money +
                ", iyul=" + iyul +
                '}';
    }
}
