package com.zhku.bean;

public class Student {
    private String sNumber;

    private String sName;

    private Integer sCampus;

    private Integer sAcademy;

    private Integer sMajor;

    private Integer sClass;

    private Integer userId;

    public String getsNumber() {
        return sNumber;
    }

    public void setsNumber(String sNumber) {
        this.sNumber = sNumber == null ? null : sNumber.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public Integer getsCampus() {
        return sCampus;
    }

    public void setsCampus(Integer sCampus) {
        this.sCampus = sCampus;
    }

    public Integer getsAcademy() {
        return sAcademy;
    }

    public void setsAcademy(Integer sAcademy) {
        this.sAcademy = sAcademy;
    }

    public Integer getsMajor() {
        return sMajor;
    }

    public void setsMajor(Integer sMajor) {
        this.sMajor = sMajor;
    }

    public Integer getsClass() {
        return sClass;
    }

    public void setsClass(Integer sClass) {
        this.sClass = sClass;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}