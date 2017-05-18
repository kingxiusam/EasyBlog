package com.huangdong.web.blog;

import com.huangdong.bean.CommunityMessage;
import com.huangdong.bean.Message;
import com.huangdong.bean.Post;
import com.huangdong.service.mybatis.BaseMessageService;
import com.huangdong.service.mybatis.BasePostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/4/2.
 */
@Controller
@RequestMapping("/community")
public class CommunityController {
    @Autowired
    private BaseMessageService messageService;
    @Autowired
    private BasePostService postService;
    @RequestMapping("/showCommunity/{singleNum}")
    public ModelAndView showCommunity(@PathVariable("singleNum") String singleNum,HttpServletRequest request){//适用于get，POST请求
        ModelAndView modelAndView=new ModelAndView();
        String userName= (String) request.getSession().getAttribute("userName");
        System.out.print(userName);
        if(userName==null){
            modelAndView.setViewName("redirect:/");//会话中不存在用户名则跳转到主页
            return modelAndView;
        }
        List<Message> communityMessages=messageService.selectMessages(singleNum);
        Post post=postService.findOnePostById(Integer.parseInt(singleNum));
        //评论条数
        int commentNum=communityMessages.size();
        //查找相应topId的帖子并将commentNum进行更新
        if (post!=null){
            post.setCommentNum(commentNum);
            postService.updatePost(post);
            modelAndView.addObject("post",post);
        }


        modelAndView.addObject("communityList",communityMessages);
        if (userName==null){
            modelAndView.addObject("userName","游客"+String.valueOf(Math.random()));
        }else {
            modelAndView.addObject("userName",userName);
        }
        modelAndView.setViewName("personBlog/single"+singleNum+".jsp");
        return modelAndView;//查询结果也可返回解释成json形式让用户在提交评论后使用Ajax在当前页进行刷新页面即可
    }


    @RequestMapping(value = "/addOneCommunity/{user}/{singleNum}")
    public String addOneCommunity(@PathVariable("singleNum") String singleNum,@PathVariable("user") String user, Message message,HttpServletRequest request){
        message.setTime(new Date());
        message.setSingleNum(singleNum);
        message.setOwner(user);
        System.out.print(message.toString());
        messageService.insertOneMessage(message);
        return "redirect:/community/showCommunity/"+singleNum+".html";
    }

    @RequestMapping(value = "/{singleNum}/deleteCommunity",method = RequestMethod.GET)
    public String deleteCommunity(@PathVariable("singleNum") String singleNum,HttpServletRequest request){
        String id=request.getParameter("messageId");
        messageService.deleteCommunityMessage(Integer.parseInt(id));
        return "redirect:/community/showCommunity/"+singleNum+".html";
    }
}
