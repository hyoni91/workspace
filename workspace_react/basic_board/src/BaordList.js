import { useNavigate } from "react-router-dom";
import './BaordList.css'

const BaordList = ({data})=>{
  const navigate = useNavigate();

  return(
    <div className="list">
      <h2>게시판목록</h2>
      <table className='list-table'>
        <colgroup>
        <col width='15%'/>
        <col width='*'/>
        <col width='25%'/>
        <col width='15%'/>
        </colgroup>
      <thead>
      <tr>
        <td>글번호</td>
        <td>제목</td>
        <td>작성자</td>
        <td>작성일</td>
      </tr>
      </thead>
    {
      data.map((item , i)=>{
        return(
        <tbody key={i} className="listBody">
          <tr>
            <td >{item.boardNum}</td>
            <td><span className="detailbtn" onClick={(e)=>{
              navigate(`/detail/${item.boardNum}`)
            }} >{item.title}</span></td>
            <td>{item.writer}</td>
            <td>{item.createDate}</td>
          </tr>
        </tbody>
        )
      })
    }
      </table>
      <span className="btn1">
        <button type="button" onClick={(e)=>{
          navigate(`/writeForm`)
        }}>글쓰러 가기</button>
      </span>
    </div>
  )
}

export default BaordList;