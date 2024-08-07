import React from 'react'
import { Link, Outlet } from 'react-router-dom';

const AdminLayout = () => {
  return (
    <div>
      <div className='header-userpage'>
        <ul>
          <li className='dropMenu'>
            <Link>상품관리</Link>
            <div className='dropMenu-content'>
              <ul>
                <li>상품등록</li>
                <li>카테고리관리</li>
              </ul>
            </div>
          </li>  
          <li>구매관리</li>
          <li>유저관리</li>
          <li>매출관리</li>
        </ul>
      </div>
      <Outlet />
    </div>
  )
}

function DropMenu (){
  return(
    <div>
      <ul>
        <li>상품등록</li>
        <li>카테고리관리</li>
      </ul>
    </div>
  )
}

export default AdminLayout;