package com.green.Security.Test.jwt;

import com.green.Security.Test.vo.CustomUserVO;
import com.green.Security.Test.vo.MemberVO;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

/*

클라이언트가 가져 온 토큰이 유효한 지 검사하는 필터

<실행순서>
페이지 이동 요청 -> JwtConfirmFilter 실행 -> Controller 실행 (요청 시 매번 실행이 되야함)

*/

@Slf4j
@RequiredArgsConstructor
public class JwtConfirmFilter extends OncePerRequestFilter {
    private final JwtUtil jwtUtil;


    //토큰 검증 시 실행되는 메소드
    //모든 요청에 대한 컨트롤러가 실행되기 전 무조건 실행되는 메소드
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        log.info("토큰 검증 시작");

        //요청 시 헤더에 담겨오는 토큰 유무 확인
        //"Authorization"으로 토큰 값을 setting했었음 -> 이곳에 들어있는 키 값을 받아옴 : "Bearer 토큰"
        String authorization =  request.getHeader("Authorization");

        //----- 토큰이 없는 경우 -----//
        if(authorization == null || !authorization.startsWith("Bearer ")){
            log.info("토큰이 존재하지 않음");

            //토큰이 없어도 다른 페이지로 이동하면 계속해서 진행
            filterChain.doFilter(request,response);

            return ;
        }

        //----- 토큰이 있는 경우 -----//
        //토큰 추출
        //"Bearer aaaaabbbbbb"  문자열 두개 나옴(bearer 과 토큰) --> 문자열 배열!
        //1번째 요소가 토큰이 된다
        String token = authorization.split(" ")[1];

        //1. 토큰의 만료일 검사
        //--> JwtUtil 안에 만료일 검사 메소드 있음 *의존성 주입으로 객체 생성하기!
        if(jwtUtil.isExpired(token)){
            //토큰의 만료일이 지났을 때
            log.info("토큰의 유효기간 만료");

            //다음 필터 계속해서 진행하세요.
            filterChain.doFilter(request,response);

            return ;
        }


        //---- 토큰 존재 & 유효기간 유효 한 경우 (인증 된 회원) ----//

        //토큰의 유저 아이디, 권한 추출
        //JwtUtil 안의 메소드 사용
        String userId = jwtUtil.getUserId(token);
        String role = jwtUtil.getRole(token);

        log.info("로그인한 유저 아이디 : {}, 로그인한 유저 권한 : {}", userId,role);

        //인증된 유저의 정보를 MemberVO에 저장
        MemberVO member = new MemberVO();
        member.setMemId(userId);
        member.setMemRole(role);
        member.setMemPw("tempPw"); //null이 되지 않도록 비밀번호 정보를 임의로 세팅

        //CustomUserVO에 member정보 저장
        CustomUserVO customUserVO = new CustomUserVO(member);

        //위에서 가져 온 회원 정보를 security에서 사용하는 객체에 저장
        Authentication authentication = new UsernamePasswordAuthenticationToken(customUserVO,null,customUserVO.getAuthorities());
        //회원 정보를 인증된 사용자로 등록
        SecurityContextHolder.getContext().setAuthentication(authentication);


        //다음 필터 계속해서 진행하세요.
        filterChain.doFilter(request,response);
    }
}
