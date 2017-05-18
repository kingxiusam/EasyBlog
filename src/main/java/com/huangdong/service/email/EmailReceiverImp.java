package com.huangdong.service.email;

import com.huangdong.bean.Email;

/**
 * Created by Administrator on 2017/3/23.
 */
public class EmailReceiverImp implements IEmailReceiver {

    private Email email;
    private String[] filePath;
    private String emailContent;


    public String[] getFilePath() {
        return filePath;
    }

    public void setFilePath(String[] filePath) {
        this.filePath = filePath;
    }

    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }


    public EmailReceiverImp(){

    }
    public EmailReceiverImp(Email email){
        this.email=email;
    }

    //此方法作为邮件发布后自动接收邮件(广播到所有订阅者)
    @Override
    public void subscribe() {
        BlogEmailSender emailSender=new BlogEmailSender(email);
        emailSender.setSendFileName(filePath);
        emailSender.setContent(emailContent);
        Thread sendThread=new Thread(emailSender);
        sendThread.start();

    }
}
