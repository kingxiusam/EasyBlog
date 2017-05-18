package com.huangdong.dao.inte;

import com.huangdong.bean.Board;

import java.util.List;

/**
 * Created by Administrator on 2017/1/14.
 */
public interface BoardMybatisDao {
    List<Board> findBoardById(int boardId);
    Board findOneBoardById(int boardId);
    void insertOneBoard(Board board);
    void updateBoard(Board board);
}
