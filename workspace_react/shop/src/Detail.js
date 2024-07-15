import { useParams } from 'react-router-dom';
import './Detail.css';
import { useEffect, useState } from 'react';

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

    //useEffect를 위한 useState
    const [num, setNum] = useState(0);
    const [num1, setNum1] = useState(0);


    //해당 컴포넌트가 랜더링(mount) 또는 재랜더링(update)될 때 실행
    useEffect(()=>{
      console.log(1)
    });

    //mount될 때만 실행
    useEffect(()=>{
      console.log(2)
    },[]);


    useEffect(()=>{
      console.log(3)
    },[num,num1]);

    useEffect(()=>{
      console.log(4)

      return ()=>{
        console.log(5)
      }
    },[num])


    //unmount될때 7출력
    useEffect(()=>{
      return()=>{
        console.log(7)
      }
    },[])

    return(
    <>
        <div>num값을 변경 = {num}</div>
        <button type='button' onClick={(e)=>{
          setNum(num+1)
        }}>click</button>

        <div>num1값을 변경 = {num1}</div>
        <button type='button' onClick={(e)=>{
          setNum1(num1+1)
        }}>num1변경 click</button>

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
    </>
  )
}


export default Detail;
