package com.iksflow.study;


import org.apache.tomcat.jni.Thread;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.iksflow.study", "com.iksflow.other"})
public class Application {
    public static void main(String[] args) {
        System.out.println("안녕안녕!!!");
        SpringApplication.run(Application.class, args);
    }
}
