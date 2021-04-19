
import React, { useEffect, useState } from 'react'
import Footer from './component/Footer';
import Header from './component/Header';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import ListProduct from './component/ListProduct';
import CreateProduct from './component/CreateProduct';
import Slideshow from './component/Slideshow';
import UpdateUser from './component/UpdateUser';
function App() {
   const [data, setData] = useState([{username: '',password:"",status: ''}])
   const [user, setUser] = useState([])
   // if(data != null){
   //    console.log(data);
   // }
   return (
      <div >
         <Router>
            <div className="container-fluid">
               <main id="mainContainer" >
                  <Header />
                  <Slideshow />
                  <Switch>
                     <Route path="/" exact>
                        <ListProduct data={data} setData={setData}
                        user={user} setUser={setUser}
                        />
                     </Route>
                     <Route path="/user">
                        <ListProduct data={data} setData={setData}/>
                     </Route>
                  </Switch>
               </main>
               <Footer />

            </div>
         </Router>
      </div>
   );
}

export default App;
