package com.huangdong.service.mybatis;

import com.huangdong.bean.CommunityMessage;
import com.huangdong.dao.inte.CommunityMybatisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/4/2.
 */
@Service("communityService")
@Transactional
public class CommunityService implements BaseCommunityService {
    @Autowired
    private CommunityMybatisDao communityMybatisDao;
    @Override
    public List<CommunityMessage> selectCommunityMessages() {
        return communityMybatisDao.selectCommunityMessages();
    }

    @Override
    public void insertOneCommunityMessage(CommunityMessage communityMessage) {
        communityMybatisDao.insertOneCommunityMessage(communityMessage);
    }
}
