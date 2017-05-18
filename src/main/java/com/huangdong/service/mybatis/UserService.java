package com.huangdong.service.mybatis;

import com.huangdong.bean.LoginLog;
import com.huangdong.bean.User;
import com.huangdong.dao.inte.LogMybatisDao;
import com.huangdong.dao.inte.UserMybatisDao;

import com.huangdong.util.page.Page;
import com.huangdong.util.page.PageResultSet;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;


/**
 * Created by Administrator on 2017/1/16.
 */

@Transactional
public class UserService implements BaseUserService{


    @Autowired
    private UserMybatisDao userMybatisDao;
    @Autowired
    private LogMybatisDao logMybatisDao;

    private static final Logger LOGGER=Logger.getLogger(UserService.class);


    @Override
    public List<User> findUser(String userName){
       return userMybatisDao.findUserByName(userName);
    }

    @Override
    public List<User> selectUserList(int startRow,int limit) {
        return userMybatisDao.selectUserList(startRow, limit);
    }

    @Override
    public void insertUser(User user){
        userMybatisDao.insertOneUser(user);
    }
    @Override
    public void updateUser(User user){
        userMybatisDao.updateUser(user);
    }
    @Override
    public User findOneUser(String userName){
      return   userMybatisDao.findOneUserByName(userName);
    }

    @Override
    public void loginSuccess(User user){
        user.setCredit(5+user.getCredit());
        LoginLog loginLog=new LoginLog();
        loginLog.setUser(user);
        loginLog.setLoginTime(new Date());
        loginLog.setIp(user.getLastLogIp());

        userMybatisDao.updateUser(user);//更新user的积分
        logMybatisDao.insertOneLog(loginLog);//向log表中插入新的LoginLog
    }

    @Override
    public void log(String logInfo){
       LOGGER.info(logInfo);
    }

    @Override
    public List<User> selectAllUser() {
        return userMybatisDao.selectAllUser();
    }

    /**
 * 计算总记录数
 */
    @Override
    public long count() {
        return this.selectAllUser().size();
    }

    @Override
    public void deleteOneUser(String userName) {
        userMybatisDao.deleteOneUser(userName);
    }

    @Override
    public PageResultSet<User> findPageUserList(int page, int pageSize) {
        PageResultSet<User> pageResultSet=new PageResultSet<User>();
        //这里用到了Page类中的获取首页和分页大小的方法

        List<User> userList=userMybatisDao.selectUserList((page-1)*pageSize,pageSize);
        Long totalRow=this.count();
        Page pages=new Page(totalRow.intValue(),pageSize,page);
        pageResultSet.setList(userList);
        pageResultSet.setPage(pages);
        return pageResultSet;
    }
}
