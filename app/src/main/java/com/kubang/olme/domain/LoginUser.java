package com.kubang.olme.domain;

import java.sql.Date;

/**
 * Created by wuzeyong on 2014/7/31 0031.
 * Function:
 */
public class LoginUser {
    private int userId;
    private String userEmail;
    private String userName;
    private String password;
    private int userScore;
    private String userPhoto;
    private String userAddress;
    private Date userBirthday;
    private String userPhone;

    public LoginUser() {
    }

    public LoginUser(int userId, String userEmail, String userName, String password, int userScore, String userPhoto, String userAddress, Date userBirthday, String userPhone) {
        this.userId = userId;
        this.userEmail = userEmail;
        this.userName = userName;
        this.password = password;
        this.userScore = userScore;
        this.userPhoto = userPhoto;
        this.userAddress = userAddress;
        this.userBirthday = userBirthday;
        this.userPhone = userPhone;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getUserScore() {
        return userScore;
    }

    public void setUserScore(int userScore) {
        this.userScore = userScore;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}
