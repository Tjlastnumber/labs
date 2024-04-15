package com.labs.quartzlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class QuartzLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuartzLabApplication.class, args);
    }

}
