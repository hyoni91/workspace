import React, { useState } from 'react'

const Origin = () => {
  
  const [num,setNum] = useState(0)
  
  const addNum = () => setNum(num+1);
  const subNum = () => setNum(num-1);
  const resetNum = () => setNum(0)
  

  return (
    <div>
      <h2>COUNT APP (Origin)</h2>
      <div>
        <h3>{num}</h3>
        <div className='count'>
          <button type='button' onClick={()=>addNum()}>+1</button>
          <button type='button' onClick={()=>subNum()}>-1</button>
          <button type='button' onClick={()=>resetNum()}>RESET</button>
        </div>
      </div>
    </div>
  )
}

export default Origin