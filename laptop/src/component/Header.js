import React, { Component, useEffect, useState } from 'react';
import { AppBar, Toolbar, IconButton, Typography, Button, Drawer } from '@material-ui/core'
import ApiCaller from '../AxiosUtils/ApiCaller'
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link
} from "react-router-dom";

function Header() {
  const [open, setOpen] = useState(false)
  const [anchor, setAnchor] = useState('left')
  const handleDrawer = () => {
    setOpen(true)
    setAnchor('left')
  }

  const [listCate,setListCate] = useState("")


  return (
    <header>

      <nav className="navbar fixed-top navbar-toggleable-md navbar-expand-lg navbar-dark scrolling-navbar double-nav">

        <div className="float-left">
          <a data-activates="slide-out" onClick={handleDrawer} className="button-collapse">
            <i className="fa fa-bars"> </i>
          </a>
        </div>
        <div className="breadcrumb-dn mr-auto">
          <ol className="breadcrumb header-breadcrumb">
            <li className="breadcrumb-item">
              <Link to="/" >Trang chủ</Link>
            </li>
            <li className="breadcrumb-item">
              <Link to="/ListProduct">Quản lý sản phẩm</Link>
            </li>
            <li className="breadcrumb-item">
              <Link to="/Category">Quản lý danh mục</Link>
            </li>
          </ol>
        </div>
        
        {/* <ul className=" nav navbar-nav nav-flex-icons ml-auto"> */}
        <div className="row mr-3">
        <Link to="/LoginForm"className="dropdown-item waves-effect waves-light">Đăng Nhập</Link>
            
        </div>  
        <div className="row mr-3">
        <Link to="/LoginForm"  className="dropdown-item waves-effect waves-light">Đăng Xuất</Link>
            
        </div> 
         
      </nav>
      <Drawer anchor={anchor}
        open={open}
        onClose={() => setOpen(false)}
      >
        <div  style={{ height: "100%", padding: "20px" }}>
          {anchor == 'left' ?
            <ul id="slide-out" className="hidden custom-scrollbar " data-ps-id="c27390a3-9efc-e0d8-197a-ab96d73a156a">
              <li>
                <div className="logo-wrapper waves-light waves-effect waves-light">
                  <a>
                    <img src="https://investone-law.com/wp-content/uploads/2019/08/thuong-hieu-dien-thoai-768x215.png" alt="" width="300px" className="img flex-center" />
                  </a>
                </div>
              </li>
              <li>
                <ul className="social row flex-center mt-3">
                  <li>
                    <a className="icons-sm fb-ic">
                      <i className="fa fa-facebook"> </i>
                    </a>
                  </li>
                  <li>
                    <a className="icons-sm pin-ic">
                      <i className="fa fa-pinterest"> </i>
                    </a>
                  </li>
                  <li>
                    <a className="icons-sm gplus-ic">
                      <i className="fa fa-google-plus"> </i>
                    </a>
                  </li>
                  <li>
                    <a className="icons-sm tw-ic">
                      <i className="fa fa-twitter"> </i>
                    </a>
                  </li>
                </ul>
              </li>
              <li>
                <form className="search-form" role="search">
                  <div className="form-group waves-light waves-effect waves-light">
                    <input type="text" className="form-control"  />
                  </div>
                </form>
              </li>
              <ul className="collapsible collapsible-accordion">
                <li>
                  <Link to="/Mainproduct" className="collapsible-header waves-effect arrow-r">
                    <i className="fa fa-shopping-bag" /> Danh sách sản phẩm
                  </Link>
                </li>
              </ul>
              <ul className="collapsible collapsible-accordion">
                <li>
                  <Link to="/ListProduct" className="collapsible-header waves-effect arrow-r">
                    <i className="fa fa-shopping-bag" /> Quản lý sản phẩm
                  </Link>
                </li>
              </ul>
              <ul className="collapsible collapsible-accordion">
                <li>
                  <Link to="/Category" className="collapsible-header waves-effect arrow-r">
                    <i className="fa fa-shopping-bag" /> Quản lý danh mục
                  </Link>
                </li>
              </ul>
            </ul>
            : ""
          }
        </div>

      </Drawer>
    </header>
  );
}

export default (Header);