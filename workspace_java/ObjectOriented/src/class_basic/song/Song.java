package class_basic.song;

//아래의 조건을 보고 노래를 나타내는 Song 클래스를 만들어 보세요.
// Song 클래스는 다음과 같은 필드를 갖는다.
//  - 노래 제목을 나타내는 title / - 가수를 나타내는 artist
//  - 노래가 속한 앨범 제목을 나타내는 album /   - 노래가 발표된 연도를 나타내는 year
//  - 노래의 작곡가를 나타내는 composer, 단 작곡가는 3명이라고 간주한다.


import java.util.Arrays;

public class Song {
    String title;
    String artist;
    String album;
    String year;
    String[] composer;




    //모든 필드를 초기화하는 메소드와 노래의 정보를 출력하는 메소드를 만드세요.

    public void setSong(String setTitle, String setArtist, String setAlbum, String setYear, String[] setComposer){
        title = setTitle;
        artist = setArtist;
        album = setAlbum;
        year = setYear;
        composer = setComposer;
        }

    public void songInt(){
        System.out.println("가수명: "+ artist);
        System.out.println("타이틀명: "+ title);
        System.out.println("앨범제목: "+ album);
        System.out.println("발표연도: "+ year);
        System.out.println("작곡가: " + Arrays.toString(composer)); //배열 출력은 이름만으로 안됨!!!!!

////        배열 출력 또다른 방법 for each, 하지만 null 값이기 때문에 길이를 알 수가 없음, 오류가 남
//        for(String e : composer){
//            System.out.print("작곡가: " + e +" ");
//        }

    }

    }





