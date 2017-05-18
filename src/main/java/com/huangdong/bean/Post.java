package com.huangdong.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/1/7.
 */
public class Post implements Serializable {
    private int postId;
    private int  browNum;
    private String postType;
    private String postTitle;
    private String postText;
    private Date createTime;
    private int commentNum;

    public Post(){

    }

    public Post(int postId, int browNum, String postType, String postTitle, String postText, Date createTime,int commentNum) {
        this.postId = postId;
        this.browNum = browNum;
        this.postType = postType;
        this.postTitle = postTitle;
        this.postText = postText;
        this.createTime = createTime;
        this.commentNum = commentNum;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getBrowNum() {
        return browNum;
    }

    public void setBrowNum(int browNum) {
        this.browNum = browNum;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(int commentNum) {
        this.commentNum = commentNum;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", browNum=" + browNum +
                ", postType='" + postType + '\'' +
                ", postTitle='" + postTitle + '\'' +
                ", postText='" + postText + '\'' +
                ", createTime=" + createTime +
                ", commentNum=" + commentNum +
                '}';
    }
}
