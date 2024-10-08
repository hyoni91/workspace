package com.green.Security.Test.config;


import com.green.Security.Test.jwt.LoginFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

//로그인 처리 방식
// 세션방식 : 서버에 로그인한 사람의 정보를 다 들어가있음/ 요청되면 요청된 키와 서버의 장부안에서 비교후 인증 (세션스토리지랑다른거임)
// jwt토큰방식 : Json Web Token(암호화된 문자열)

//이 클래스에서 시큐리티의 인증 및 인가에 대한 설명
@Configuration  //클래읏에 대한 객체 생성 어노테이션
@EnableWebSecurity //해당 클래스가 Security 설정 클래스임을 인지
@RequiredArgsConstructor
public class SecurityConfig {
    private final AuthenticationConfiguration configuration;


    //Bean이 붙어있으면 run과 동시에 실행이됨
    //비밀번호를 암호화 시켜줄 수 있는 객체 생성 메서드
    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    //authenticationManager 객체 생성 메서드
    //예외처리가 필요하지만, 예외처리 전가함
    //뭔지모르겠음...............뭔데이게
    @Bean
    public AuthenticationManager getAuthenticationManager(AuthenticationConfiguration configuration) throws Exception{
        return configuration.getAuthenticationManager();
    }


    //인증 및 인가에대한 설정을 진행하는 메서드

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception{
        //csrf 공격에 대한 방어기재 미사용
        httpSecurity.csrf(auth -> auth.disable());

        //form 로그인 방식 미사용 (react라서 미채택)
        httpSecurity.formLogin(auth -> auth.disable());

        // http basic 인증 방식 미사용
        httpSecurity.httpBasic(auth -> auth.disable());

        // 백서버의 세션 사용을 비활성화
        httpSecurity.sessionManagement(
                session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        );


        //LoginFilter클래스를 Filter에 추가
        //필터를 어디에 추가할 지는 두번째 매개변수에서 지정
        httpSecurity.addFilterAt(new LoginFilter(getAuthenticationManager(configuration)), UsernamePasswordAuthenticationFilter.class);



        //인증 및 인가 설정
        httpSecurity.authorizeHttpRequests(
                auth -> auth.requestMatchers(
                        "/",
                                "/member/loginForm",
                                "/member/joinForm",
                                "/member/join",
                                "/member/login").permitAll() // [/] 요청은 누구나 접근 가능
                        .anyRequest().authenticated() // 위의 요청 이외의 요청은 인증 후 접근 가능
        );

        return httpSecurity.build();
    }

}
