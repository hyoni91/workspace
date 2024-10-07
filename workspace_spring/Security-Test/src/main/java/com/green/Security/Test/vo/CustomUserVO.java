package com.green.Security.Test.vo;


import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RequiredArgsConstructor
// 유저의 정보를 저장 + security보안 내용이 추가된 클래스
//로그인 하려는 회원(DB에 저장되어있는)의 정보를 담을 통
public class CustomUserVO implements UserDetails {
        private final MemberVO memberVO;

    //유저의 권한 목록 조회(인가)
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //권한 목록을 저장할 박스
        Collection<GrantedAuthority> collection = new ArrayList<>();

        //배우지 않은...코드
        //MemberVO에 저장된 권한을 하나씩 빼서 collection 객체에 추가하는 코드
        collection.add(new GrantedAuthority() {
            @Override
            public String getAuthority() {
                return memberVO.getMemRole();
            }
        });

        return collection; //목록으로 구상하지는 않았음!
    }

    //유저의 비밀번호 리턴
    @Override
    public String getPassword() {
        return memberVO.getMemPw();  //memberVO의 정보를 불러오면 됨
    }

    //유저의 아이디 리턴
    @Override
    public String getUsername() {
        return memberVO.getMemId();
    }

    //계정 유효?(만료 안 된 계정인가?)
    @Override
    public boolean isAccountNonExpired() {
        return true;  //test이기때문에 만료 안됐다로 다 리턴해줌
    }

    //유령계정?(안 잠긴 계정인가?)
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    // 사용가능 유무
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    //활성화 상태
    @Override
    public boolean isEnabled() {
        return true;
    }
}
