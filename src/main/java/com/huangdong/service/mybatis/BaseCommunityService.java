package com.huangdong.service.mybatis;

import com.huangdong.bean.CommunityMessage;

import java.util.List;

/**
 * Created by Administrator on 2017/4/2.
 */
public interface BaseCommunityService
{
    List<CommunityMessage> selectCommunityMessages();
    void insertOneCommunityMessage(CommunityMessage communityMessage);
}
