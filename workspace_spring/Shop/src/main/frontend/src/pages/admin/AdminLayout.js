import React from 'react'
import { Outlet } from 'react-router-dom';

const AdminLayout = () => {
  return (
    <div>
      <div>adimn's page</div>
      <Outlet />
    </div>
  )
}

export default AdminLayout;