
// function ItemList(){}

import Item from "./Item";


const ItemList = ({item_list}) => {
  return(
    // {/* 화면에 그리려면 map!!!!!!! */}
    <div className='books'>
    {
      item_list.map((item,i)=>{
        return(
          //맵에서 돌아가는 item을 데이터로 전달 
            <Item  item = {item} key={i}/>
        )
      })
    }
  </div>
  )
}

export default ItemList;