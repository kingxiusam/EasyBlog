package com.huangdong.service.mybatis;

import com.huangdong.bean.Post;

import java.util.List;

/**
 * Created by Administrator on 2017/3/3.
 */
public interface BasePostService {
    List<Post> findPostById(int postId);
    Post findOnePostById(int postId);
    int selectMaxId();
    List<Post> selectByKey(String key);
    void insertPost(Post post);
    void updatePost(Post post);
    List<Post> selectSortByTime();
    List<Post> selectSortByNum();

}
