package com.huangdong.dao.inte;

import com.huangdong.bean.Post;

import java.util.List;

/**
 * Created by Administrator on 2017/1/14.
 */
public interface PostMybatisDao {
    List<Post> findPostById(int postId);
    Post findOnePostById(int postId);
    int selectMaxId();
    List<Post> selectByKey(String key);
    void insertOnePost(Post post);
    void updatePost(Post post);
    List<Post> selectSortByTime();
    List<Post> selectSortByNum();
}
