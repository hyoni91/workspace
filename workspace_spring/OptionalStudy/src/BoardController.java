import java.util.List;
import java.util.Optional;

public class BoardController {
    private BoardServiceImpl boardService;

    public BoardController() {
        this.boardService = boardService;
    }

    //게시글 목록 데이터 조회
    public List<BoardVO> boardList(){
       Optional<List<BoardVO>>  opBoardList = boardService.getBoardList();
       return opBoardList.get();
    }

    //게시글 상세 정보 조회
    public BoardVO boardDetail(){
        Optional<BoardVO> detail = boardService.getBoardDetail(0);

        detail.ifPresentOrElse(
                (board)->{
                    System.out.println("게시글 제목 : " + board.getTitle());
                },
                ()->{
                    System.out.println("해당 게시글 존재하지 않습니다.");
                }
        );

        return detail.get();
    }
}
