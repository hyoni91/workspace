import axios from "axios"


export function postSalesInfo(data){
  const response = axios.post(`/sales/insert`, data);
  return response;
}

export function selectSaleInfo(){
  const response = axios.get(`/sales/select`)
  return response
}
