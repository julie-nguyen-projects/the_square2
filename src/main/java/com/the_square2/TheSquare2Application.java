package com.the_square2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;


@Configuration
@ComponentScan
@EnableAutoConfiguration
public class TheSquare2Application {

    public static void main(String[] args) {
        SpringApplication.run(TheSquare2Application.class, args);
    }

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello";
    }
}
