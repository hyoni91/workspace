import React from 'react'
import { Outlet } from 'react-router-dom';

const UserLayout = () => {
  return (
    <div>
     <div>user's page</div> 
    <Outlet />
    </div>
    
  )
}

export default UserLayout;