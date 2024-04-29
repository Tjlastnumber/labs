package com.labs.applicationrunlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ApplicationrunLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationrunLabApplication.class, args);
    }

}
