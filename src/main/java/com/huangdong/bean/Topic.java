package com.huangdong.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/1/7.
 */
public class Topic implements Serializable {

    private int topicId;
    private String topicTitle;
    private Date createTime;
    private Date lastPost;//最近发帖时间
    private int browNum;//浏览数
    private int replies;
    private int digest;//是否为精华帖


    public Topic(){

    }
    public Topic(int topicId, String topicTitle, Date createTime, Date lastPost, int browNum, int replies, int digest) {
        this.topicId = topicId;
        this.topicTitle = topicTitle;
        this.createTime = createTime;
        this.lastPost = lastPost;
        this.browNum = browNum;
        this.replies = replies;
        this.digest = digest;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public String getTopicTitle() {
        return topicTitle;
    }

    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastPost() {
        return lastPost;
    }

    public void setLastPost(Date lastPost) {
        this.lastPost = lastPost;
    }

    public int getBrowNum() {
        return browNum;
    }

    public void setBrowNum(int browNum) {
        this.browNum = browNum;
    }

    public int getReplies() {
        return replies;
    }

    public void setReplies(int replies) {
        this.replies = replies;
    }

    public int getDigest() {
        return digest;
    }

    public void setDigest(int digest) {
        this.digest = digest;
    }
}
