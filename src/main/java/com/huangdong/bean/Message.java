package com.huangdong.bean;

import java.util.Date;

/**
 * Created by Administrator on 2017/3/30.
 */
public class Message {
    private String messageId;
    private String singleNum;
    private String name;
    private String email;
    private String website;
    private String subject;
    private String message;
    private Date time;
    private String owner;


    public Message(){

    }
    public Message(String messageId,String singleNum,String name, String email, String website, String subject, String message,Date time,String user) {
        this.messageId=messageId;
        this.singleNum=singleNum;
        this.name = name;
        this.email = email;
        this.website = website;
        this.subject = subject;
        this.message = message;
        this.time = time;
        this.owner=user;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getSingleNum() {
        return singleNum;
    }

    public void setSingleNum(String singleNum) {
        this.singleNum = singleNum;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageId='" + messageId + '\'' +
                ", singleNum='" + singleNum + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", website='" + website + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                ", time=" + time +
                ", owner='" + owner + '\'' +
                '}';
    }
}
