package com.huangdong.web.blog;

import com.huangdong.bean.Message;
import com.huangdong.bean.Post;
import com.huangdong.service.mybatis.BaseMessageService;
import com.huangdong.service.mybatis.BasePostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2017/3/30.
 */
@Controller
@RequestMapping("/single")
public class SingleController {
    @Autowired
    private BaseMessageService messageService;
    @Autowired
    private BasePostService postService;
    @RequestMapping("/showSingle{singleNum}")
    public ModelAndView showFirstSingle(@PathVariable("singleNum") String singleNum, HttpServletRequest request){
        ModelAndView modelAndView=new ModelAndView();
        String userName= (String) request.getSession().getAttribute("userName");//在登录成功进入到home.jsp是设置了session,这样在后面的多个页面浏览是都可以获取相应的值
        List<Message> communityMessages=messageService.selectMessages(singleNum);
        modelAndView.addObject("communityList",communityMessages);
        modelAndView.addObject("userName",userName);
        modelAndView.setViewName("personBlog/single"+singleNum+".jsp");
        return modelAndView;
        //方案2：查询结果返回解释成json形式让用户在提交评论后使用Ajax在当前页进行刷新页面即可
    }


    @RequestMapping("/showMoreSingle")
    public ModelAndView showMoreSingle(){
        ModelAndView modelAndView=new ModelAndView();
        List<Post> postsForTime=postService.selectSortByTime();
        List<Post> postsForNum=postService.selectSortByNum();
        modelAndView.addObject("postsForTime",postsForTime);
        modelAndView.addObject("postsForNum",postsForNum);
        modelAndView.setViewName("personBlog/contentdetail.jsp");
        return modelAndView;
    }


    @RequestMapping("/countNum_{postId}")
    public String countNum(@PathVariable("postId") String id,HttpServletRequest request){
        //String url=request.getParameter("url");
        Post post=postService.findPostById(Integer.parseInt(id)).get(0);
        System.out.println(id);
        int browNum = post.getBrowNum()+1;
        post.setBrowNum(browNum);
        postService.updatePost(post);
        return  "redirect:/community/showCommunity/"+id+".html";
    }

    @RequestMapping(value = "/searchContent",method = RequestMethod.POST)
    public ModelAndView searchContent(Post post){

        ModelAndView modelAndView = new ModelAndView();
        System.out.println(post.getPostTitle());
        List<Post> results = postService.selectByKey(post.getPostTitle());
        modelAndView.addObject("resultList",results);
        modelAndView.setViewName("personBlog/searchResult.jsp");
        return modelAndView;
    }



}
