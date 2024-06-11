package class_basic.class2;

public class Book {
     String title;
    private String writer;
    private int price;


    public Book(){
        this.title = "";  //매개변수(동일이름 ex:String title)이 없어서 this 생략가능
        this.writer = "";
        this.price = 0;
    }

    //생성자 자동완성 (Generate - Constructor)
    public Book(String title, String writer, int price) {
        this.title = title;
        this.writer = writer;
        this.price = price;
    }


}
