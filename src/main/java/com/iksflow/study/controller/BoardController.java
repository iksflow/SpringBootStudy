package com.iksflow.study.controller;

import com.iksflow.study.domain.BoardVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class BoardController {

    public BoardController() {
        // 1236을 포함하고있으면 재시작을 안함
        System.out.println("===> BootController 생성1237");
    }

    @GetMapping("/getBoard")
    public BoardVO getBoard(String name) {
        BoardVO board = BoardVO.builder()
                .seq(1)
                .title("테스트제목4444")
                .writer("테스터")
                .content("테스트내용")
                .createDate(new Date())
                .cnt(0)
                .build();

        return board;
    }

    @GetMapping("/getBoardList")
    public List<BoardVO> getBoardList() {
        List<BoardVO> boardList = new ArrayList<BoardVO>();
        for (int i = 1; i <= 10; i++) {
            BoardVO board = BoardVO.builder()
                    .seq(i)
                    .title("테스트제목 " + i)
                    .writer("테스터")
                    .content(i + " 번째 테스트내용")
                    .createDate(new Date())
                    .cnt(0)
                    .build();
            boardList.add(board);
        }

        return boardList;
    }

    @PostMapping("/hello")
    public String helloPost(String name) {
        return "Hello : " + name;
    }
}
