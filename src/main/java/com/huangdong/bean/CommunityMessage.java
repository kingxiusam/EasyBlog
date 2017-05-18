package com.huangdong.bean;

/**
 * Created by Administrator on 2017/4/2.
 */
public class CommunityMessage {
    private Integer id;
    private String owner;
    private String uname;
    private String text;

    public  CommunityMessage(){

    }

    public CommunityMessage(Integer id, String owner, String uname, String text) {
        this.id = id;
        this.owner = owner;
        this.uname = uname;
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public String toString() {
        return "CommunityMessage{" +
                "id=" + id +
                ", owner='" + owner + '\'' +
                ", uname='" + uname + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
