package com.huangdong.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/1/8.
 */
public class Board implements Serializable{
    private int boardId;
    private String boardName;
    private String boardDesc;
    private int topicNum;//板块下的主题数目
    private Post mainPOST;//主题帖

    public Board(){

    }

    public Board(int boardId, String boardName, String boardDesc, int topicNum, Post mainPOST) {
        this.boardId = boardId;
        this.boardName = boardName;
        this.boardDesc = boardDesc;
        this.topicNum = topicNum;
        this.mainPOST = mainPOST;
    }

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public String getBoardDesc() {
        return boardDesc;
    }

    public void setBoardDesc(String boardDesc) {
        this.boardDesc = boardDesc;
    }

    public int getTopicNum() {
        return topicNum;
    }

    public void setTopicNum(int topicNum) {
        this.topicNum = topicNum;
    }

    public Post getMainPOST() {
        return mainPOST;
    }

    public void setMainPOST(Post mainPOST) {
        this.mainPOST = mainPOST;
    }
}
