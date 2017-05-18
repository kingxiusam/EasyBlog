package com.huangdong.web;

import com.huangdong.bean.Email;
import com.huangdong.service.mybatis.BaseEmailService;
import com.huangdong.service.mybatis.EmailService;
import com.huangdong.service.email.EmailSender;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Created by Administrator on 2017/3/23.
 */
@Controller
@RequestMapping("/email")
public class EmailController {
    @Autowired
    private BaseEmailService emailService;
    private static final Logger LOGGER=Logger.getLogger(EmailController.class);

    @RequestMapping(value = "/subscribe",method = RequestMethod.GET)
    public String subscribeEmail(HttpServletRequest request, ModelMap modelMap){
        String emailString=request.getParameter("email");
        String userName=request.getParameter("username");
        Email email=new Email(userName,emailString);
        try{
            if(emailService.selectOneEmail(emailString)==null) {
                emailService.insertOneEmail(email);
                EmailSender emailSender = new EmailSender(email);
                Thread senderThread=new Thread(emailSender);
                senderThread.start();
                modelMap.addAttribute("operationMsg", "恭喜你，你已经成功订阅博客！！");
                return "success.jsp";
            }
            else {
                modelMap.addAttribute("operationMsg", "你已经订阅过博客！！");
                return "success.jsp";
            }
        }catch (Exception e){
            e.printStackTrace();
            modelMap.addAttribute("operationMsg","对不起，你在订阅博客时发生了错误，待页面自动跳转后可重新订阅！！");
            return "redirect:/user/error.html";
        }


    }


    @RequestMapping(value = "/filter",method = RequestMethod.POST)
    @ResponseBody
    public void filter(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //通过以下几行代码设置浏览器不进行Ajax处理页面的缓存（如果出现缓存，将导致一些不可预知的麻烦）
        response.setContentType("text/html");
        response.setHeader("Cache-Control", "no-store");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);
        PrintWriter out=response.getWriter();
        String emailString=request.getParameter("input").trim();
        LOGGER.info(emailString);
        Email email=emailService.selectOneEmail(emailString);
        if(email==null){
            out.write("success");
        }else {
            out.write("fail");
        }
    }



}
