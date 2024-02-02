package com.SpringSecurity.SpringSecurity.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

public class User
{
    private Long userId;
    private String userName;
    private  String userPassword;
    private Long userNo;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Long getUserNo() {
        return userNo;
    }

    public void setUserNo(Long userNo) {
        this.userNo = userNo;
    }

    public User() {
    }

    public User(Long userId, String userName, String userPassword, Long userNo) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userNo = userNo;
    }
}
