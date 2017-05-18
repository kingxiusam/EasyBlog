package com.huangdong.dao.inte;

import com.huangdong.bean.Topic;

import java.util.List;

/**
 * Created by Administrator on 2017/1/14.
 */
public interface TopicMybatisDao {
    List<Topic> findTopicById(int topicId);
    Topic findOneTopicById(int topicId);
    void insertOneTopic(Topic topic);
    void updateTopic(Topic topic);
}

