package com.green.Security.Test.jwt;


import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Date;

//jwt토큰 생성 및 토큰의 정보를 조회하는 기능을 구현한 클래스
public class JwtUtil {

    //SecretKey -->application.properties에 추가한 spring.jwt.secret를 저장
    private SecretKey secretKey;

    //@Value : application.properties 파일의 내용을 참조
    public JwtUtil(@Value("${spring.jwt.secret}") String secret){
        secretKey = new SecretKeySpec(
                secret.getBytes(StandardCharsets.UTF_8)
                , Jwts.SIG.HS512.key().build().getAlgorithm());
    }  //HS512는 암호화된 알고리즘을 이야기함!



    //토큰 생성 메소드(토큰은 암호화된 문자열이므로 String으로 받기)
    //userId : 로그인한 회원의 아이디
    //role : 로그인한 회원의 권한
    public String createJwt(String userId, String role){
        return Jwts.builder()
                //jwt header부분
                .signWith(secretKey, Jwts.SIG.HS512) //HS512알고리즘으로 암호화 진행
                .header().add("typ", "JWT") //토큰의 타입 지정
                //jwt payload 부분
                .and()
                .claim("userId",userId)
                .claim("role",role)
                .issuedAt(new Date(System.currentTimeMillis())) //토큰 발행 시간(iat)
                .expiration( new Date(System.currentTimeMillis() + (1000 * 60 * 60) )) //토큰의 유효기간(1000=1초)
                //시간 계산 (1000 * 60 * 60 * 24) 초 분 시간 일 로 계산하는게 편하다!
                .compact();
    }


    //jwt 토큰에서 로그인 한 회원의 아이디 추출 메소드

    //jwt 토큰에서 로그인 한 회원의 권한 추출 메소드

    //jwt 토큰의 만료 여부 추출 메소드

}
