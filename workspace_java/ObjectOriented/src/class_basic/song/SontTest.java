package class_basic.song;

//그리고 프로그램이 잘 돌아가는지 확인해 보세요.

public class SontTest {
    public static void main(String[] args) {

        Song newSong = new Song();
        newSong.songInt();

        newSong.setSong(
                        "달려",
                        "방탄",
                        "세븐",
                        "2020",
                        new String[]{"피독","피독2","피독3"});

        newSong.songInt();

        System.out.println("-------------------------------------");

        //배열 또다른 방법
        Song newSong2 = new Song();
        String[] newComposer = {"피","김","이"};

        newSong2.setSong(
                "아이돌",
                "bts",
                "골든",
                "2023",
                newComposer);

        newSong2.songInt();



    }
}
