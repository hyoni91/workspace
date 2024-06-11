package class_basic.calculator;

import java.util.Scanner;

public class Cal_2_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        String oper;

        System.out.print("첫 번째 수 : ");
        a = sc.nextInt();
        System.out.print("두 번째 수 : ");
        b = sc.nextInt();
        System.out.print("연산자 : ");
        oper = sc.next();

        //switch 문은 ()안에 변수명!!!
        switch (oper){
            case "+":Add add = new Add();
                        add.setValue(a,b);
                System.out.println(a+oper+b+" = "+ (add.calculator()));
                break;
            case "-": Sub sub = new Sub();
                        sub.setValue(a,b);
               System.out.println(a+oper+b+" = "+ (sub.calculator()));
               break;
            case "*": Mul mul = new Mul();
                        mul.setValue(a,b);
                System.out.println(a+" "+oper+" "+b + " = "+ (mul.calculator()));
                break;
            case "/": Div div = new Div();
                        div.setValue(a,b);
                System.out.println(a+" "+oper+" "+b + " = "+ (div.calculator()));
                break;
            default:
                System.out.println("연산자를 잘못 입력했습니다.");

        }

    }
}
