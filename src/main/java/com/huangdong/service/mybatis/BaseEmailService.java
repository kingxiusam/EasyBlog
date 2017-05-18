package com.huangdong.service.mybatis;

import com.huangdong.bean.Email;

import java.util.List;

/**
 * Created by Administrator on 2017/3/23.
 */
public interface BaseEmailService {
    void insertOneEmail(Email email);
    void updateEmail(Email email);
    void deleteOneEmail(String email);
    Email selectOneEmail(String email);
    List<Email> listEmail();

}
