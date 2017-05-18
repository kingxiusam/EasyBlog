package com.huangdong.web.user;

import com.huangdong.bean.Post;
import com.huangdong.bean.User;
import com.huangdong.service.mybatis.BasePostService;
import com.huangdong.util.Constants;
import com.huangdong.util.Util;
import com.huangdong.service.mybatis.BaseUserService;
import com.huangdong.util.page.PageResultSet;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/14.
 */
@Controller
@RequestMapping("/user")
public class UserController {//在服务器端跳转的是用redirect

    @Autowired
    private BaseUserService userService;
    @Autowired
    private BasePostService postService;
    private static final Logger LOGGER=Logger.getLogger(UserController.class);

    @RequestMapping("/userLogin")
    public ModelAndView userLogin(User userModel){
        ModelAndView modelAndView=new ModelAndView();
        User user=userService.findOneUser(userModel.getUserName());

        if (user!=null){
            if (user.getPassWord().equals(Util.encryptMD5(userModel.getPassWord()))){
                Constants.LOGIN_USER=user.getUserName();
                modelAndView.setViewName("redirect:/user/index.html");
            }else {
                modelAndView.addObject("operationMsg", "密码错误!！重新输入密码");
                modelAndView.setViewName("error.jsp");
            }
        }else {
            modelAndView.addObject("operationMsg","你输入的用户名不存在！！");
            modelAndView.setViewName("error.jsp");
        }

        return modelAndView;

    }
    @RequestMapping("/addUser")
    public String addUser(User userModel){

        User user = new User();
        BeanUtils.copyProperties(userModel, user); //实体属性复制，将userModel中的属性值复制到User中
        user.setUserName(Util.encryptMD5(userModel.getPassWord()));
        userService.insertUser(user);
        return "redirect:/user/index.html";
    }

    @RequestMapping("/index")
    public ModelAndView index() {
        if(Util.isNull(Constants.LOGIN_USER)){
            ModelAndView mav = new ModelAndView("redirect:/mylogin.jsp");
            mav.addObject("errorInfo", "user is overdue!");
            return mav;
        }
        return new ModelAndView("manager");
    }

    @RequestMapping("/getUser")
    public void getUser(HttpServletRequest request, Model model) {
        String userName = request.getParameter("userName");
        User user = userService.findOneUser(userName);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("user", user);
        model.addAttribute("user", user);
    }

    @RequestMapping("/updateUser")
    public String updateUser(User user){
//        Date date = new Date();
        User  userDb= userService.findOneUser(user.getUserName());
        if (Util.isNull(user.getPassWord())) {
            user.setPassWord(userDb.getPassWord());
        }else {
            user.setPassWord(Util.encryptMD5(user.getPassWord()));
        }

        BeanUtils.copyProperties(userDb, user);
        userService.updateUser(user);
        return "redirect:/user/manager.html";
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(HttpServletRequest request){
        String userName= request.getParameter("userName");
        userService.deleteOneUser(userName);
        return "redirect:/user/manager.html";
    }

    @RequestMapping("/exit")
    public String exit(){
        Constants.LOGIN_USER = null;
        return "redirect:/";
    }

    @RequestMapping("/error")
    public ModelAndView error(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("error.jsp");
        return modelAndView;
    }

    @RequestMapping("/success")
    public ModelAndView success(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("success.jsp");
        return modelAndView;
    }

    @RequestMapping("/person")
    public ModelAndView showPerson(){
        ModelAndView modelAndView=new ModelAndView();
        List<Post> postsForTime=postService.selectSortByTime();
        modelAndView.addObject("postsForTime",postsForTime);
        modelAndView.setViewName("personBlog/home.jsp");
        return modelAndView;
    }

    //返回json
    @RequestMapping("/getJsonUserList")
    @ResponseBody
    public ModelMap getJsonUserList(HttpServletRequest request, HttpServletResponse response) {
//        ModelAndView modelAndView=new ModelAndView();
        ModelMap modelMap = new ModelMap();
        response.setHeader("Access-Control-Allow-Origin", "*");
        String sPage = request.getParameter("page");
        int page = 1;//当前页
        if (!Util.isNull(sPage)) {
            page = Integer.parseInt(sPage);
        }
        PageResultSet<User> userPageResult = userService.findPageUserList(page, Constants.PAGE_SIZE);

        modelMap.addAttribute("event",userPageResult.getList());
        modelMap.addAttribute("pageBean", userPageResult.getPage());
        modelMap.addAttribute("pageCount",userPageResult.getPage().getTotalPage());
//        modelAndView.addAllObjects(modelMap);
        LOGGER.info(modelMap);
        return modelMap;
//        return modelAndView;
    }



}
