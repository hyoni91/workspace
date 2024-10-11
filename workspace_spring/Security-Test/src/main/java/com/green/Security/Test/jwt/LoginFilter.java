package com.green.Security.Test.jwt;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.green.Security.Test.vo.MemberVO;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;

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

    //JwtUtil 의존성 주입
    private final JwtUtil jwtUtil;

    //기본 설정값을 변경시키기 위해 직접 생성자를 만들어 주었기 때문에 @RequiredArgsConstructor은 필요가 없다.
    public LoginFilter(AuthenticationManager authenticationManager, JwtUtil jwtUtil){
        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;

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


        //아이디와 비번 받아오기
        //리액트에서 전달되는 데이터는 JSON 타입으로 자바로 가져온다
        //JSON 타입 : 자바스크립트의 개체를 문자열화 시킨 것
        // 1. json 타입의 데이터를 자바의 클래스 형태로 변화시켜줄 객체 생성
        ObjectMapper objectMapper = new ObjectMapper();

        //2번~3번은 예외처리를 해줘야함 (데이터가 안 넘어올 수도 있기 때문에)
        MemberVO vo = null;
        try {
            // 2. 리액트에서 넘어오는 json 데이터 받기(문자열 형태라는 것!)
            ServletInputStream inputStream = request.getInputStream(); //넘겨져 오는 모든 data
            String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8); //넘어온 data 중 body부분만 빼기

            // 3. json 데이터를 MemberVO 형태로 변환 (messageBody 예시 => "{"memId":"kjs", "memPw" : "123" }"
            vo = objectMapper.readValue(messageBody, MemberVO.class); // 위의 문자열을 MemberVO형태로 바꾸기! value만 빼오기! "kjs" "123" ,,
        }catch (IOException e){
            System.out.println("attemptAuthentication 메소드에서 json으로 넘어오는 로그인 정보 받기 실패");
            e.printStackTrace(); //오류 원인 출력
        }catch(Exception e){
            //3번 코드가 오류난 경우
            System.out.println("json으로 넘어오는 로그인 정보를 MemberVO 객체로 변환 중 예외 발생");
            e.printStackTrace();
        }


        log.info("입력받은 아이디 : {} , 입력받은 비밀번호: {}", vo.getMemId(), vo.getMemPw());

        //아이디와 비밀번호를 AuthenticationManager클래스에 전달하는 보안이 좋은 통이 된다.
        UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(vo.getMemId(),vo.getMemPw(), null);
        return authenticationManager.authenticate(authToken);

    }

    // 로그인 성공 시 실행되는 메서드
    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        log.info("로그인 성공");


        //매개변수로 전달되는 Authentication authResult 이 객체에 로그인 성공한 회원 정보 다 있음
        //토큰 생성을 위한 로그인한 회원의 아이디와 권한정보
        //로그인한 회원 아이디
        String userId = authResult.getName();
        //로그인한 회원 권한정보
        Collection<? extends GrantedAuthority> authorities = authResult.getAuthorities();
        Iterator<? extends GrantedAuthority> iterator = authorities.iterator();
        GrantedAuthority auth = iterator.next();
        String role = auth.getAuthority();

        //jwt 토큰 생성
        String token = jwtUtil.createJwt(userId,role);

        //생성한 토큰을 client의 헤더에 담아서 응답
        //응답 헤더에는 key:value 형태로 데이터 추가
        //Bearer : 뒤에 오는 문자열이 jwt 토큰 형태임을 알려준다.
        //"Authorization" : "Bearer 토큰"
        response.setHeader("Authorization","Bearer "+ token );
        response.setStatus(HttpStatus.OK.value()); //200 Status를 반환해 준다. (성공했을때)

    }

    // 로그인 실패 시 실행되는 메서드
    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException, ServletException {
        log.info("로그인 실패");
        response.setStatus(401); //인증 실패 Status반환
    }
}
