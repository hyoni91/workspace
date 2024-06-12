package Inheritance_상속;


class A1 {


    private int x;
    private int y;

    public A1() {
        x = 1;
        y = 1;
    }

    public A1(int x) {
        this.x = x;
        y=1;
    }

    public A1(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    public int getX() {
//        return x;
//    }

    public int gety() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void disp() {
        System.out.print("x=" + x + ", " + "y=" + y);
    }
}

    class B1 extends A1 {
        private int x;
        private int y;

        public B1() {
            x = 1;
            y = 1;
        }

        public B1(int a) {
            super(a);
            this.x = 1;
            this.y = 1;
        }

        public B1(int a, int b) {
            super(a);
            setY(b);
            this.x = 1;
            this.y = 1;

        }

        public B1(int a, int b, int c) {
            super(a);
            setY(b);
            this.x = c;
            this.y=1;
        }

        public B1(int a, int b, int c, int d) {
            super(a);
            setY(b);
            this.x = c;
            this.y = d;
        }

        public void disp() {
            super.disp();
            System.out.println(", x=" + x + ", " + "y=" + y);
//            System.out.println("x=" + getX() + ", " + "y=" + gety() + ", " + "x=" + x + ", " + "y=" + y);
        }
    }



public class Work_T4 {
    public static void main(String[] ar) {
        B1 bp = new B1();
        B1 bp1 = new B1(10);
        B1 bp2 = new B1(10, 20);
        B1 bp3 = new B1(10, 20, 30);
        B1 bp4 = new B1(10, 20, 30, 40);


        bp.disp(); // x=1, y=1, x=1, y=1
        bp1.disp();//x=10, y=1, x=1, y=1
        bp2.disp();//x=10, y=20, x=1, y=1
        bp3.disp();//x=10, y=20, x=30, y=1
        bp4.disp();//x=10, y=20, x=30, y=40
    }

}
