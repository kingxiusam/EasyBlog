package com.huangdong.service.mybatis;

import com.huangdong.bean.Message;
import com.huangdong.dao.inte.MessageMybatisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.unitils.database.annotations.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/3/30.
 */
@Service("messageService")
@Transactional
public class MessageService implements BaseMessageService {
    @Autowired
    private MessageMybatisDao messageMybatisDao;

     @Override
    public void insertOneMessage(Message message) {
        messageMybatisDao.insertOneMessage(message);
    }

    @Override
    public List<Message> selectMessages(String singleNum) {
        return messageMybatisDao.selectMessages(singleNum);
    }

    @Override
    public void deleteCommunityMessage(int id) {
        messageMybatisDao.deleteCommunityMessage(id);
    }
}
