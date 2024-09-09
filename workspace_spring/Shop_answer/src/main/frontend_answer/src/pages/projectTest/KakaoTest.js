import React, { useEffect } from 'react'
const {Kakao} = window;

function KakaoTest() {
  
  // 배포한 자신의 사이트
  const realUrl = "https://localhost:3030/"
  // 로컬 주소 (localhost 3000 같은거)
  const resultUrl = window.location.href;
  
  // 재랜더링시에 실행되게 해준다.
  useEffect(()=>{
    // init 해주기 전에 clean up 을 해준다.
      Kakao.cleanup();
      // 자신의 js 키를 넣어준다.
      Kakao.init('4efa41168cbd61da600f3efe717305a8');
      // 잘 적용되면 true 를 뱉는다.
      console.log(Kakao.isInitialized());
  },[]);

  const kakaoShare = () =>{
  Kakao.Share.sendDefault({
    objectType: 'text',
    text:
      '기본 템플릿으로 제공되는 텍스트 템플릿은 텍스트를 최대 200자까지 표시할 수 있습니다. 텍스트 템플릿은 텍스트 영역과 하나의 기본 버튼을 가집니다. 임의의 버튼을 설정할 수도 있습니다. 여러 장의 이미지, 프로필 정보 등 보다 확장된 형태의 카카오톡 공유는 다른 템플릿을 이용해 보낼 수 있습니다.',
    link: {
      mobileWebUrl: 'https://developers.kakao.com',
      webUrl: 'https://developers.kakao.com',
    },
  })
  }

  return (
  <div>
    <button onClick={()=>{kakaoShare()}}>카톡test</button>
    
  </div>
  )
}

export default KakaoTest