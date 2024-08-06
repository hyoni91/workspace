
import React from 'react'

const Modal = ({content, setIsShow, offbtn}) => {
  return (
    <div className='modal-container' onClick={setIsShow(false)}>
        <div className='modal'>
          <div className='modal-header'>
            <span onClick={()=>{setIsShow(false)}} >
              <i className="bi bi-x-lg"></i></span>          
            </div>
          <div className='modal-content'>
            {content()}
          </div>
          <div className='modal-footer'>
            <button type='button' onClick={()=>{
              setIsShow(false)
              offbtn()
            }}>확인</button>
          </div>
        </div>
      </div>
  )
}

export default Modal;