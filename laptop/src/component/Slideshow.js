import React, { Component } from 'react';

function Slideshow() {
      return (
         <div id="carouselExampleIndicators" className="carousel slide" data-ride="carousel">
         <ol className="carousel-indicators">
           <li data-target="#carouselExampleIndicators" data-slide-to={0} className="active" />
           <li data-target="#carouselExampleIndicators" data-slide-to={1} />
           <li data-target="#carouselExampleIndicators" data-slide-to={2} />
         </ol>
         <div className="carousel-inner">
           <div className="carousel-item active">
             <img src="https://images.fpt.shop/unsafe/fit-in/1200x300/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2021/3/1/637501541418720880_F-C1_1200x300.png" className="d-block w-100" alt="..." />
           </div>
           <div className="carousel-item">
             <img src="https://images.fpt.shop/unsafe/fit-in/1200x300/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2021/2/27/637500283585102322_F-C1_1200x300.png" className="d-block w-100" alt="..." />
           </div>
           <div className="carousel-item">
             <img src="https://images.fpt.shop/unsafe/fit-in/1200x300/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2021/3/1/637501932109673779_F-C1_1200x300.png" className="d-block w-100" alt="..." />
           </div>
         </div>
         <a className="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
           <span className="carousel-control-prev-icon" aria-hidden="true" />
           <span className="sr-only">Previous</span>
         </a>
         <a className="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
           <span className="carousel-control-next-icon" aria-hidden="true" />
           <span className="sr-only">Next</span>
         </a>
       </div>
      );
   }

export default Slideshow;