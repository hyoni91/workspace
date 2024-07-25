

//////////////////////////////////////////////////////////////////////////////////////////
  //localStorage & sessionStorage (새로고침을 해도 data를 보존)
  //문자열 데이터만 저장이 가능하다.
  // 데이터 set : window.sessionStorage.setItem(key,value);
  // 데이터 get : window.sessionStorage.getItem(key);
  // 데이터 remove : window.sessionStorage.removeItem(key);
  // 전제 테이터 clear : window.sessionStorage.clear();

  //sessionStorage에 데이터 입력
  window.sessionStorage.setItem('name','tata')
  window.sessionStorage.setItem('age','20')


  //객체 넣는 방법(json)
  const mem = {
    stuNum : 1,
    stuName : 'mang',
    score : 80
  }

  //이렇게 하면 객체의 상세정보가 안뜸! 
  window.sessionStorage.setItem('member', mem)
 

  // json:     JSON.stringify();
  window.sessionStorage.setItem('member', JSON.stringify(mem))
  // 애플리케이션 결과값 : 키 :member   값:	{"stuNum":1,"stuName":"mang","score":80}

  //객체 또는 배열을 Storage에 저장할 때 json 형태로 저장
  //json(JavaScript Object Notation) : 모든 언어에서 공통적으로 해석할 수 있는 자료형
  //즉, 자바스크립트의 객체를 문자화 시킨것!(문자열끼리는 다른 언어에서도 해석이 가능함)
  // {name : 'tata', age : 20 }  ->  "{name : 'tata', age : 20}"

  
  //sessionStorage에 데이터 읽기
  console.log(window.sessionStorage.getItem('name')) 
  //json으로 객체를 문자열로 바꾼 데이터 읽기 --> 이러면 모든 값이 문자열로 나옴
  console.log(window.sessionStorage.getItem('member')) 
  //그렇다면 문자열을 객체로 바꾸는 방법
  const jsonResult = JSON.parse(window.sessionStorage.getItem('member'));
  console.log(jsonResult)
  console.log(jsonResult.stuName)

  //////////////////////////////////////////////////////////////////////////////////////////