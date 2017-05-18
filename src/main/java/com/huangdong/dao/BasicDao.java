package com.huangdong.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by Administrator on 2017/1/16.
 *     配置了访问数据库的模板类并已注入工产依赖可使用本类进行数据库的基本操作
 */
public class BasicDao<T> {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public BasicDao(){
        Type genType=getClass().getGenericSuperclass();//获取子类对应的父类类型
        Type[] params=((ParameterizedType)genType).getActualTypeArguments();//获取类型参数数组
        Class entityClass = (Class) params[0];
    }

    public T getOne(String sqlStr){
        return sqlSessionTemplate.selectOne(sqlStr);
    }

    public <E> List<E> getList(String sqlStr){
       return sqlSessionTemplate.selectList(sqlStr);
    }


    public void insert(String sqlStr){
        sqlSessionTemplate.insert(sqlStr);
    }

    public void update(String sqlStr){
        sqlSessionTemplate.update(sqlStr);
    }


    public SqlSessionTemplate getSqlSessionTemplate(){
        return sqlSessionTemplate;
    }

    public void delete(String sqlStr){
        sqlSessionTemplate.delete(sqlStr);
    }



}
