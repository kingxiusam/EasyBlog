package com.huangdong.web;

import com.huangdong.util.Constants;
import com.huangdong.util.Util;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/5/10.
 */
@Controller
@RequestMapping("/manager")
public class ManagerController {

    @RequestMapping("/user")
    public ModelAndView userManager(){
        if(Util.isNull(Constants.LOGIN_USER)){
            ModelAndView mav = new ModelAndView("redirect:/mylogin.jsp");
            mav.addObject("errorInfo", "user is overdue!");
            return mav;
        }
        return new ModelAndView("userList");
    }

    @RequestMapping("/post")
    public ModelAndView postManager(){
        if(Util.isNull(Constants.LOGIN_USER)){
            ModelAndView mav = new ModelAndView("redirect:/mylogin.jsp");
            mav.addObject("errorInfo", "user is overdue!");
            return mav;
        }
        return new ModelAndView("postList");
    }


    @RequestMapping("/log")
    public ModelAndView logManager(){
        if(Util.isNull(Constants.LOGIN_USER)){
            ModelAndView mav = new ModelAndView("redirect:/mylogin.jsp");
            mav.addObject("errorInfo", "user is overdue!");
            return mav;
        }
        return new ModelAndView("logList");
    }

    @RequestMapping("/email")
    public ModelAndView emailManager(){
        if(Util.isNull(Constants.LOGIN_USER)){
            ModelAndView mav = new ModelAndView("redirect:/mylogin.jsp");
            mav.addObject("errorInfo", "user is overdue!");
            return mav;
        }
        return new ModelAndView("emailList");
    }

    @RequestMapping("/file")
    public ModelAndView fileManager() {
        if (Util.isNull(Constants.LOGIN_USER)) {
            ModelAndView mav = new ModelAndView("redirect:/mylogin.jsp");
            mav.addObject("errorInfo", "user is overdue!");
            return mav;
        }
        return new ModelAndView("fileList");

    }
        @RequestMapping("/kindEdit")
        public ModelAndView kindEdit(){
            if(Util.isNull(Constants.LOGIN_USER)){
                ModelAndView mav = new ModelAndView("redirect:/mylogin.jsp");
                mav.addObject("errorInfo", "user is overdue!");
                return mav;
            }
            return new ModelAndView("/kindeditor/demo.jsp");


    }


}
