package class_basic.manager;


//1. 회사명, 부서명, 급여의 데이터를 갖는 WorkInfo 클래스를 만들어보자. 필요한 메소드는 마지막에 제시할 결과예시를 참고하여 동일하게 나오도록 구성하면 된다.
public class WorkInfo {

    String companyName;
    String partName;
    int salary;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
