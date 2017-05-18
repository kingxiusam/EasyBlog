package com.huangdong.service.mybatis;

import com.huangdong.bean.LoginLog;
import com.huangdong.dao.inte.LogMybatisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/1/16.
 */
@Transactional
public class LogService implements BaseLogService{
    @Autowired
    private LogMybatisDao logMybatisDao;
    @Override
    public List<LoginLog> findLogById(int logId){
        return logMybatisDao.findLogById(logId);
    }
    @Override
    public LoginLog findOneLog(int logId){
        return logMybatisDao.findOneLogById(logId);
    }
    @Override
    public void inserLog(LoginLog loginLog){
        logMybatisDao.insertOneLog(loginLog);
    }
    @Override
    public void updateLog(LoginLog loginLog){
        logMybatisDao.updateLog(loginLog);
    }
}
