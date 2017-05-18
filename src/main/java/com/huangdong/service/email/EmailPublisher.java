package com.huangdong.service.email;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/3/23.
 * 邮件广播发布
 */
@Service("emailPublisher")
public class EmailPublisher extends EmailPublishObserver{
    private List<EmailReceiverImp> emailReceiverImps;

    @Override
    public void update(List<EmailReceiverImp> emailReceiverImps) {
        this.emailReceiverImps=emailReceiverImps;
    }

    @Override
    public void publishEmail(String[] filePath,String emailContent) {
            for (EmailReceiverImp emailReceiverImp:emailReceiverImps){
                emailReceiverImp.setFilePath(filePath);
                emailReceiverImp.setEmailContent(emailContent);
                emailReceiverImp.subscribe();
            }
    }
}
