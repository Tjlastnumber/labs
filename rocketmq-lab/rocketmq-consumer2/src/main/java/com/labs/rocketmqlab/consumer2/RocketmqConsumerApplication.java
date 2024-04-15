package com.labs.rocketmqlab.consumer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.labs.rocketmqlab")
public class RocketmqConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RocketmqConsumerApplication.class, args);
    }

}
