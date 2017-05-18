package com.huangdong.web;

import com.huangdong.bean.User;
import com.huangdong.service.mybatis.BaseUserService;
import com.huangdong.util.Constants;
import com.huangdong.util.Util;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


/**
 * Created by Administrator on 2017/2/13.
 * 利用Ajax方式进行登录的Controller
 */
@Controller
@RequestMapping("/user")
public class AjaxLoginController {
    @Autowired
    private BaseUserService userService;
    @ResponseBody//此处必定要写明响应体
    @RequestMapping(value = "/login" ,method =  RequestMethod.POST)
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //通过以下几行代码设置浏览器不进行Ajax处理页面的缓存（如果出现缓存，将导致一些不可预知的麻烦）
        response.setContentType("text/html");
        response.setHeader("Cache-Control", "no-store");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);
        PrintWriter out=response.getWriter();
        String userName=request.getParameter("userName").trim();
        String passWord=request.getParameter("passWord").trim();
        User user=userService.findOneUser(userName);
        Constants.LOGIN_USER=user.getUserName();
        System.out.println(user);
        if(user==null){
            out.write("userNameError");
        }else {
                if(!Util.encryptMD5(passWord).equals(user.getPassWord())){
                    out.write("passWordError");
                }else {
                    user.setLastLogIp(request.getRemoteAddr());
                    user.setLastVisit(new Date());
                    userService.loginSuccess(user);
                    out.write("true");
                }
        }


    }


}
