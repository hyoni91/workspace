import React from 'react'
import { Outlet } from 'react-router-dom';
import './UserLayout.css'

const UserLayout = () => {
  return (
    <div>
      <div className='header-userpage'>
        <ul>
          <li>전체상품</li>
          <li>인터넷/IT</li>
          <li>소설/에세이</li>
          <li>자기계발</li>
        </ul>
      </div> 
    <Outlet />
    </div>
    
  )
}

export default UserLayout;