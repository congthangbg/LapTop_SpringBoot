import axios from 'axios';
import * as Config from '../ConstantsPOST/Config';

export default function callApi(endpoint, method="GET",body) {
   return  axios({
      method:method,
      url:`${Config.API_URL}/${endpoint}`,
      data:body
   })
   // .then(response =>{
   //    const { data}= response
   //    setProduct(data)
   // })
   .catch(err =>{
      console.log(err,err.response);
   })
}
