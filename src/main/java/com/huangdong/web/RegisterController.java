package com.huangdong.web;

import com.huangdong.bean.User;
import com.huangdong.dao.inte.UserMybatisDao;
import com.huangdong.service.mybatis.BaseUserService;
import com.huangdong.service.mybatis.UserService;
import com.huangdong.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by Administrator on 2017/2/2.
 * 用户注册的Action/Controller
 */

@Controller   /*处理请求的控制器*/
@RequestMapping("/user")
public class RegisterController {

    @Autowired
    private BaseUserService userService;//注入业务层bean


    //处理/user的请求从而创建User对象，调用UserService保存Service并返回ModelAndView

    @RequestMapping(value = "/register",method = RequestMethod.POST)/*处理来自 register URI的请求 请求的方法为Post*/
    public ModelAndView createUser(HttpServletRequest request, User user){

        ModelAndView modelAndView=new ModelAndView();
        String ip=request.getRemoteAddr();
        String userName=user.getUserName();
        String password= Util.encryptMD5(user.getPassWord());
        try{
            if (userService.findOneUser(userName)!=null){
                modelAndView.addObject("operationMsg","用户名已存在，请选择其他用户名");
            }else {
                user.setLastLogIp(ip);
                user.setUserType("普通用户");
                user.setLocked(0);
                user.setCredit(0);
                user.setPassWord(password);
                user.setLastVisit(new Date());
                userService.insertUser(user);
                modelAndView.addObject("operationMsg","注册成功");
                modelAndView.setViewName("success.jsp");//视图解释器将/success解释为/WEB-INF/views/success.jsp  p:prefix="/WEB-INF/views/"

            }

        }catch (Exception e){
            modelAndView.addObject("operationMsg",e.toString());//相当于request.setAttribute("errorMsg","用户名已存在，请选择其他用户名")
            modelAndView.setViewName("error.jsp");
        }

        modelAndView.addObject("user",user);//success.jsp可以访问到模型数据user
        return modelAndView;
    }







}
