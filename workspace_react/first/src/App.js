import logo from './logo.svg';
import './App.css';

function App() {
  return (
    // jsx 코드 -> html아니야~
    <div className="App">
      {/* 함수 사용 (꺽새안에! 태그처럼!) */}
      <MyTable></MyTable>
      <MyTable></MyTable>
      <MyTable></MyTable>
      <MyTable></MyTable>
    </div>
  );
}

// 자주 쓰는 디자인, 코드를 함수로 만들 수 있음
// 재사용이 용이하기 때문에 좋음!
// 이러한 함수를 '컴포넌트'라 함
function MyTable(){
  return(
    <table border={1}>
    <tr>
      <td>이름</td>
      <td>나이</td>
    </tr>
  </table>
  );
}

export default App;
