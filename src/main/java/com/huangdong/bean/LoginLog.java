package com.huangdong.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/1/8.
 */
public class LoginLog implements Serializable {

    private int loginId;
    private String ip;
    private Date loginTime;
    private User user;

    public LoginLog(){

    }

    public LoginLog(int loginId, String ip, Date loginTime, User user) {
        this.loginId = loginId;
        this.ip = ip;
        this.loginTime = loginTime;
        this.user = user;
    }

    public int getLoginId() {
        return loginId;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
