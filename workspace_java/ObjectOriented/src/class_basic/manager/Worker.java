package class_basic.manager;

//1. 이 클래스는 데이터로 PersonInfo와 WorkInfo클래스를 갖는다.


public class Worker {

    //디폴트라서 같은 패키지내 사용가능?
    PersonInfo personInfo = new PersonInfo();
    WorkInfo workInfo = new WorkInfo();

    public void setInfo(String name, int age, String addr){
        this.personInfo.name = name;
        this.personInfo.age = age;
        this.personInfo.addr = addr;

    }

    public void setWorkInfo(String companyName, String partName, int salary ){
        this.workInfo.companyName = companyName;
        this.workInfo.partName = partName;
        this.workInfo.salary = salary;
    }

    public void displayWoker(){
        System.out.println("이름 : " + personInfo.name );
        System.out.println("나이 : " + personInfo.age );
        System.out.println("주소 : " + personInfo.addr );
        System.out.println("회사명 : "+ workInfo.companyName);
        System.out.println("부서 : "+ workInfo.partName);
        System.out.println("급여 : "+ workInfo.salary);
    }
}
