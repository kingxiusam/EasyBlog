package com.huangdong.dao.inte;

import com.huangdong.bean.LoginLog;
import java.util.List;

/**
 * Created by Administrator on 2017/1/14.
 */
public interface LogMybatisDao {
    List<LoginLog> findLogById(int logId);
    LoginLog findOneLogById(int logId);
    void insertOneLog(LoginLog loginLog);
    void updateLog(LoginLog loginLog);

}
