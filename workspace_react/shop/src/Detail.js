import { useParams } from 'react-router-dom';
import './Detail.css';

// return문은 하나의 태그에 감싸져 있어야한다!!!!!
const Detail = ({item})=>{
  //URL로 전달되는 데이터 받기
  // useParams는 객체!!!
  // const params = useParams();
  // console.log(params.id)

  // 이렇게 받을 수도 있음!!!
  let {id} = useParams();
  let index = 0;

    item.map((book , i)=>{
      if(book.bookNum == id){
        index = i
      }
    })
  
  return(
  
    <div className='datail'>
      <div>
        <div className='detail-div'>
          <div>
            <img src={process.env.PUBLIC_URL +'/' + item[index].imgName}/>
          </div>
            <div>
              <h3>{item[index].bookName}</h3>
              <p>가격 : {item[index].price}</p>
              <button type='button'>주문하러 가기</button>
            </div>
        </div>

          <div className='intro-div'>{item[index].intro}</div>
      </div>
    </div>
  )
}

export default Detail;



// {
//   detail.map((e, i)=>
//     {
//       return(
//        <div>
//          <div className='detail-div'>
//             <div>
//              <img src={process.env.PUBLIC_URL +'/' + e.imgName}/>
//              </div>
//              <div>
//                <h3>{e.bookName}</h3>
//                <p>{e.price}</p>
//                <button type='button'>주문하기</button>
//              </div>
//             </div>

//             <div className='intro-div'>{e.intro}</div>
//        </div>
           
//       )

//     }
// )
//  }