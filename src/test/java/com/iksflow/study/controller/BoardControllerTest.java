package com.iksflow.study.controller;

import com.iksflow.study.domain.BoardVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class BoardControllerTest {

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    public void testGetBoard() throws Exception {
        BoardVO board = restTemplate.getForObject("/getBoard", BoardVO.class);
        assertThat("테스터").isEqualTo(board.getWriter());
    }
}
