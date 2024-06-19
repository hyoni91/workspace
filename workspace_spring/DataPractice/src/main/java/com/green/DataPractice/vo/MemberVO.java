package com.green.DataPractice.vo;


//html의 input 이름 속성이랑 변수명이 값아야함!!!
//joinController랑 세트임
public class MemberVO {
    private String id;
    private String pw;
    private String name;
    private String tel;
    private String email;
    private String birth;   //html 의 <input type'date'> 이어도, String으로 받으면 됨

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "MemberVO{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", birth='" + birth + '\'' +
                '}';
    }
}
