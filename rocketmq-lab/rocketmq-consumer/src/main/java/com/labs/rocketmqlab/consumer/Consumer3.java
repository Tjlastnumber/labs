package com.labs.rocketmqlab.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.apache.rocketmq.spring.core.RocketMQPushConsumerLifecycleListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RocketMQMessageListener(topic = "persistence_topic", consumerGroup = "persistence_consumer_group", maxReconsumeTimes = 3)
public class Consumer3 implements RocketMQListener<String>{

    @Override
    public void onMessage(String message) {
        try {
//            throw new RuntimeException();
            System.out.println("==================== Consumer1-3 received message: " + message);
        } catch (Exception e) {
            System.out.println("==================== Consumer1-3 reply received message: " + message);
            throw new RuntimeException();
        }
    }
}
