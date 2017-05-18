package com.huangdong.util;

import com.huangdong.bean.User;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

/**
 * Created by Administrator on 2017/2/28.
 */
public class MyBindingInitializer implements WebBindingInitializer {//全局的自定义编辑器
    @Override
    public void initBinder(WebDataBinder webDataBinder, WebRequest webRequest) {
        webDataBinder.registerCustomEditor(User.class,new UserEditor());
    }
}
