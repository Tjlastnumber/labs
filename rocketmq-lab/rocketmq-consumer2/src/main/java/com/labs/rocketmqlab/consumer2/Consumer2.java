package com.labs.rocketmqlab.consumer2;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.MessageModel;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

@Slf4j
//@Component
//@RocketMQMessageListener(topic = "persistence_topic", consumerGroup = "persistence_consumer_group_2", messageModel = MessageModel.BROADCASTING)
public class Consumer2 implements RocketMQListener<String> {

    @Override
    public void onMessage(String message) {
        log.info("==================== Consumer2-2 received message: {}", message);
    }
}
