package collection.list;

import com.sun.source.tree.CaseTree;

import java.util.List;
import java.util.Scanner;

public class EmpService extends Employee {
    Scanner sc;
    String pw;

    public EmpService(String empNum, String name, String partName, String empPhoneNum, int salary, String pw) {
        super(empNum, name, partName,empPhoneNum,salary);
        sc = new Scanner(System.in);
        this.pw =pw;
    }
    /*사원 프로그램에 로그인하는 메소드를 구현하여라.
    메소드를 호출하면 아래와 같은 결과가 나와야한다. */
    public void login(){
        String empNo;
        String pw ;

        // for문으로 해야하므로 틀렸다규
        while (true) {
            System.out.print("사번: ");
            empNo = sc.next();
            System.out.print("비밀번호: ");
            pw = sc.next();
            if (empNo.equals(empNo) && this.pw.equals(pw)) {
                System.out.println("로그인 하였습니다.");
                System.out.println(getName() + "님 반갑습니다.");
                break;
            } else {
                System.out.println("비밀번호 또는 사번이 일치하지 않습니다.");
            }
        }
   }

    //키보드로 입력받은 받은 부서의 월급 정보를 출력하는 메소드를 구현하여라.
    //(부서명을 잘못 입력 받는 경우는 없다고 가정한다)


   public void printSalary(List<EmpService> emp){

        int sum = 0;
       int avg =0;
        System.out.print("부서명: ");
        String partName = sc.next();

        System.out.println("==개발부 월급 현황==");
        for(EmpService e : emp){
            System.out.println("이름: " +e.getName()+ " 월급: "+ e.getSalary());
            sum = sum + e.getSalary();

        } avg = sum / emp.size();
        System.out.println("개발 부서의 월급 총액은 "+ sum + "이며, 평균 급여는"+ avg + " 원입니다." );
    }

    /*키보드로 입력받은 부서에 소속된 모든 사원의 월급을 인상하는 메소드를 구현하여라.
    (부서명을 잘못 입력 받는 경우는 없다고 가정한다)

        부서명 : 개발부
        인상급여 : 1000
        개발부 각 사원의 급여가 각각 1000원씩 인상됩니다.
        ==월급 인상 후 개발부 월급 현황==
        이름 : 홍길동  월급 : 2000
        이름 : 김길동  월급 : 3000
        이름 : 최길동  월급 : 3000

        */

    public void upSalary(List<EmpService> emp){

        int up = 100000;
        System.out.print("부서명: ");
        String partName = sc.next();
        System.out.println(partName+" 각 사원의 급여가 각각"+ "인상급여 "+ up +"원씩 "+ "인상됩니다.");
        System.out.println(" ==월급 인상 후 개발부 월급 현황==");
        for(EmpService e : emp) {
            System.out.println("이름 : " + e.getName() + " 월급 : " + (e.getSalary() + up));
        }
    }

}









//    public void printSalary(EmpService[] emp){
//        System.out.print("부서명: ");
//        String partName = sc.next();
//
//        System.out.println("==개발부 월급 현황==");
//        for(EmpService e : emp){
//            System.out.println("이름: " +e.getName()+ " 월급: "+ e.getSalary());
//        }
