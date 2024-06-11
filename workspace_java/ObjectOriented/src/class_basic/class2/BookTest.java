package class_basic.class2;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("가나다라마","김선생",50000);
        Book book2 = new Book("히로인","나나나",15000);
        Book book3 = book1;  //주소지복사

        System.out.println(book1.title);
        System.out.println(book3.title);

        System.out.println("-------------------");

        book1.title = "아에이오우";
        System.out.println(book1.title);
        System.out.println(book3.title);

    }

}
