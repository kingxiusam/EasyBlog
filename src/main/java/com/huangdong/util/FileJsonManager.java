package com.huangdong.util;

import org.json.JSONObject;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/5/8.
 */
public class FileJsonManager {


    //定义允许上传的文件扩展名
    public static HashMap<String, String> getExtName(){

        HashMap<String,String> extMap = new HashMap<String, String>();
        extMap.put("image", "gif,jpg,jpeg,png,bmp");
        extMap.put("flash", "swf,flv");
        extMap.put("media", "swf,flv,mp3,wav,wma,wmv,mid,avi,mpg,asf,rm,rmvb");
        extMap.put("file", "doc,docx,xls,xlsx,ppt,htm,html,txt,zip,rar,gz,bz2");
        return extMap;

    }

    public static final String[] fileTypes = new String[]{"gif", "jpg", "jpeg", "png", "bmp"};



    public static String getError(String message) {
        JSONObject obj = new JSONObject();
        obj.put("error", 1);
        obj.put("message", message);
        return obj.toString();
    }



}
