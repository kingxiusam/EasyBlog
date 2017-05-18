package com.huangdong.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * Created by Administrator on 2017/1/7.
 */
public class User implements Serializable {

    /**
     *锁定用户对应的状态值
     */
    public static final int USER_LOCK = 1;
    /**
     * 用户解锁对应的状态值
     */
    public static final int USER_UNLOCK = 0;
    /**
     * 管理员类型
     */
    public static final String FORUM_ADMIN = "管理用户";
    /**
     * 普通用户类型
     */
    public static final String NORMAL_USER = "普通用户";


    private String userName;
    private String phoneNumber;
    private String passWord;
    private String userType;//管理员或普通用户
    private int locked;//默认值为0未锁定状态
    private int credit;//用户积分
    private Date lastVisit;
    private String lastLogIp;
    private Set<Board> manBoard;
    public User(){

    }

    public User(String userName, String passWord, String userType, int locked, int credit, Date lastVisit, String lastLogIp,String phoneNumber, Set<Board> manBoard) {
        this.userName = userName;
        this.phoneNumber=phoneNumber;
        this.passWord = passWord;
        this.userType = userType;
        this.locked = locked;
        this.credit = credit;
        this.lastVisit = lastVisit;
        this.lastLogIp = lastLogIp;
        this.manBoard = manBoard;

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getLastLogIp() {
        return lastLogIp;
    }

    public void setLastLogIp(String lastLogIp) {
        this.lastLogIp = lastLogIp;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }



    public int getLocked() {
        return locked;
    }

    public void setLocked(int locked) {
        this.locked = locked;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public Date getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }

    public Set<Board> getManBoard() {
        return manBoard;
    }

    public void setManBoard(Set<Board> manBoard) {
        this.manBoard = manBoard;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", passWord='" + passWord + '\'' +
                ", userType='" + userType + '\'' +
                ", locked=" + locked +
                ", credit=" + credit +
                ", lastVisit=" + lastVisit +
                ", lastLogIp='" + lastLogIp + '\'' +
                ", manBoard=" + manBoard +
                '}';
    }
}
