package class_basic.manager;

//1. 이 클래스는 데이터로 PersonInfo와 WorkInfo클래스를 갖는다.


public class Worker {

    PersonInfo personInfo = new PersonInfo();
    WorkInfo workInfo = new WorkInfo();


    public void setInfo(String name, int age, String addr){
        personInfo.setName(name);
        personInfo.setAge(age);
        personInfo.setAddr(addr);
    }

    public void setWorkInfo(String companyName, String partName, int salary ){
        workInfo.setCompanyName(companyName);
        workInfo.setPartName(partName);
        workInfo.setSalary(salary);
    }

    public void displayWoker(){

    }
}

