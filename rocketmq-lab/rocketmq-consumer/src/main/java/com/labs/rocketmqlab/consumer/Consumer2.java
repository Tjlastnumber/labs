package com.labs.rocketmqlab.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.MessageModel;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RocketMQMessageListener(topic = "persistence_topic", consumerGroup = "persistence_consumer_group")
public class Consumer2 implements RocketMQListener<String> {

    @Override
    public void onMessage(String message) {
        System.out.println("==================== Consumer1-2 received message: " + message);
    }
}
