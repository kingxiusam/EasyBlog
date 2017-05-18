package com.huangdong.service.mybatis;

import com.huangdong.bean.LoginLog;

import java.util.List;

/**
 * Created by Administrator on 2017/3/3.
 */
public interface BaseLogService {
    List<LoginLog> findLogById(int logId);
    LoginLog findOneLog(int logId);
    void inserLog(LoginLog loginLog);
    void updateLog(LoginLog loginLog);
}
