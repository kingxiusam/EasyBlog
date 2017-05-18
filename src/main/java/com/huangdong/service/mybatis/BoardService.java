package com.huangdong.service.mybatis;

import com.huangdong.bean.Board;
import com.huangdong.dao.inte.BoardMybatisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/1/16.
 */

@Transactional
public class BoardService implements BaseBoardService{
    @Autowired
    private BoardMybatisDao boardMybatisDao;
    @Override
    public List<Board> findBoardById(int boardId){
        return boardMybatisDao.findBoardById(boardId);
    }
    @Override
    public Board findOneBoard(int bordId){
        return boardMybatisDao.findOneBoardById(bordId);
    }
    @Override
    public void insertBoard(Board board){
        boardMybatisDao.insertOneBoard(board);
    }
    @Override
    public void updateBoard(Board board){
        boardMybatisDao.updateBoard(board);
    }
}
