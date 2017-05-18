package com.huangdong.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/3/23.
 */
public class Email implements Serializable{
    private String userName;
    private String email;

    public Email(){

    }

    public Email(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Email{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
