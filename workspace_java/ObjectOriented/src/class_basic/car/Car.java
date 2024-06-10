package class_basic.car;


//Car 클래스는 현실세계에서의 자동차를 class로 표현한 것이다. 다음 문제를 읽고 Car 클래스를 완성해 보세요. (6 ~ 8)

//6. 자동차는 제조사, 차이름, 차량번호, 가격, 소유주의 속성을 가지고 있다. 이 속성을 가진 Car 클래스를 선언해 보세요.
public class Car {

    String brand;
    String modelName;
    String carNumber;   //문자열로 추천(연산을 하지 않기 때문에   ex.주민번호)
    int price;
    String owner;



    //자동차의 속성 하나하나를 각각 변경하는 메소드들을 만들어보세요.
    public void setBrand(String carBrand){
        brand = carBrand;   //  brand= 매개변수로 받기 (필요한 데이터가 정해지지 않았으면 매개변수로!)
    }

    public void  setModelName(String carModelName){
        modelName = carModelName;
    }

    public void setCarNumber(String carNum){
        carNumber = carNum;
    }

    public void setPrice(int carPrice){
        price = carPrice;
    }

    public void setOwner(String carOwner){
        owner = carOwner;
    }

    //자동차의 속성을 출력하는 메소드를 만들고, 새로운 클래스를 만들어 7,8번에서 만든 메소드가 잘 동작되는지 확인하세요.

    public void carInto(){
        System.out.println("소유주 : "+ owner);
        System.out.println("차이름 : "+ modelName);
        System.out.println("차량번호 : "+ carNumber);
        System.out.println("제조사 : "+ brand);
        System.out.println("가격 : "+ price);

    }

}
