package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpTest {
    public static void main(String[] args) {

        EmpService emp = new EmpService(123,"kjs","개발부","010-123-4567",5000000,"1234");
        EmpService emp2 = new EmpService(222,"kkk","개발부","010-111-2222",3000000,"112233");



        List<EmpService> employees= new ArrayList<>();

        employees.add(emp);
        employees.add(emp2);
        emp.login();

        emp.printSalary(employees);
        emp.upSalary(employees);

    }

}




//        EmpService[] e = new EmpService[2];
//        e[0] =emp;
//        e[1] =emp2;
//
//        emp.printSalary(e);