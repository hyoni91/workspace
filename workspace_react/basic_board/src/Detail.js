import { useNavigate, useParams } from "react-router-dom";
import './Detail.css'

const Detail = ({data}) => {
  let {boardNum} = useParams();
  const navigate = useNavigate();
  
  //글 번호와 일치하는 리스트번호(요소)
  let index = 0;

  data.forEach((board ,i)=>{
    if(board.boardNum == boardNum){
      index = i;
    }
  })


  return(
    <div className='detail'>
      <h2>상세페이지</h2>
      <table className="detail-table">
        <tr>
          <td>글번호</td>
          <td>{data[index].boardNum}</td>
          <td>작성자</td>
          <td>{data[index].writer}</td>
          <td>작성일</td>
          <td>{data[index].createDate}</td>
        </tr>
        <tr>
          <td>제목</td>
          <td colSpan={5}>{data[index].title}</td>
        </tr>
        <tr>
          <td>내용</td>
          <td colSpan={5}>{data[index].content}</td>
        </tr>
      </table>
      <div className="btn">
        <button type="button" onClick={(e)=>{
          navigate(`/`)
        }}>뒤로가기</button>
        <button type="button" onClick={(e)=>{ 
          //게시글 목록 필요
          //삭제할 게시글의 글 번호 필요
          //스플라이스는 좋은 코드는 아님 (??)
          data.splice(index,1)   //(요소에서 몇 번째, 몇개?)
          navigate('/')
        }}>삭제하기</button>
      </div>
    </div>
  )

}

export default Detail;