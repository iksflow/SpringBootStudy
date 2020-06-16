package com.iksflow.study.controller;

import com.iksflow.study.domain.BoardVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class BoardController {

    public BoardController() {
        System.out.println("===> BootController 생성");
    }

    @GetMapping("/hello")
    public BoardVO hello(String name) {
        BoardVO board = BoardVO.builder()
                .seq(1)
                .title("테스트제목")
                .writer("테스터")
                .content("테스트내용")
                .createDate(new Date())
                .cnt(0)
                .build();


        return board;
    }
    @PostMapping("/hello")
    public String helloPost(String name) {
        return "Hello : " + name;
    }
}
