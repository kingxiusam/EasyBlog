package com.huangdong.dao.inte;

import com.huangdong.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/1/14.
 * 接口的名称和映射的命名空间相同
 * 接口方法与映射基的id相同
 */
public interface UserMybatisDao {
    List<User> findUserByName(String userName);
    List<User> selectUserList(int startRow,int limit);
    List<User> selectAllUser();
    User findOneUserByName(String userName);
    void insertOneUser(User user);
    void updateUser(User user);
    void deleteOneUser(String userName);
}
