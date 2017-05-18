package com.huangdong.dao.inte;

import com.huangdong.bean.Message;

import java.util.List;

/**
 * Created by Administrator on 2017/3/30.
 */
public interface MessageMybatisDao {
    void insertOneMessage(Message message);
    List<Message> selectMessages(String singleNum);
    void deleteCommunityMessage(int id);

}
