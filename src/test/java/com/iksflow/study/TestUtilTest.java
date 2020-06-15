package com.iksflow.study;

import com.iksflow.study.util.TestUtil;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestUtilTest {

    @Test
    public void test_UUID생성테스트() {
        TestUtil util = new TestUtil();
        String uuid = util.createUuid();
        if (true) {
            uuid = "";
        }
        assertThat(uuid.replace("-", "").length()).isEqualTo(32);
    }
}
