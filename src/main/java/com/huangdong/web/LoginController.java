package com.huangdong.web;

import com.huangdong.bean.User;
import com.huangdong.util.CommonConstant;
import com.huangdong.service.mybatis.BaseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created by Administrator on 2017/2/13.
 */
@Controller
@RequestMapping("/login")
public class LoginController extends BaseController{
    /**
     * 自动注入
     */
    @Autowired
    private BaseUserService userService;

    /**
     * 用户登陆
     * @param request
     * @param user
     * @return
     */
    @RequestMapping("/doLogin")
    public ModelAndView login(HttpServletRequest request, User user) {
        User dbUser = userService.findOneUser(user.getUserName());
        ModelAndView mav = new ModelAndView();
        mav.setViewName("forward:/mylogin.jsp");
        if (dbUser == null) {
            mav.addObject("errorMsg", "用户名不存在");
        } else if (!dbUser.getPassWord().equals(user.getPassWord())) {
            mav.addObject("errorMsg", "用户密码不正确");
        } else if (dbUser.getLocked() == User.USER_LOCK) {
            mav.addObject("errorMsg", "用户已经被锁定，不能登录。");
        } else {
            dbUser.setLastLogIp(request.getRemoteAddr());
            dbUser.setLastVisit(new Date());
            userService.loginSuccess(dbUser);
            setSessionUser(request,dbUser);
            String toUrl = (String)request.getSession().getAttribute(CommonConstant.LOGIN_TO_URL);
            request.getSession().removeAttribute(CommonConstant.LOGIN_TO_URL);
            //如果当前会话中没有保存登录之前的请求URL，则直接跳转到主页
            if(StringUtils.isEmpty(toUrl)){
                toUrl = "http://localhost:8080/backmanager/jsp/success.jsp";
            }
            mav.setViewName("redirect:"+toUrl);
        }
        return mav;
    }

    /**
     * 登录注销
     * @param session
     * @return
     */
    @RequestMapping("/doLogout")
    public String logout(HttpSession session) {
        session.removeAttribute(CommonConstant.USER_CONTEXT);
        return "forward:/home.jsp";
    }

    @RequestMapping("/qqLoginSaving")
    private void qqLoginSaving(){

    }
}
