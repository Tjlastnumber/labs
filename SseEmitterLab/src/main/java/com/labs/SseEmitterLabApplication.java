package com.labs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@SpringBootApplication
public class SseEmitterLabApplication {

    @Autowired
    private SseEmitterController sseEmitterController;

    public static void main(String[] args) {
        SpringApplication.run(SseEmitterLabApplication.class, args);
    }

    @Scheduled(fixedRate = 5000)
    public void sendMessage() {
        System.out.println("#################### send message ####################");
        sseEmitterController.send("Hello World");
    }

}
