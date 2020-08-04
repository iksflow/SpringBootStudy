package com.iksflow.study;

import com.iksflow.study.controller.BoardController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
// classes속성을 정의하게 되면 해당하는 클래스만 불러온다. 정의하지않으면 모든클래스를 대상으로한다.

@SpringBootTest(classes= BoardController.class, properties = {"author.name=ssi"})
public class PropertiesTest {

    // Environment를 Autowired하면 application.properties의 정보를 가져온다.
    @Autowired
    Environment environment;

    @Test
    public void testMethod() {
        System.out.println("이름 : " + environment.getProperty("author.name"));
        System.out.println("나이 : " + environment.getProperty("author.age"));
        System.out.println("국가 : " + environment.getProperty("author.nation"));
    }
}
