package com.huangdong.dao.mybatis;

import com.huangdong.bean.Board;
import com.huangdong.dao.BasicDao;

/**
 * Created by Administrator on 2017/1/16.
 *BasicDao的每个子类只编写特定的Dao方法，其他通用的从父类那里继承
 */
public class BoardDao extends BasicDao<Board> {//通过泛型指定类型为Board



}
