package com.green.Board.vo;


//페이징 처리를 위한 모든 정보를 갖는 클래스
// *데이터 = 게시글을 의미함

import lombok.Data;
import lombok.ToString;

@Data
public class PageVO {

    //전체 게시글의 데이터 수
    private int totalDataCnt;

    //한 페이지에 보여지는 데이터 수
    private int displayDataCnt;

    //전체 페이지 수
    private int totalPageCnt;

    //현재 페이지
    private int nowPageNo;

    //한 화면에 보여지는 페이지 수
    private int displayPageCnt;

    //화면에 보이는 시작 페이지
    private int startPageNo;

    //화면에 보이는 마지막 페이지
    private int endPageNo;

    //prev 버튼의 유무
    private boolean prev;

    //next 버튼의 유무
    private boolean next;



    /*생성자 (필요한 값 초기화 시키기)*/
    public PageVO(int totalDataCnt) {
        this.nowPageNo = 1; //첫 페이지는 무조건 1번 페이지로 설정
        this.displayPageCnt = 5;  //한 화면에 나타내는 페이지의 수 (data아님)
        this.displayDataCnt = 5;  //한 화면에 나타내는 데이터(글) 수
        this.totalDataCnt = totalDataCnt;  // 매개변수 totalDataCnt는 DB에서 조회한 전체 데이터 수
    }


    /*모든 페이지 정보를 세팅하는 메서드*/
    public void setPageInfo(){
        //화면에 보이는 마지막 페이지 구하기
        //해설) 현재 페이지/화면에 보이는 페이지수의 값을 올림 --> 다시 화면에 보이는 페이지 수로 곱함
        endPageNo = (int)Math.ceil((nowPageNo / (double)displayPageCnt)) * displayPageCnt;

        //화면에 보이는 시작 페이지 구하기
        //해설) 5-5+1 = 1 ,   10-5+1 = 6 ,,,
        startPageNo = endPageNo - displayPageCnt + 1 ;

        //전체 페이지 수
        // 전체 데이터를 한 페이지의 데이터 수로 나눈후, 짜투리는 +1 (올림)
        totalPageCnt =  (int)Math.ceil(totalDataCnt/(double)displayDataCnt);

        //endPageNo 값이 totalPageCnt를 넘기게 된 경우, totalPageCnt로 값을 변경
        if(endPageNo > totalPageCnt){
            endPageNo = totalPageCnt;
        }

        //prev 버튼 유뮤 (startPageNo이 1이 아니면 true)
        prev = startPageNo != 1;

        //next 버튼 유무
        next = endPageNo != totalPageCnt;
    }



}
