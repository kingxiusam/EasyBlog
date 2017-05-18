package com.huangdong.service.email;


import com.huangdong.bean.Email;

import javax.mail.Message;
import javax.mail.Session;

/**
 * Created by Administrator on 2017/3/28.
 */
public interface IEmailSender {

     Message sendMessage(Session session, Email email);
}
