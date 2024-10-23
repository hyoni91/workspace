import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BoardServiceImpl {

    private List<BoardVO> boardList;

    public BoardServiceImpl(){
        boardList = new ArrayList<>();
        boardList.add(new BoardVO(1,"첫번째글"));
        boardList.add(new BoardVO(2,"두번째글"));
        boardList.add(new BoardVO(3,"세번째글"));
        boardList.add(new BoardVO(4,"네번째글"));
    }


    //게시글 목록 조회
    public Optional<List<BoardVO>> getBoardList(){
        //List<BoardVO> list = return sqlSession.selectList("");
        //위의 코드를 작성했다고 가정
        List<BoardVO> list = boardList;
        return  Optional.ofNullable(list);
    }


    //해당 게시글 상세페이지 조회
    public Optional<BoardVO> getBoardDetail(int index){
        //MemberVO member = sqlSession.selectOne("",boardNum);
        //return member;
        BoardVO board = boardList.get(index);
        return Optional.of(board);  // 근데 이건 NULL처리 필요 없음! 상세정보는 무조건 데이터가 있기때문에..
    }

}



class BoardVO{
  private int boardNum;
  private String title;

    public BoardVO(int boardNum, String title) {
        this.boardNum = boardNum;
        this.title = title;
    }

    public int getBoardNum() {
        return boardNum;
    }

    public String getTitle() {
        return title;
    }

    public void setBoardNum(int boardNum) {
        this.boardNum = boardNum;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}