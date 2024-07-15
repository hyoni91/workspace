import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

const BoardList = () => {
  const navigate = useNavigate();

  //axios로 받아 온 게시글 리스트인 data를 저장할 변수(통상적으로 state 변수로 만든다)
  const [boardList, setBoardList] = useState([]);

  //게시글 목록 데이터 받기
  useEffect(()=>{
    //서버에서 데이터 받기
    axios
    .get('/boardList')  //데이터를 가져올 URL작성
    .then((res)=>{
      console.log('axios success')
      setBoardList(res.data);  // state함수로 값을 바꾸면 재랜더링 된다 --> effect도 실행된다...
    }) //데이터 조회 후 실행할 내용(response 응답 : 통신 결과 모든 정보가 담긴 객체)
    .catch((error)=>{
      console.log('axios error')
      console.log(error)
    }); // 오류 발생 시 실행할 내용(error : 오류에 대한 모든 정보가 담긴 객체)
  },[]);

  return(
    <>
      <h2>게시글 목록</h2>
      <table className="list-table">
        <colgroup>
          <col width={'15%'}/>
          <col width={'20%'}/>
          <col width={'*'}/>
          <col width={'25%'}/>
        </colgroup>
        <thead>
          <tr>
            <td>글번호</td>
            <td>제목</td>
            <td>작성자</td>
            <td>작성일</td>
          </tr>
        </thead>
        <tbody>
          {
            boardList.map((board,i)=>{
              return(
                <tr key={i}>
                  <td>{board.boardNum}</td>
                  <td><span className="title-sp">{board.boardTitle}</span></td>
                  <td>{board.boardWriter}</td>
                  <td>{board.createDate}</td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
      <button className="write-btn" type="button" onClick={()=>{
        navigate('/insertBoard')
      }}>작성하기</button>
    </>

  )

}


export default BoardList;