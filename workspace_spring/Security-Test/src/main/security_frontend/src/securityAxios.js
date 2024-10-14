import axios from "axios";



export const securityApi = axios.create({
});

//interceptor 적용
//axios로 요청을 보내기 전 실행 내용 
//매개변수 : 함수 두개 들어 감
securityApi.interceptors.request.use(
  //첫번째 매개변수 : 요청이 서버로 전달되기 전 실행 할 내용
  (config)=>{ 
    alert('요청시 서버로 가기 적에 실행하는 인터셉터')
    //config에는 이미 여러 data가 들어있음
    //토큰이 있으면? header에 token도 같이 들고가도록 설정하기
    const token = localStorage.getItem('Authorization')
    if(token){
      config.headers.Authorization = token
    }
    return config;
  },
  //두번째 매개변수 : 서버로 요청 시 오류가 발생되면 그 오류가 실행되지 전에 작성 할 내용
  (error)=>{
    //요청 오류 발생 시 사전 작업 내용
    // --현재 딱히 적을 내용 없음 -- 
    //오류 내려고 했던거 그대로 작업해주세요.
    return Promise.reject(error)
  }
);

//axios로 응답을 받기 전 실행 내용
securityApi.interceptors.response.use(
  //첫번째 매개변수 : 응답 성공 전에 작업 내용
  (res)=>{
    alert('응답시 실행되는 코드')
    return res;
  },
  //두번째 매개변수 : 응답에서 오류가 발생하기 전에 작업 내용
  (error)=>{
    if(error.response.status){
      alert('로그인이 필요합니다😲')
      window.location.href = '/loginForm'
      return Promise.reject(error)
    }
  }
)
;