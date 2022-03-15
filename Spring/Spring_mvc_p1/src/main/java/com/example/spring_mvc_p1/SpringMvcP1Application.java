package com.example.spring_mvc_p1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="com.example.spring_mvc_p1.model")
public class SpringMvcP1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcP1Application.class, args);
    }

}
