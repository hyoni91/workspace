package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpService_answer {
    private List<Employee> empList;  //생성은 생성자에서
    private Scanner sc;


    //생성자로 리스트 생성
    public EmpService_answer() {
        this.empList = new ArrayList<>();
        this.sc = new Scanner(System.in);
        Employee e1 = new Employee("1001","KIM","개발부","010-1231-1111",20000);
        Employee e2 = new Employee("1002","KIM","인사부","010-8111-1222",30000);
        Employee e3 = new Employee("1003","LEE","개발부","010-1531-1333",25000);
        Employee e4 = new Employee("1004","NAM","영업부","010-7231-1444",40000);
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
    }



    //사번, 비번
    public void login_answer(){
        boolean isRunnig = true;
        boolean isFind = false ;  // 아이디와 사원을 찾으면 빠져나오기

        while (isRunnig){
            System.out.print("사번: ");
            String empNum = sc.next();
            System.out.print("비밀번호(연락처 마지막 4자리): ");
            String pw = sc.next();
            //입력한 사번과 비번의 일치여부
            for(Employee e : empList){
                if(e.getEmpNum().equals(empNum) && e.getPw().equals(pw)){
                    isRunnig = false; //while문 벗어남
                    System.out.println("로그인 하였습니다.");
                    System.out.println(e.getName() + "님 반갑습니다.");
                    isFind = true; //
                }
                // else 를 넣으면 안됨 :  반복문 안에 있으면 여러번 출력 되므로 for 문 안에 넣으면 안됨
                }
            if(!isFind) {  //isfind가 거짓 (!)일때만 실행    (! 부정연산자)
                System.out.println("사번 또는 비밀번호가 일치하지 않습니다.");  //못 찾았을때만 나와야함!!!
            }

        }
        }

        public void printDeptMoney(){
            System.out.print("부서명: ");
            String dept = sc.next();

            int sum =0;
            int cnt = 0;
            System.out.println("=="+ dept +"월급 현황==");
            for (int i = 0; i < empList.size(); i++){
                if(empList.get(i).getPartName().equals(dept)){
                    System.out.println(empList.get(i).toString());
                    sum = sum + empList.get(i).getSalary();
                    cnt++;    //해당 부서의 인원 수
                }
            }
            System.out.println(dept + "의 월급 총액은 " + sum + "원이며, 평균 급여는 "+ (sum/(double)cnt) + "원입니다.");

        }

        public void increaseSalary(){
            System.out.print("부서명: ");
            String dept = sc.next();
            System.out.print("인상급여: ");
            int money = sc.nextInt();

            System.out.println(dept + "각 사원의 급여가 각각 " +  money + "원씩 인상됩니다.");

            //급여인상코드
            for(Employee e : empList){
                if(e.getPartName().equals(dept)){
                    e.setSalary(e.getSalary()+money);
                }
            }
            //인상된 사원 정보 출력
            System.out.println("==월급 인상 후 개발부 월급 현황==");
            for (Employee e : empList){
                if(e.getPartName().equals(dept)){
                    System.out.println(e);
                }
            }
        }
    }


