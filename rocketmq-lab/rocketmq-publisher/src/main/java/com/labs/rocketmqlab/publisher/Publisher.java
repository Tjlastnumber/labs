package com.labs.rocketmqlab.publisher;


import lombok.RequiredArgsConstructor;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/publisher")
@RestController
@RequiredArgsConstructor
public class Publisher {
    private static int num = 0;

    private final RocketMQTemplate rocketmqTemplate;

    @GetMapping("/send")
    public void send() {
        rocketmqTemplate.convertAndSend("persistence_topic", "test" + num++);
    }
}
