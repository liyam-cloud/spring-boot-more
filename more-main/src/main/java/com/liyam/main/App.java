package com.liyam.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.liyam.main", "com.liyam.login"})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
