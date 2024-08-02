
import React from 'react'

const Modal = ({content, setIsShow}) => {
  return(
    <div className='modal-container'>
        <div className='modal'>
          <div className='modal-header'>
            <span onClick={()=>{setIsShow(false)}} >
              <i class="bi bi-x-lg"></i></span>          
            </div>
          <div className='modal-content'>
            {content()}
          </div>
          <div className='modal-footer'>
            <button type='button' onClick={()=>{setIsShow(false)}}>확인</button>
          </div>
        </div>
      </div>
  )
}

export default Modal;