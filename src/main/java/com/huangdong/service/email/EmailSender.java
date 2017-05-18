package com.huangdong.service.email;

import com.huangdong.bean.Email;
import com.sun.mail.util.MailSSLSocketFactory;
import org.apache.log4j.Logger;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.security.GeneralSecurityException;
import java.util.Properties;

/**
 * Created by Administrator on 2017/3/23.
 */
public class EmailSender implements Runnable,IEmailSender{

    private static final Logger LOGGER=Logger.getLogger(EmailSender.class);

    //用于给用户发送邮件的个人邮箱地址
    private String  myEmailAdress="1459951296@qq.com";
    //邮箱用户名
    private String userName="HuangDong";
    //邮箱的授权密码
    private String password="hspqupyocaryibdf";
    //qq邮箱的服务器地址
    private String emailHost="smtp.qq.com";
    private Email email;
    private MailSSLSocketFactory mailSSLSocketFactory=null;

    public EmailSender(Email email){
        this.email=email;
    }

    //在run方法里面发送邮件给指定用户
    @Override
    public void run() {

        try {
            mailSSLSocketFactory=new MailSSLSocketFactory();
            mailSSLSocketFactory.setTrustAllHosts(true);
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }

        Properties properties=new Properties();
        properties.setProperty("mail.host",emailHost);
        properties.setProperty("mail.transport.protocol","smtp");
        properties.setProperty("mail.smtp.auth","true");
        properties.setProperty("mail.smtp.ssl.enable","true");
        properties.setProperty("mail.smtp.socketFactory.port","465");
        properties.setProperty("mail.smtp.socketFactory.fallback","false");
        properties.put("mail.smtp.ssl.socketFactory",mailSSLSocketFactory);
        Session session=Session.getDefaultInstance(properties);
        session.setDebug(true);
        Transport transport= null;
        try {
            transport = session.getTransport();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
            LOGGER.error("获取发送邮件的连接会话失败");
        }
        try {
            transport.connect(emailHost,myEmailAdress,password);
            Message message=sendMessage(session,email);//通过会话和对应的用户找到对应的message
            transport.sendMessage(message,message.getAllRecipients());//通过当前会话对message进行发送
        } catch (MessagingException e) {
            e.printStackTrace();
            LOGGER.error("连接目标邮件地址失败");
        }

    }

    public Message sendMessage(Session session,Email email){
        MimeMessage mimeMessage=new MimeMessage(session);
        try {
            mimeMessage.setFrom(new InternetAddress(myEmailAdress));
            //邮件发送方式和邮件发送地址
            mimeMessage.setRecipient(Message.RecipientType.TO,new InternetAddress(email.getEmail()));
            mimeMessage.setSubject("邮件订阅 from "+userName);
            String info="非常感谢，你已经成功订阅此博客动态，系统将时刻为你推送博客的最新动态";
            mimeMessage.setContent(info,"text/html;charset=UTF-8");
            mimeMessage.saveChanges();

        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return mimeMessage;
    }


}
