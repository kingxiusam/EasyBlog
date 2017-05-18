package com.huangdong.web.blog;

import com.huangdong.bean.Message;
import com.huangdong.service.mybatis.BaseMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/3/30.
 */
@Controller
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    private BaseMessageService messageService;

    @RequestMapping("/sendContactMessage")
    public ModelAndView sendContactMessage(Message message){
        ModelAndView modelAndView=new ModelAndView();

        try {
          messageService.insertOneMessage(message);
          modelAndView.addObject("operationMsg","消息发送成功");
          modelAndView.setViewName("success.jsp");
          return modelAndView;
      }catch (Exception e){
          modelAndView.addObject("operationMsg","消息发送过程出现错误，错误详情："+e.getMessage());
          modelAndView.setViewName("error.jsp");

            return modelAndView;
      }



    }

    @RequestMapping("/aboutMe")

    public ModelAndView showAbout(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/about.jsp");
        return modelAndView;
    }
}
