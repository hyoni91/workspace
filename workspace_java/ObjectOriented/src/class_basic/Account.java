package class_basic;

/*
    좋은 클래스의 조건
    1. 멤버변수를 초기값으로 설정하기 "null"이라도 직접 입력해두기
    2. 초기값 설정은 멤버변수의 선언과는 별도로 진행  (선언과 동시에 하지 않기!)
    3. 모든 변수의 값을 초기화 하는 메서드를 만들기

    생성자 : 선언한 변수 값을 초기화
            public 클래스명(){}

   클래스 안에는 반드시 생성자가 존재해야한다!
   만약 클래스 안에 생성자를 한번도 선언하지 않았을 경우, 눈에 보이지 않는 기본 생성자를 자동으로 만들어준다.
   (다만, 내용과 매개변수도 없음
    ex,   public Account(){  } )

   생성자는 여러개 만들 수 있음.

 */


public class Account {
    String accNumber;
    String owner;
    int money;


    public Account(){
        accNumber = "미정";
        owner = "미정";
        money = 10000;
    }

    public Account(int c ){  //메서드 오버로딩으로 생성자를 또 만들 수 있음
        money = c;
    }


    public void setAccount(String accNumber, String owner, int money) {
//        accNumber = accNumber;  //매개변수 : 매개변수;로 인식함
        this.accNumber = accNumber;  //위의 문제를 해결하기 위해서, this.사용
        this.owner =owner;  //this -> 이 클래스에서 선언한 owner
        this.money = money;

    }

    public void printAccount() {
        System.out.println("계좌번호: " + this.accNumber);  //this. (생략)
        System.out.println("계좌주: " + owner);
        System.out.println("예금액: " + money);
    }
}



//모든 변수의 값을 초기화(최초의 값이 세팅) 하는 메서드
//실행미스, 중복사용 등 초기화의미 퇴색될 가능성이 높아서 안씀!
//public void initAccount(){
//     accNumber = "미정";
//     owner = "미정";
//     money = 10000; //예금액
//}