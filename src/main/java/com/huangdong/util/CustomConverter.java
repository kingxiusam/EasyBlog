package com.huangdong.util;

import com.huangdong.bean.User;
import org.springframework.core.convert.converter.Converter;

import java.util.Date;

/**
 * Created by Administrator on 2017/2/27.
 */
public class CustomConverter implements Converter<String,User> {

    @Override
    public User convert(String source) {//原格式String:用户名::用户类型::密码::用户状态::上次登录的IP地址::上次登录时间::用户积分
        User user=new User();
        if (source!=null){
            String[] items=source.split(":");
            user.setUserName(items[0]);
            user.setUserType(items[1]);
            user.setPassWord(items[2]);
            user.setLocked(Integer.parseInt(items[3]));
            user.setLastLogIp(items[4]);
            user.setLastVisit(new Date(items[5]));
            user.setCredit(Integer.parseInt(items[6]));
        }

        return user;
    }
}
