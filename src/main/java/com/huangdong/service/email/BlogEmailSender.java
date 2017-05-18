package com.huangdong.service.email;

import com.huangdong.bean.Email;
import com.sun.mail.util.MailSSLSocketFactory;
import org.apache.log4j.Logger;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.Properties;

/**
 * Created by Administrator on 2017/3/28.
 */
public class BlogEmailSender implements Runnable,IEmailSender {

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
    private MailSSLSocketFactory mailSSLSocketFactory= null;
    //需要发送的文件名
    private String[] sendFileName;
    //需要发送的邮件内容
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String[] getSendFileName() {
        return sendFileName;
    }

    public void setSendFileName(String[] sendFileName) {
        this.sendFileName = sendFileName;
    }

    public BlogEmailSender(Email email) {
        this.email = email;
    }



    @Override
    public Message sendMessage(Session session, Email email) {
        MimeMessage mimeMessage=new MimeMessage(session);
        try {
            mimeMessage.setFrom(new InternetAddress(myEmailAdress));
            //邮件发送方式和邮件发送地址
            mimeMessage.setRecipient(Message.RecipientType.TO,new InternetAddress(email.getEmail()));
            mimeMessage.setSubject("每周博客");
            String blogPage=this.getContent();//获取最近上传的博客发送
            //MimeMultipart类是一个容器类，包含MimeBodyPart类型的对象
            Multipart mainPart = new MimeMultipart();
            MimeBodyPart messageBodyPart = new MimeBodyPart();//创建一个包含附件内容的MimeBodyPart
            //设置HTML内容
            messageBodyPart.setContent(blogPage,"text/html;charset=UTF-8");
            mainPart.addBodyPart(messageBodyPart);
            //存在附件
            String[] filePaths=this.getSendFileName();
            if (filePaths!=null&&filePaths.length>0){
                for(String filePath:filePaths){
                    File file=new File(filePath);
                    //附件是否存在磁盘中
                    if (file.exists()){
                        FileDataSource fileDataSource=new FileDataSource(file);
                        //得到附件本身并至入BodyPart
                        messageBodyPart.setDataHandler(new DataHandler(fileDataSource));
                        //得到文件名至入BodyPart
                        messageBodyPart.setFileName(filePath);
                        mainPart.addBodyPart(messageBodyPart);
                    }
                }
            }
            mimeMessage.setContent(mainPart);//将mainPart容器置入mimeMessage邮件体中
            mimeMessage.saveChanges();

        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return mimeMessage;
    }



    @Override
    public void run() {


        try {
            mailSSLSocketFactory = new MailSSLSocketFactory();
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
            e.printStackTrace();
            LOGGER.error("获取发送邮件的连接会话失败");
        }


        try {
            transport.connect(emailHost,myEmailAdress,password);
            Message message=sendMessage(session,email);//通过会话和对应的用户找到对应的message
            transport.sendMessage(message,message.getAllRecipients());//通过当前会话对message进行发送
        } catch (MessagingException e) {
            e.printStackTrace();
            e.printStackTrace();
            LOGGER.error("连接目标邮件地址失败");
        }

    }
}
