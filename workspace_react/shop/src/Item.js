import { useNavigate } from "react-router-dom";

const Item = ({item}) => {

  //변수 아니고 함수임! 
  //쓸 때는 navigate(); 처럼 써야함
  //onclick과 함께 사용해서 페이지 이동 
  //navigate('이동할 URL'); 
  //navigate('-1')); ('-2'); ('1')도 가능 
  const navigate = useNavigate();

  return(
    <div className='books'>
      <div>
      <img onClick={(event)=>{
        navigate(`/detail/${item.bookNum}`)
      }} src={process.env.PUBLIC_URL +'/' + item.imgName}/>
      <h3>{item.bookName}</h3>
      <p>{item.price}</p>
      </div>
    </div>
  )
}

export default Item;