package com.example.consumer.listener;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 * @author liurongqi
 * @since 2021/09/27
 */
@Slf4j
@Service
@RocketMQMessageListener(consumerGroup = "my-consumer_test-topic-1", topic = "test-topic-1")
public class MyConsumer1 implements RocketMQListener<String> {
    @Override
    public void onMessage(String s) {
        log.info("received message: {}", s);
    }
}
