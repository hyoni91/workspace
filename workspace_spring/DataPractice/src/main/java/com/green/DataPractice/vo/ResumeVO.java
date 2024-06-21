package com.green.DataPractice.vo;

public class ResumeVO {
    private String name;
    private String tel;
    private String education;
    private String educationName;
    private String category;
    private String licenseName;
    private String licenseDate;
    private String Issuer;
    private String companyName;
    private String Respon;
    private int careerYear;
    private int careerMonth;
    private String introduce;

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

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLicenseName() {
        return licenseName;
    }

    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }

    public String getLicenseDate() {
        return licenseDate;
    }

    public void setLicenseDate(String licenseDate) {
        this.licenseDate = licenseDate;
    }

    public String getIssuer() {
        return Issuer;
    }

    public void setIssuer(String issuer) {
        Issuer = issuer;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRespon() {
        return Respon;
    }

    public void setRespon(String respon) {
        Respon = respon;
    }

    public int getCareerYear() {
        return careerYear;
    }

    public void setCareerYear(int careerYear) {
        this.careerYear = careerYear;
    }

    public int getCareerMonth() {
        return careerMonth;
    }

    public void setCareerMonth(int careerMonth) {
        this.careerMonth = careerMonth;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    @Override
    public String toString() {
        return "ResumeVO{" +
                "name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", education='" + education + '\'' +
                ", educationName='" + educationName + '\'' +
                ", category='" + category + '\'' +
                ", licenseName='" + licenseName + '\'' +
                ", licenseDate='" + licenseDate + '\'' +
                ", Issuer='" + Issuer + '\'' +
                ", companyName='" + companyName + '\'' +
                ", Respon='" + Respon + '\'' +
                ", careerYear=" + careerYear +
                ", careerMonth=" + careerMonth +
                ", introduce='" + introduce + '\'' +
                '}';
    }
}
