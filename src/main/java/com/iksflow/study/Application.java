package com.iksflow.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
        SpringApplication application = new SpringApplication(Application.class);
        application.setWebApplicationType(WebApplicationType.NONE);       // 웹으로 동작하지 않도록 설정
//        application.setWebApplicationType(WebApplicationType.SERVLET);    // 스프링 MVC를 사용해 웹 애플리케이션을 구동하는 경우 설정
//        application.setWebApplicationType(WebApplicationType.REACTIVE);   // WebFlux를 적용할 때 설정
        application.run(args);
    }
}
