package com.kubang.olme.domain;

/**
 * Created by wuzeyong on 2014/7/31 0031.
 * Function:
 */
public class LoginUser {
    private Integer id;
    private String username;
    private String password;

    public LoginUser() {
    }

    public LoginUser(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "TUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
