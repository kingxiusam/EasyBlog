package com.huangdong.service.mybatis;

import com.huangdong.bean.Topic;

import java.util.List;

/**
 * Created by Administrator on 2017/3/3.
 */
public interface BaseTopicService {
    List<Topic> findTopic(int topicId);

    Topic findOneTopic(int topicId);

    void insertTopic(Topic topic);

    void updateTopic(Topic topic);
}
