package class_basic.car;

//접근제한자 : 클래스, 메서드, 멤버변수에서 사용

/*[접근제한자 종류]
* public : 프로젝트 내에 존재하면 접근 가능
* default : 같은 패키지 내에 있으면 접근가능
* protected : pass(상속에서 만나요)
* private : 변수, 메서드가 선언된 클래스 안에서만 접근가능

* */




//멤버변수에는 무조건 private!
//method 는 무조건 public!

public class Phone {
    private int price;
    public String modelName;    // 퍼블릭 연습
    String brand;   //default 는 현재쓰고 있는 것임, 따로 앞에 적어주지 않아도 디폴드값!

    //생성자
    public Phone(){
        this.price = 0;
        this.modelName = "알수없음";
    }


    public void setPrice(int price){
        if(price <0){
            this.price=0;
        }else {
            this.price = price;
        }


    }
}
