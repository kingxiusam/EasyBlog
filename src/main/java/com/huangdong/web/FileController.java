package com.huangdong.web;

import com.huangdong.bean.Email;
import com.huangdong.bean.Post;
import com.huangdong.service.email.EmailPublishObserver;
import com.huangdong.service.email.EmailPublisher;
import com.huangdong.service.email.EmailReceiverImp;
import com.huangdong.service.mybatis.BaseEmailService;
import com.huangdong.service.mybatis.BasePostService;
import com.huangdong.service.mybatis.EmailService;
import com.huangdong.util.HtmlUnit;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.*;



/**
 * Created by Administrator on 2017/3/26.
 */
@Controller
@RequestMapping("/file")
public class FileController {
    @Autowired
    private EmailPublishObserver emailPublisher;
    @Autowired
    private BaseEmailService emailService;
    @Autowired
    private BasePostService postService;
    private File emailFile;
    byte[] info=null;
    private int singleNum;

    private static final Logger LOGGER=Logger.getLogger(FileController.class);
    //    文件下载

    @RequestMapping("/downLoadFile")
    public ModelAndView downLoadFile(){
        ModelAndView modelAndView=new ModelAndView();
        return modelAndView;
    }



    //    文件上传处理
    @RequestMapping("/upLoadFile")
    public ModelAndView upLoadFile(Post post,@RequestParam("name")String name,
                                     @RequestParam("file")MultipartFile file, HttpServletRequest request) throws IOException {
        List<Email> emails=emailService.listEmail();
        System.out.println(emails.toString());

        List<EmailReceiverImp> emailReceiverImps=new ArrayList<EmailReceiverImp>();
        if(emailReceiverImps!=null){
            info=new byte[10485760];//上传文件的最大占用空间
        }

        for (Email email:emails){
            emailReceiverImps.add(new EmailReceiverImp(email));
        }

        System.out.println(emailReceiverImps.toString());
        emailPublisher.update(emailReceiverImps);
        ModelAndView modelAndView=new ModelAndView();
        if (!file.isEmpty()){
            //可加入是否上传过该文件的判断
            String filePath=request.getSession().getServletContext().getRealPath("\\")+"WEB-INF\\views\\personBlog\\"+file.getOriginalFilename();
            emailFile=new File(filePath);
            file.transferTo(emailFile);//将上传的文件转换成指定路径的文件
            FileInputStream inputStream=new FileInputStream(emailFile);//将指定文件输出到输入流
            inputStream.read(info);//从输入流中读取数据
            inputStream.close();
            String emailContent=info.toString();
            LOGGER.info(emailContent);
            System.out.println(emailContent);
            emailPublisher.publishEmail(new String[]{filePath + file.getOriginalFilename()},emailContent);//通过session获取当前上传文件路径
            //将文章的标题和URL地址写进数据库供文章内容页面使用
            post.setCreateTime(new Date());
            post.setBrowNum(0);//设置浏览次数为0
            post.setPostText("personBlog/"+file.getOriginalFilename());
            postService.insertPost(post);
            modelAndView.setViewName("redirect:/user/success.html");
        }else{
            modelAndView.addObject("operationMsg","文件上传失败");
            modelAndView.setViewName("redirect:/user/error.html");
        }

        return modelAndView;
    }

    /**
     *     发布的帖子内容可分为3部分：1.帖子固定部分header和footer
                                2.帖子动态部分 后台编辑提交:帖子内容, 后台逻辑生成:评论区、系统时间
     */

    @RequestMapping("/pageCreate")
    public ModelAndView pageCreate(HttpServletRequest request) throws IOException {

        ModelAndView modelAndView =new ModelAndView();
        Post post =new Post();
        singleNum = postService.selectMaxId()+1;
        String filePath=request.getSession().getServletContext().getRealPath("\\")+"WEB-INF\\views\\personBlog\\single"+singleNum+".jsp";

        //获取后台CMS提交的数据(在前台上传之前必须对输入进行html文本化)
        String htmlData = request.getParameter("content1") != null ? request.getParameter("content1") : "";
        String tag = request.getParameter("tag");
        String type = request.getParameter("type");
        String title = request.getParameter("title");

        String headHtml = HtmlUnit.getHtmlHeader(title);
        String contentHtml = HtmlUnit.getContent(htmlData,singleNum,tag);

        String HTML = headHtml+contentHtml+HtmlUnit.htmlFooter;

        //需要显示的网页通过file文件流操作创建出文件
        File file =new File(filePath);

        if (file.exists()){//如果提交生成的文件在存在的话就先删除
            file.delete();
        }
        if(file.canRead()){
            System.out.println("可读");

        }
        if (file.canWrite()){
            System.out.println("可写");

        }

        //将拼接后的html写入到上面创建好的文件里面
        FileOutputStream outputStream =new FileOutputStream(file);//将输出流输入到指定文件
        outputStream.write(HTML.getBytes());//将数据写入输出流
        outputStream.close();
        //将文章的标题和URL地址写进数据库供文章内容页面使用
        post.setPostId(singleNum);
        post.setPostType(type);
        post.setPostTitle(title);
        post.setCreateTime(new Date());
        post.setBrowNum(0);//设置浏览次数为0
        post.setPostText("personBlog/single"+singleNum+".jsp");
        postService.insertPost(post);
        modelAndView.setViewName("redirect:/community/showCommunity/"+singleNum+".html");
        singleNum++;

        return modelAndView;
    }


    @RequestMapping("/test")
    public  ModelAndView test(
        HttpServletRequest request) throws IOException {

            ModelAndView modelAndView =new ModelAndView();



            //获取后台CMS提交的数据
            String htmlData = request.getParameter("content1") != null ? request.getParameter("content1") : "";
            String tag = request.getParameter("type");
            String title = request.getParameter("title");
            String htmlInput = htmlspecialchars(htmlData);
            String headHtml = HtmlUnit.getHtmlHeader(title);
            String contentHtml = HtmlUnit.getContent(htmlInput,singleNum,tag);

            String HTML = headHtml+contentHtml+HtmlUnit.htmlFooter;
            System.out.println(HTML);
            return modelAndView;
    }


    private String htmlspecialchars(String str) {
        str = str.replaceAll("&", "&amp;");
        str = str.replaceAll("<", "&lt;");
        str = str.replaceAll(">", "&gt;");
        str = str.replaceAll("\"", "&quot;");
        str = str.replaceAll(" ", "&nbsp;");
        return str;
    }



}
