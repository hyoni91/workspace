
let resultArr = [
  false,  //아이디
  false  //비번
]

export const joinvalid = (newData,validTag, tagName) =>{

  switch(tagName){
    case 'memId' :
      const regex_memId = /^[A-Za-z0-9]{4,12}$/;

      if(regex_memId.test(newData.memId)){
        sendFeedbackMsg(validTag[0], 'good','*사용가능한 아이디 입니다.')
        return resultArr[0] = true;
      }else{
        sendFeedbackMsg(validTag[0], 'error','*영문(대소문자)/숫자 4~12자까지 가능합니다.')
        return resultArr[0] = false;
      }
      break;
      case 'memPw' :
        const regex_memPw = /^[a-z0-9](?=.*[a-z])(?=.*[0-9]).{3,12}$/g;
        if(regex_memPw.test(newData.memPw)){ 
          sendFeedbackMsg(validTag[1], 'good','*사용가능한 패스워드 입니다.')
        return resultArr[1] = true;
      }else{
        sendFeedbackMsg(validTag[1], 'error','*영문(소문자)과 숫자조합 4~12자까지 가능합니다.')
        return resultArr[1] = false;
        }
  }

  return  !resultArr.includes(false)

}

const sendFeedbackMsg = (feedbackTag, type, msg) =>{
  feedbackTag.current.className = `feedback ${type}`
  feedbackTag.current.textContent = msg
}