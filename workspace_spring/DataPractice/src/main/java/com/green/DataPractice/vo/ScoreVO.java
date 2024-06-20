package com.green.DataPractice.vo;

import java.util.Arrays;

public class ScoreVO {
    private String name;
    private String hak;
    private String[] tel;
    private String gender;
    private int kor;
    private int eng;
    private int math;
    private double avg;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHak() {
        return hak;
    }

    public void setHak(String hak) {
        this.hak = hak;
    }

    public String[] getTel() {
        return tel;
    }

    public void setTel(String[] tel) {
        this.tel = tel;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg() {

        this.avg = (double) (getEng()+getKor()+getMath())/ 3.0;
    }

    @Override
    public String toString() {
        return "ScoreVO{" +
                "name='" + name + '\'' +
                ", hak='" + hak + '\'' +
                ", tel=" + Arrays.toString(tel) +
                ", gender='" + gender + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                ", avg=" + avg +
                '}';
    }
}

