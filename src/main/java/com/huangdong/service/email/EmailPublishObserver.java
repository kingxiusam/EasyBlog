package com.huangdong.service.email;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/23.
 * 邮件发布者抽象，包含核心邮件订阅者列表体现观察者模式
 */
public abstract class EmailPublishObserver {
    public List<EmailReceiverImp> emailReceiverImps=new ArrayList<EmailReceiverImp>();//订阅者列表

    public void addEmailReceiver(EmailReceiverImp emailReceiverImp){
        this.emailReceiverImps.add(emailReceiverImp);
    }

    public void deleteEmailReceiver(EmailReceiverImp emailReceiverImp){
        this.emailReceiverImps.remove(emailReceiverImp);
    }
    //订阅列表更新的抽象方法
    public abstract void update(List<EmailReceiverImp> emailReceiverImps);
    //邮件发布抽象方法
    /**
     * @param filePath 所需发送邮件的路径地址
     */
    public abstract void publishEmail(String[] filePath,String emailContent);



}
