
const Item = ({item}) => {

  return(
    <div className='books'>
      <div>
      <img src={process.env.PUBLIC_URL +'/' + item.imgName}/>
      <h3>{item.bookName}</h3>
      <p>{item.price}</p>
      </div>
    </div>
  )
}

export default Item;