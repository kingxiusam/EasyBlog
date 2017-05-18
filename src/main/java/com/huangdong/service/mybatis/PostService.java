package com.huangdong.service.mybatis;

import com.huangdong.bean.Post;
import com.huangdong.dao.inte.PostMybatisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/1/16.
 */

@Transactional
public class PostService implements BasePostService{
    @Autowired
    private PostMybatisDao postMybatisDao;
    @Override
    public List<Post> findPostById(int postId){
        return postMybatisDao.findPostById(postId);
    }

    @Override
    public void insertPost(Post post){
        postMybatisDao.insertOnePost(post);
    }
    @Override
    public void updatePost(Post post){
        postMybatisDao.updatePost(post);
    }
    @Override
    public List<Post> selectSortByTime() {
        return postMybatisDao.selectSortByTime();
    }

    @Override
    public List<Post> selectByKey(String key) {
        return postMybatisDao.selectByKey(key);
    }

    @Override
    public List<Post> selectSortByNum() {
        return postMybatisDao.selectSortByNum();
    }

    @Override
    public Post findOnePostById(int postId) {
        return postMybatisDao.findOnePostById(postId);
    }

    @Override
    public int selectMaxId() {
        return postMybatisDao.selectMaxId();
    }
}
