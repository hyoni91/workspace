package collection.list;

/*사원 관리 프로그램을 만들어보자. 사원을 클래스로 만들어야 하고,
사원은 사번(정수), 이름, 부서명, 연락처, 월급의 데이터가 있다. EmpService라는 클래스를 만들고,
아래의 문제를 해결하기 위한 메소드는 스스로 판단하여 만들어보자. */

public class Employee {
    int empNum;
    String name;
    String partName;
    String empPhoneNum;
    int salary;

    public Employee(int empNum, String name, String partName, String empPhoneNum, int salary) {
        this.empNum = empNum;
        this.name = name;
        this.partName = partName;
        this.empPhoneNum = empPhoneNum;
        this.salary = salary;
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getEmpPhoneNum() {
        return empPhoneNum;
    }

    public void setEmpPhoneNum(String empPhoneNum) {
        this.empPhoneNum = empPhoneNum;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
