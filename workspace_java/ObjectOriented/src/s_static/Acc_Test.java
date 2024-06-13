package s_static;

public class Acc_Test {
    public static void main(String[] args) {

        Account account1 = new Account("12121-000",10000);
        Account account2 = new Account("12121-001",100000);
        Account account3 = new Account("12121-002",80000);
        Account account4 = new Account("12121-003",90000);
        Account account5 = new Account("12121-004",110000);
        System.out.println(account1); // 객체 이름만 넣어서 출력하면 .toString() 출력

        //모든 객체의 이율을 바꾸려면? 7.0 -> 10.0
        Account.iyul = 10.0;  //초기값은 냅두고 여기서 바꾸자잉 (데이터 변화) 모든 데이터를 만지기때문에, 사용위험을 생각해야함.
        System.out.println(account1);  //바꾼 후 출력
    }
}
