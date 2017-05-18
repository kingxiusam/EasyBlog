package com.huangdong.service.mybatis;

import com.huangdong.bean.User;
import com.huangdong.util.page.PageResultSet;

import java.util.List;

/**
 * Created by Administrator on 2017/3/3.
 */
public interface BaseUserService {
    List<User> findUser(String userName);
    List<User> selectUserList(int startRow,int limit);
    List<User> selectAllUser();
    void insertUser(User user);
    void updateUser(User user);
    void deleteOneUser(String userName);
    User findOneUser(String userName);
    void loginSuccess(User user);
    void log(String logInfo);
    long count();
    PageResultSet<User> findPageUserList(int page, int pageSize);

}
