
function List(props){
return(
    props.list.map((item,i)=>{
      return(
        
        <div key={i} className='item-div'>
          <span>{item}</span> 
          <button type='button' onClick={(e)=>{
            
            // const copyList = [...props.list];
            // copyList.splice(i,1)
            // props.setList(copyList);

            // 3줄을 2줄로..
            props.list.splice(i , 1)
            props.setList([...props.list]);  //실제 배열은 줄었지만, 리스트의 변수 주소값은 그대로 이기때문에 리스트를 복사 가능? 

            }}>삭제</button>
          </div>
      );
    })
)
  
}

export default List;