package com.iksflow.study.service;

import com.iksflow.study.domain.BoardVO;

import java.util.List;

public interface BoardService {

    String hello(String name);
    BoardVO getBoard();
    List<BoardVO> getBoardList();
}
