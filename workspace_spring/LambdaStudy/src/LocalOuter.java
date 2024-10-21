public class LocalOuter {
    private String content;

    public LocalOuter(String content){
        this.content = content;
    }

    //이곳에는 인터페이스형을 리턴해야함
    public Printable getPrinter(){

        //익명에서 람다로의 변환
        //매개변수목록 (매개변수 / 없으면 생략가능)->{실행문;};
        Printable p2 = () -> {System.out.println(111);};

        return p2;
    }





}



