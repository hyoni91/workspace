package com.green.Security.Test.service;

import com.green.Security.Test.vo.CustomUserVO;
import com.green.Security.Test.vo.MemberVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


//로그인 하려는 회원의 정보를 DB에서 조회할 시,  Security에서 알려주는 방식으로 쿼리 진행
//UserDetailsService 인터페이스에 정의된 loadUserByUsername() 메소드 안에서 로그인 하려는 회원 정보를 조회해야한다.
@Slf4j
@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    //MemberService에서 선언한 getMemberForLogin 기능을 사용하기 위해 객체 생성
    private final MemberServiceImpl memberService;


    //로그인 요청시 자동으로 실행되는 메소드
    //매개변수 String username => 로그인 요청 시 화면에 입력한 회원 아이디가 자동으로 입력된다.
    @Override
    public UserDetails loadUserByUsername(String username)  {
        //메소드가 실행되는지 확인
        log.info("UserDetailsServiceImpl 클래스의 loadUserByUsername() 메소드 실행");

        //로그인 하려는 회원의 정보 조회(로그인 한거 아님!)
       MemberVO loginInfo = memberService.getMemberForLogin(username);

       //로그인 하려는 회원 정보가 없을때(null일 때)
        if(loginInfo == null){
            throw new UsernameNotFoundException("회원 정보 없음");
        }


        //조회한 정보를 CustomUserVO객체에 담아준다.
        //new (생성자 호출)
        CustomUserVO customUser = new CustomUserVO(loginInfo);


        //자료형이 다른데 오류가 나지 않는 이유는? --> CustomUserVO는 UserDetails 인터페이스를 구현하고 있다.
        //실제 로그인을 처리하는 AuthentiCationManager에게 로그인 정보 전달
        return customUser;
    }
}
