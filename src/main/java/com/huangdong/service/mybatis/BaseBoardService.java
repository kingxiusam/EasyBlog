package com.huangdong.service.mybatis;

import com.huangdong.bean.Board;

import java.util.List;

/**
 * Created by Administrator on 2017/3/3.
 */
public interface BaseBoardService {
    List<Board> findBoardById(int boardId);

    Board findOneBoard(int bordId);

    void insertBoard(Board board);

    void updateBoard(Board board);
}
