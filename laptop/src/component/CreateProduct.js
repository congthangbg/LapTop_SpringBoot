import React, { Component, useState } from 'react';
import ApiCaller from '../AxiosUtils/ApiCaller';
function CreateProduct({item,data,setData,user,setUser}) {
   const [state,setState]=useState("")
  // const [data, setData] = useState({username: '',password:"",status: ''})
   const onChangHandler = (event) => {
      const name = event.target.name;
      const value = event.target.value 
      setData({
         ...data,
         [name]: value,
      })
   }
   const addUser =(event)=>{
      event.preventDefault();
      // console.log("user =>" + JSON.stringify(data));
      ApiCaller("/user","POST",data).then((response)=>{
      
      })
      const itemInsert = setUser([
         ...user,
         data
      ]);
      console.log(user);
      clear();
   }
   const updateUser=(event,id)=>{
    event.preventDefault();   
    ApiCaller("/user/"+id,"PUT",data).then((response)=>{
      console.log(response.data);
   })
clear();
   }
  
   const deleteUser = (event,id)=>{
      event.preventDefault();
      console.log(user);
      ApiCaller("/user/"+id,"DELETE",data).then((response)=>{
      })
      const itemDelete = user.filter(item => item.id !== id);
    setUser(itemDelete)
      clear();
   }
   const clear=() => {
      setData({ id:"",username: '',password:"",status: ''});
   }
   return (
      <form className="mt-4" style={{ marginLeft: 150 }}>
         <div className="row mt-2">
            <label htmlFor="inputEmail3" className="col-md-2 col-form-label">ID</label>
            <div className="col-md-8">
               <input disabled name="id" type="input" className="form-control"  onChange={onChangHandler}   value={data.id} placeholder="Id" />
            </div>
         </div>
         <div className=" row mt-2">
            <label htmlFor="inputEmail3" className="col-md-2 col-form-label">user</label>
            <div className="col-md-8">
               <input name="username" type="input" onChange={onChangHandler} value={data.username}  className="form-control" placeholder="Tên " />
            </div>
         </div>
         <div className=" row mt-2">
            <label htmlFor="inputEmail3" className="col-md-2 col-form-label">Pass</label>
            <div className="col-md-8">
               <input name="password" type="input"  onChange={onChangHandler} value={data.password}  className="form-control" />
            </div>
         </div>
         <div className=" row mt-2">
            <label htmlFor="inputEmail3" className="col-md-2 col-form-label">Role</label>
            <div className="col-md-8">
               <div className="form-check form-check-inline">
                  {
                     data.status === true ?  <input className="form-check-input" type="radio"  onChange={onChangHandler} checked  name="status" id="inlineRadio1" defaultValue="true" />
                     :
                     <input className="form-check-input" type="radio" onChange={onChangHandler}   name="status" id="inlineRadio1"   defaultValue="true"/>
                  }
                
                  <label className="form-check-label" htmlFor="inlineRadio1">Admin</label>
               </div>
               <div className="form-check form-check-inline">
               {
                     data.status === false ?  <input className="form-check-input" type="radio"  onChange={onChangHandler} checked defaultChecked   name="status" id="inlineRadio2"  defaultValue="false"  />
                     :
                     <input className="form-check-input" type="radio" onChange={onChangHandler} defaultChecked   name="status" id="inlineRadio2"  defaultValue="false"  />
                  }
                  
                  <label className="form-check-label" htmlFor="inlineRadio2">User</label>
               </div>
            </div>
         </div>

         <div className="form-group row">
            <div className="col-md-10 ml-auto">
            <button type="submit" className="btn btn-primary " onClick={(event) =>addUser(event)} >Thêm</button>
            <button type="submit" className="btn btn-primary " onClick={(event) =>updateUser(event,data.id)}>Sửa</button>
            <button type="submit" className="btn btn-primary " onClick={(event) =>deleteUser(event,data.id)}>Xóa</button>
               <button type="button" className="btn btn-primary ml-3" onClick={clear}>Clear</button>
               {/* <button onClick={()=>handleDelete(data.id)} type="submit" className="btn btn-primary ml-3">Xoá</button> */}
            </div>
         </div>
      </form>
   );
}

export default CreateProduct;