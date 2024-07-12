import { useNavigate, useParams } from "react-router-dom";
import './Detail.css'

const Detail = ({data, setBoard}) => {
  let {boardNum} = useParams();
  const navigate = useNavigate();
  let index = 0;

  data.forEach((board ,i)=>{
    if(board.boardNum == boardNum){
      index = i;
      console.log(i)
    }
  })

  const goDelete = (index) => {
    const newBoard = [...data];
        newBoard.slice(index, 1)
        setBoard(newBoard);
      }  
 

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
          goDelete(index)
          navigate('/')
        }}>삭제하기</button>
      </div>
    </div>
  )

}

export default Detail;