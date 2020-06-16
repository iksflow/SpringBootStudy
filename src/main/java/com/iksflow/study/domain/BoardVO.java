package com.iksflow.study.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class BoardVO {
    private int seq;
    private String title;
    private String writer;
    private String content;
    private Date createDate = new Date();
    private int cnt = 0;

    @Builder
    public BoardVO(int seq, String title, String writer, String content, Date createDate, int cnt) {
        this.seq = seq;
        this.title = title;
        this.writer = writer;
        this.content = content;
        this.createDate = createDate;
        this.cnt = cnt;
    }
}
