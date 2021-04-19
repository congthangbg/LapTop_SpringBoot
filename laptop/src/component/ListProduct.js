import React, { Component } from 'react';
import { useEffect, useState } from 'react'
import { TableHead, TableRow, TableCell, TableBody, Button } from '@material-ui/core';
import ApiCaller from '.././AxiosUtils/ApiCaller';
import CreateProduct from './CreateProduct';
function ListProduct({data,setData,user,setUser}) {
  
   const [item, setItem] = useState("")
   // useEffect(() =>{
   //   ApiCaller("user","get",null).then((response) =>{
   //     setUser(response.data);
   //   })
   // },[])
   // console.log(user);

  
   // API
   useEffect(() => {
      ApiCaller("user", "GET", null).then(response => {
         const { data } = response
         setUser(data)
      })
   }, [user])

   const editUser = (value) => {
      setData(value)
   }
   return (
      <div className="container">

         <section className="section">
            <h1 className="section-heading">List User</h1>
            <CreateProduct 
            item={item} data={data} setData={setData}
            user={user} setUser={setUser} />
            <div className="row">
               <table className="table table-hover ">
                  <TableHead>
                     <TableRow >
                        <TableCell>ID</TableCell>
                        <TableCell>User</TableCell>
                        <TableCell>Pass</TableCell>
                        <TableCell>Image</TableCell>
                        <TableCell></TableCell>
                     </TableRow>
                  </TableHead>
                  <TableBody>
                     {
                         user.map((value, index) => {
                           return (
                              <TableRow key={index} >
                                 <TableCell>{value.id}</TableCell>
                                 <TableCell>{value.username}</TableCell>
                                 <TableCell>{value.password}</TableCell>
                                 <TableCell>{value.status ? "admin" : "user"}</TableCell>
                                 <TableCell><button onClick={() =>editUser(value)}
                                    className="btn btn-primary">Edit</button></TableCell>
                              </TableRow>
                           )
                        })
                     }

                  </TableBody>
                  
               </table>
               <div className="row">
                     <ul className="pagination mt-4 col-lg-10" style={{ display: 'flex', alignItems: 'center', justifyContent: 'center', }} >
                        <li className="page-item"><a className="page-link bg-info" style={{ fontSize: 20 }} >Trang trước</a> </li>
                        <li className="page-item"><a className="page-link" style={{ fontSize: 20 }}> 1</a> </li>
                        <li className="page-item"><a className="page-link bg-info" style={{ fontSize: 20 }} >Trang sau</a> </li>
                     </ul>
                  </div>
            </div>
         </section>

      </div>
   );
}

export default ListProduct;