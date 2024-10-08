package com.green.Security.Test.jwt;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.io.IOException;

/*
security를 사용한 로그인은 먼저 UsernamePasswordAuthenticationFilter 클래스로부터 시작한다.(상속)
UsernamePasswordAuthenticationFilter는 로그인을 시도하면 로그인 입력한 아이디와 비밀번호를 가져오는 역할을 한다.(로그인 검증)

주의점
 *로그인을 요청할 때만 동작하기
 *아무것도 설정하지 않으면 "/login" 요청을 로그인 경로로 인지한다.
 *로그인 요청 경로 변경은 생성자에서 진행한다.
 *상속받은 Filter는 Form 방식의 로그인에서는 자동으로 실행되지만 jwt를 사용한 로그인에서는 UsernamePasswordAuthenticationFilter가 실행되지 않는다.
  ---> 즉, SecurityConfig클래스에 우리가 만든 LoginFiler클래스가 실행되도록 설정해야한다.

*/

@Slf4j
public class LoginFilter extends UsernamePasswordAuthenticationFilter {

    // 실제 로그인 검증을 실행하는 객체
    private final AuthenticationManager authenticationManager;

    //기본 설정값을 변경시키기 위해 직접 생성자를 만들어 주었기 때문에 @RequiredArgsConstructor은 필요가 없다.
    public LoginFilter(AuthenticationManager authenticationManager){
        this.authenticationManager = authenticationManager;

        //로그인 요청 경로 변경
        setFilterProcessesUrl("/member/login");

        //아이디, 비번 전달되는 name 변경
        setUsernameParameter("memId");
        setPasswordParameter("memPw");
    }

    /*
    로그인 요청 시 최초로 실행되는 메서드
    해당 메서드에서는 로그인 요청시 전달되는 아이디와 비밀번호를 받아서 AuthenticationManager에 전달한다.
    실제 로그인 로직을 실행하는 객체는 AuthenticationManager가 된다.

    프론트에서 입력받은 아이디와 비밀번호는 특별한 설정을 하지 않으면 username, password라는 이름으로 값을 전달 받도록 설정되어 있다.
    전달되는 아이디와 비번의 이름 변경은 생성자에서 진행한다.
    */
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        //메서드가 실행되는지 확인
        log.info("LoginFilter클래스의 attemptAuthentication 실행");

        //우리가 입력한 아이디, 비번 가져오기(임시코드)
        String username = obtainUsername(request);
        String password = obtainPassword(request);
        log.info("입력받은 아이디 : {} , 입력받은 비밀번호: {}", username, password);


        //아이디와 비밀번호를 AuthenticationManager클래스에 전달하는 보안이 좋은 통이 된다.
        UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(username,password, null);
        return authenticationManager.authenticate(authToken);

    }

    // 로그인 성공 시 실행되는 메서드
    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        log.info("로그인 성공");

    }

    // 로그인 실패 시 실행되는 메서드
    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException, ServletException {
        log.info("로그인 실패");
    }
}
