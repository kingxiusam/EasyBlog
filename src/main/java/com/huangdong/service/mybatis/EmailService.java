package com.huangdong.service.mybatis;

import com.huangdong.bean.Email;
import com.huangdong.dao.inte.EmailMybatisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/3/23.
 */
@Service("emailService")
@Transactional
public class EmailService implements BaseEmailService {

    @Autowired
    private EmailMybatisDao emailMybatisDao;

    @Override
    public List<Email> listEmail() {
        return emailMybatisDao.listEmail();
    }

    @Override
    public void insertOneEmail(Email email) {
        emailMybatisDao.insertOneEmail(email);
    }

    @Override
    public void updateEmail(Email email) {
        emailMybatisDao.updateEmail(email);
    }

    @Override
    public void deleteOneEmail(String email) {
        emailMybatisDao.deleteOneEmail(email);
    }

    @Override
    public Email selectOneEmail(String email) {
        return emailMybatisDao.selectOneEmail(email);
    }
}
