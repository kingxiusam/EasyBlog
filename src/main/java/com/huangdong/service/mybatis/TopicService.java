package com.huangdong.service.mybatis;

import com.huangdong.bean.Topic;
import com.huangdong.dao.inte.TopicMybatisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/1/16.
 */

@Transactional
public class TopicService implements BaseTopicService{
    @Autowired
    private TopicMybatisDao topicMybatisDao;
    @Override
    public List<Topic> findTopic(int topicId){
        return    topicMybatisDao.findTopicById(topicId);
    }
    @Override
    public Topic findOneTopic(int topicId){
        return topicMybatisDao.findOneTopicById(topicId);
    }
    @Override
    public void insertTopic(Topic topic){
        topicMybatisDao.insertOneTopic(topic);
    }
    @Override
    public void updateTopic(Topic topic){
        topicMybatisDao.updateTopic(topic);
    }


}
