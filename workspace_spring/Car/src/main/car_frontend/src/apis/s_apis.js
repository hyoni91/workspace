import axios from "axios"


export function postSalesInfo(data){
  const response = axios.post(`/sales/insert`, data);
  return response;
}

