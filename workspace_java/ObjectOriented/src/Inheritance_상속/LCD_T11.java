package Inheritance_상속;

//빈칸에 적절한 한 줄의 코드를 삽입하라.

class LCD {
    int size;
    public LCD(int n){
        size = n;
    }
}
//클래스 간의 결합도는 낮고, 응집도는 높은 코드(클래스)가 좋은 코드

class ColorLCD extends LCD{
    int colorSize;

    public ColorLCD(int colorSize, int size){
        //ColorLCD 매개변수 int size 초기값으로 설정해 줘야함 ; 밑에 코드가 힌트
        super(size);//문제의 빈칸 (LCD 클래스의 size변수 값을 초기화 코드 ) // this.size = size;(본래 size는 슈퍼클래스에서 초기값 설정하는 것이 좋음)
        this.colorSize = colorSize;
    }
}

/*
해석
ColorLCD
1.LCD 의 size =n 5일경우
ColorLCD -> super(5)
2.this.colorSize = colorSize ()
*/
