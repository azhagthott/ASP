package com.zecovery.android.dev.asp.main;

import java.util.List;

/**
 * Created by fran on 03-08-16.
 */

public class User {

    private int userId;
    private String userEmail;
    private String userName;
    private int userAge;
    private String userCountry;
    private String userGender;
    private List<String> userInterests;

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public List<String> getUserInterests() {
        return userInterests;
    }

    public void setUserInterests(List<String> userInterests) {
        this.userInterests = userInterests;
    }
}
